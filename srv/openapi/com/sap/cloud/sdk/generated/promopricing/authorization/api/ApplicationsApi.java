

package com.sap.cloud.sdk.generated.promopricing.authorization.api;

import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;
import com.sap.cloud.sdk.services.openapi.core.OpenApiResponse;
import com.sap.cloud.sdk.services.openapi.core.AbstractOpenApiService;
import com.sap.cloud.sdk.services.openapi.apiclient.ApiClient;

import com.sap.cloud.sdk.generated.promopricing.authorization.model.App ; //NOPMD
import com.sap.cloud.sdk.generated.promopricing.authorization.model.RoleCollection ; //NOPMD
import com.sap.cloud.sdk.generated.promopricing.authorization.model.Scope ; //NOPMD
import com.sap.cloud.sdk.generated.promopricing.authorization.model.Subscriptions ; //NOPMD

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.common.annotations.Beta;

import com.sap.cloud.sdk.cloudplatform.connectivity.HttpDestinationProperties;

/**
* Authorization in version 1.0.0.
*
* Provides functions to administrate the Authorization and Trust Management service (XSUAA) of SAP BTP, Cloud Foundry environment. You can manage service instances of the Authorization and Trust Management service. You can also manage roles, role templates, and role collections of your subaccount.
*/

public class ApplicationsApi extends AbstractOpenApiService {
    /**
    * Instantiates this API class to invoke operations on the Authorization.
    *
    * @param httpDestination The destination that API should be used with
    */
    public ApplicationsApi( @Nonnull final HttpDestinationProperties httpDestination )
    {
        super(httpDestination);
    }

