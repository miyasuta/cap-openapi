package customer.cap_openapi.handlers;

import org.springframework.stereotype.Component;

import com.sap.cds.services.handler.annotations.On;
import com.sap.cds.services.handler.annotations.ServiceName;
import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;
import com.sap.cloud.sdk.cloudplatform.connectivity.HttpDestination;

import customer.cap_openapi.generated.authorization.api.RoleCollectionsApi;
import cds.gen.authorizationservice.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@ServiceName(AuthorizationService_.CDS_NAME)
class AuthorizationServiceHandler {

    Logger logger = LoggerFactory.getLogger(AuthorizationServiceHandler.class);
    
    @On(event = GetRoleCollectionsContext.CDS_NAME)
    public void getRoleCollections(GetRoleCollectionsContext context) {
        logger.info("getRoleCollection handler");

        HttpDestination destination = DestinationAccessor.getDestination("xsuaa").asHttp();
        // RoleCollectionsApi rolecollectionApi = new RoleCollectionsApi(destination);
        
    }
}
