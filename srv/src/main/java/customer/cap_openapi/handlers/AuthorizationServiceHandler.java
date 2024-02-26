package customer.cap_openapi.handlers;

import org.springframework.stereotype.Component;

import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.On;
import com.sap.cds.services.handler.annotations.ServiceName;
import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;
import com.sap.cloud.sdk.cloudplatform.connectivity.HttpDestination;

import customer.openapi.generated.authorization.api.RoleCollectionsApi;
import customer.openapi.generated.authorization.model.RoleCollection;
import customer.openapi.generated.authorization.model.RoleCollectionImport;
import cds.gen.SimpleRoleCollection;
import cds.gen.authorizationservice.AuthorizationService_;
import cds.gen.authorizationservice.GetRoleCollectionsContext;
import cds.gen.authorizationservice.CreateRoleCollectionContext;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@ServiceName(AuthorizationService_.CDS_NAME)
class AuthorizationServiceHandler implements EventHandler{

    Logger logger = LoggerFactory.getLogger(AuthorizationServiceHandler.class);
    HttpDestination destination = DestinationAccessor.getDestination("xsuaa").asHttp();
    RoleCollectionsApi rolecollectionApi = new RoleCollectionsApi(destination);

    AuthorizationServiceHandler() {
    }   

    @On(event = GetRoleCollectionsContext.CDS_NAME)
    public void getRoleCollections(GetRoleCollectionsContext context) {
        logger.info("getRoleCollection handler");
        //Send request
        List<RoleCollection> response = rolecollectionApi.getRoleCollections();
        
        //Map response to SimpleRoleCollection Type
        List<SimpleRoleCollection> roleCollections = response.stream()
                .map(roleCollection -> {
                    SimpleRoleCollection simpleRoleCollection = SimpleRoleCollection.create();
                    simpleRoleCollection.setName(roleCollection.getName());
                    simpleRoleCollection.setDescription(roleCollection.getDescription());
                    return simpleRoleCollection;
                })
                .collect(Collectors.toList());
        context.setResult(roleCollections);
    }

    @On(event = CreateRoleCollectionContext.CDS_NAME)
    public void createRoleCollection(CreateRoleCollectionContext context) {
        logger.info("createRoleCollection handler");
        //Map input to RoleCollectionImport Type
        RoleCollectionImport roleCollection = new RoleCollectionImport();
        roleCollection.setName(context.getRoleCollection().getName());
        roleCollection.setDescription(context.getRoleCollection().getDescription());
        
        //Send request
        RoleCollection created = rolecollectionApi.createRoleCollection(roleCollection);
        
        //Map response to SimpleRoleCollection Type
        SimpleRoleCollection simpleRoleCollection = SimpleRoleCollection.create();
        simpleRoleCollection.setName(created.getName());
        simpleRoleCollection.setDescription(created.getDescription());
        context.setResult(simpleRoleCollection);
    }
}