    /**
    * Instantiates this API class to invoke operations on the Authorization based on a given {@link ApiClient}.
    *
    * @param apiClient
    *            ApiClient to invoke the API on
    */
    @Beta
    public ApplicationsApi( @Nonnull final ApiClient apiClient )
    {
         super(apiClient);
    }

    
    /**
     * <p>Returns information about an XSUAA application instance.</p>
     *<p>Returns information about an XSUAA application instance specified by the app ID or service instance ID. The XSUAA application instance paired with the information about its OAuth client defines a service instance of the Authorization and Trust Management service.</p>
     * <p><b>200</b> - OK - The API returned the information about the XSUAA application instance.
     * <p><b>400</b> - Bad Request - Your request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No XSUAA application instance or service instance could be found that match your request.
     * @param id  (required)
        The ID of the application or service instance. To use service instance ID, set the isServiceInstanceId parameter to true.
     * @param hideDetails  (optional, default to false)
        If this parameter is set to true, then the API only returns basic information about the app instance. The basic information doesn&#39;t include authorization information like role template, scope, and authority information.
     * @param isServiceInstanceId  (optional, default to false)
        If the parameter is set to true, the ID set in the path is interpreted as the service instance ID and not the XSUAA application instance ID.
     * @return App
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable  public App getAppById( @Nonnull final String id,  @Nullable final Boolean hideDetails,  @Nullable final Boolean isServiceInstanceId) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new OpenApiRequestException("Missing the required parameter 'id' when calling getAppById");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("id", id);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/apps/{id}").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "hideDetails", hideDetails));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "isServiceInstanceId", isServiceInstanceId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "apiaccess" };

        final ParameterizedTypeReference<App> localVarReturnType = new ParameterizedTypeReference<App>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
    * <p>Returns information about an XSUAA application instance.</p>
     *<p>Returns information about an XSUAA application instance specified by the app ID or service instance ID. The XSUAA application instance paired with the information about its OAuth client defines a service instance of the Authorization and Trust Management service.</p>
     * <p><b>200</b> - OK - The API returned the information about the XSUAA application instance.
     * <p><b>400</b> - Bad Request - Your request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No XSUAA application instance or service instance could be found that match your request.
* @param id
        The ID of the application or service instance. To use service instance ID, set the isServiceInstanceId parameter to true.
* @return App
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public App getAppById( @Nonnull final String id) throws OpenApiRequestException {
        return getAppById(id, null, null);
    }

    /**
     * <p>Returns usage information for the service instance that is used to execute this API access.</p>
     *<p>Returns the number of subscribers for the service instance, which is associated with the OAuth token you submitted with this REST call. Include the tenant or zone ID of your subaccount as a URL parameter.</p>
     * <p><b>200</b> - OK - The API returned the usage information for the service instance.
     * <p><b>400</b> - Bad Request - Invalid tenant
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons, apps could be found that match your request.
     * @param tenant  (required)
        Tenant ID of your subaccount. The zoneId parameter is the same ID and can be used interchangably with tenant ID. For example, tenant&#x3D;11a0bbba-6e3e-4460-8cf8-702803a9b12b.
     * @param listSubscriptions  (optional)
        Set this parameter to true list the details of subscriptions of your multitenant application.
     * @param listCloneSubscriptions  (optional)
        Only relevant for reuse instances. Set this parameter to true to list details of following instances of your service instance, which uses the broker plan.
     * @return Subscriptions
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable  public Subscriptions getAppByToken( @Nonnull final String tenant,  @Nullable final String listSubscriptions,  @Nullable final String listCloneSubscriptions) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'tenant' is set
        if (tenant == null) {
            throw new OpenApiRequestException("Missing the required parameter 'tenant' when calling getAppByToken");
        }
        
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/ownapp/usage").build().toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "tenant", tenant));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "listSubscriptions", listSubscriptions));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "listCloneSubscriptions", listCloneSubscriptions));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "apiaccess" };

        final ParameterizedTypeReference<Subscriptions> localVarReturnType = new ParameterizedTypeReference<Subscriptions>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
    * <p>Returns usage information for the service instance that is used to execute this API access.</p>
     *<p>Returns the number of subscribers for the service instance, which is associated with the OAuth token you submitted with this REST call. Include the tenant or zone ID of your subaccount as a URL parameter.</p>
     * <p><b>200</b> - OK - The API returned the usage information for the service instance.
     * <p><b>400</b> - Bad Request - Invalid tenant
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons, apps could be found that match your request.
* @param tenant
        Tenant ID of your subaccount. The zoneId parameter is the same ID and can be used interchangably with tenant ID. For example, tenant&#x3D;11a0bbba-6e3e-4460-8cf8-702803a9b12b.
* @return Subscriptions
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public Subscriptions getAppByToken( @Nonnull final String tenant) throws OpenApiRequestException {
        return getAppByToken(tenant, null, null);
    }

    /**
     * <p>Returns registered service instances of the current subaccount.</p>
     *<p>Returns all service instances of the current subaccount, which are registered at the Authorization and Trust Management service with OAuth 2.0 clients. The system provides information about the XSUAA application and its OAuth client.</p>
     * <p><b>200</b> - OK - The API returned the list of registered service instances.
     * <p><b>400</b> - Bad Request - Your request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No service instances could be found that match your request.
     * @param onlyForOrgId  (optional, default to *)
        Set to return only apps that reside in the specified Cloud Foundry org. For example, xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx. Note that Cloud Foundry orgs and SAP BTP subaccounts have a 1:1 relationship.
     * @param onlyWithClientId  (optional, default to true)
        Set to false to return apps that aren&#39;t associated with an OAuth client.
     * @return List&lt;App&gt;
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable  public List<App> getApps( @Nullable final String onlyForOrgId,  @Nullable final Boolean onlyWithClientId) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/apps").build().toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "onlyForOrgId", onlyForOrgId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "onlyWithClientId", onlyWithClientId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "apiaccess" };

        final ParameterizedTypeReference<List<App>> localVarReturnType = new ParameterizedTypeReference<List<App>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
    * <p>Returns registered service instances of the current subaccount.</p>
     *<p>Returns all service instances of the current subaccount, which are registered at the Authorization and Trust Management service with OAuth 2.0 clients. The system provides information about the XSUAA application and its OAuth client.</p>
     * <p><b>200</b> - OK - The API returned the list of registered service instances.
     * <p><b>400</b> - Bad Request - Your request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No service instances could be found that match your request.
* @return List&lt;App&gt;
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public List<App> getApps() throws OpenApiRequestException {
        return getApps(null, null);
    }

    /**
     * <p>Returns a list of authorities granted to an application.</p>
     *<p>Returns a list of authorities that have been granted to an application protected by the service instance of the Authorization and Trust Management service. Identify a granting application by the grantedByAppGuid or grantedByAppId parameter. If you don&#39;t specify a granting application, the list is empty.</p>
     * <p><b>200</b> - OK - The API returned the list of authorities granted to the specified application.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No application could be found that matches your request.
     * @param appId  (required)
        The application ID of the application to check for granted authorities. This ID identifies the application receiving the authorities from another application.
     * @param grantedByAppGuid  (optional)
        The application GUID of the application granting the authorities. If you don&#39;t identify a granting application, the list is empty.
     * @param grantedByAppId  (optional)
        The application ID of the application granting authorities. If you don&#39;t identify a granting application, the list is empty.
     * @return List&lt;String&gt;
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable  public List<String> getGrantedAuthorities( @Nonnull final String appId,  @Nullable final String grantedByAppGuid,  @Nullable final String grantedByAppId) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new OpenApiRequestException("Missing the required parameter 'appId' when calling getGrantedAuthorities");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("appId", appId);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/apps/{appId}/authorities").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "grantedByAppGuid", grantedByAppGuid));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "grantedByAppId", grantedByAppId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "apiaccess" };

        final ParameterizedTypeReference<List<String>> localVarReturnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
    * <p>Returns a list of authorities granted to an application.</p>
     *<p>Returns a list of authorities that have been granted to an application protected by the service instance of the Authorization and Trust Management service. Identify a granting application by the grantedByAppGuid or grantedByAppId parameter. If you don&#39;t specify a granting application, the list is empty.</p>
     * <p><b>200</b> - OK - The API returned the list of authorities granted to the specified application.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No application could be found that matches your request.
* @param appId
        The application ID of the application to check for granted authorities. This ID identifies the application receiving the authorities from another application.
* @return List&lt;String&gt;
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public List<String> getGrantedAuthorities( @Nonnull final String appId) throws OpenApiRequestException {
        return getGrantedAuthorities(appId, null, null);
    }
    /**
    * <p>Returns information about the service instance used to execute this API access.</p>
     *<p>Returns information about the service instance, which is associated with the client credentials you submitted with this REST call.</p>
     * <p><b>200</b> - OK - The API returned the service instance associated with your client credentials.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No service instance was found matching your client credentials.
* @return App
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public App getOwnApp() throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/ownapp").build().toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "apiaccess" };

        final ParameterizedTypeReference<App> localVarReturnType = new ParameterizedTypeReference<App>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
    * <p>Returns role collections referencing a role, application ID, and a role template.</p>
     *<p>Returns information about all role collections containing a specific role. The role is identified by application ID, the name of the role template, and role name.</p>
     * <p><b>200</b> - OK - The API returned role collections that use the specified role.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No role could be found that matches your request.
* @param appId
        The ID of the application of the role.
* @param roleName
        The name of the role.
* @param roleTemplateName
        The name of the role template.
* @return List&lt;RoleCollection&gt;
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public List<RoleCollection> getRoleCollectionsByAppIdTemplateNameAndRoleName( @Nonnull final String appId,  @Nonnull final String roleName,  @Nonnull final String roleTemplateName) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new OpenApiRequestException("Missing the required parameter 'appId' when calling getRoleCollectionsByAppIdTemplateNameAndRoleName");
        }
        
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleName' when calling getRoleCollectionsByAppIdTemplateNameAndRoleName");
        }
        
        // verify the required parameter 'roleTemplateName' is set
        if (roleTemplateName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleTemplateName' when calling getRoleCollectionsByAppIdTemplateNameAndRoleName");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("appId", appId);
        localVarPathParams.put("roleName", roleName);
        localVarPathParams.put("roleTemplateName", roleTemplateName);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/rolecollections/roles/{appId}/{roleTemplateName}/{roleName}").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "apiaccess" };

        final ParameterizedTypeReference<List<RoleCollection>> localVarReturnType = new ParameterizedTypeReference<List<RoleCollection>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
    * <p>Returns the scope of an application.</p>
     *<p>Returns information about a specific scope of a specific application.</p>
     * <p><b>200</b> - OK - The API returned the scope of the specified application.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No service instance or scope could be found that match your request.
* @param appId
        The application ID of the application to check for scopes. The application ID is the xsappname plus the identifier, which consists of an exclamation mark (!), an identifier for the plan underwhich the application is deployed, and an index number.
* @param scopeName
        Name of the scope.
* @return Scope
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public Scope getScope( @Nonnull final String appId,  @Nonnull final String scopeName) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new OpenApiRequestException("Missing the required parameter 'appId' when calling getScope");
        }
        
        // verify the required parameter 'scopeName' is set
        if (scopeName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'scopeName' when calling getScope");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("appId", appId);
        localVarPathParams.put("scopeName", scopeName);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/apps/{appId}/scopes/{scopeName}").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "apiaccess" };

        final ParameterizedTypeReference<Scope> localVarReturnType = new ParameterizedTypeReference<Scope>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
    * <p>Returns the scopes of an application.</p>
     *<p>Returns all scopes of an application protected by a service instance of the Authorization and Trust Management service. ID.</p>
     * <p><b>200</b> - OK - The API returned the scopes of the specified application.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No applications could be found that match your request.
* @param appId
        The application ID of the application to check for scopes. The application ID is the xsappname plus the identifier, which consists of an exclamation mark (!), an identifier for the plan underwhich the application is deployed, and an index number.
* @return List&lt;Scope&gt;
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public List<Scope> listScopes( @Nonnull final String appId) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new OpenApiRequestException("Missing the required parameter 'appId' when calling listScopes");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("appId", appId);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/apps/{appId}/scopes").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "apiaccess" };

        final ParameterizedTypeReference<List<Scope>> localVarReturnType = new ParameterizedTypeReference<List<Scope>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
