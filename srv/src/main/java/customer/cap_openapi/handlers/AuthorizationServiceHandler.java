package customer.cap_openapi.handlers;

import org.springframework.stereotype.Component;

import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.On;
import com.sap.cds.services.handler.annotations.ServiceName;
import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;
import com.sap.cloud.sdk.cloudplatform.connectivity.HttpDestination;

import customer.cap_openapi.generated.authorization.api.RoleCollectionsApi;
import customer.cap_openapi.generated.authorization.model.RoleCollection;
import cds.gen.SimpleRoleCollection;
import cds.gen.authorizationservice.AuthorizationService_;
import cds.gen.authorizationservice.GetRoleCollectionsContext;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@ServiceName(AuthorizationService_.CDS_NAME)
class AuthorizationServiceHandler implements EventHandler{

    private final Logger logger;

    AuthorizationServiceHandler() {
        this.logger = LoggerFactory.getLogger(AuthorizationServiceHandler.class);
        this.logger.info("AuthorizationServiceHandler initialized");
    }   

    @On(event = GetRoleCollectionsContext.CDS_NAME)
    public void getRoleCollections(GetRoleCollectionsContext context) {
        logger.info("getRoleCollection handler");

        HttpDestination destination = DestinationAccessor.getDestination("xsuaa").asHttp();
        RoleCollectionsApi rolecollectionApi = new RoleCollectionsApi(destination);
        List<RoleCollection> response = rolecollectionApi.getRoleCollections();
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
}
