

package customer.cap_openapi.generated.authorization.api;

import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;
import com.sap.cloud.sdk.services.openapi.core.OpenApiResponse;
import com.sap.cloud.sdk.services.openapi.core.AbstractOpenApiService;
import com.sap.cloud.sdk.services.openapi.apiclient.ApiClient;

import customer.cap_openapi.generated.authorization.model.Role ; //NOPMD
import customer.cap_openapi.generated.authorization.model.RoleUpdate ; //NOPMD

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

public class RolesApi extends AbstractOpenApiService {
    /**
    * Instantiates this API class to invoke operations on the Authorization.
    *
    * @param httpDestination The destination that API should be used with
    */
    public RolesApi( @Nonnull final HttpDestinationProperties httpDestination )
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
    public RolesApi( @Nonnull final ApiClient apiClient )
    {
         super(apiClient);
    }

        /**
    * <p>Creates a role for an application.</p>
     *<p>Create a role for an application based on a role template. You must define the role name and description as well as identify the application and the role template name that you want to include in the role. The role inherits the scopes of the role template. Refer to the model below to see limitations for individual parameter values.</p>
     * <p><b>200</b> - OK - The API returns the role that the API created.
     * <p><b>201</b> - Created - The API created the role.
     * <p><b>400</b> - Bad Request - Your request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found.
     * <p><b>409</b> - Conflict.
* @param role
        The content of the role, including a name, description, the role template, and the application that defines the role template.
* @return Role
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public Role createRole( @Nonnull final Role role) throws OpenApiRequestException {
        final Object localVarPostBody = role;
        
        // verify the required parameter 'role' is set
        if (role == null) {
            throw new OpenApiRequestException("Missing the required parameter 'role' when calling createRole");
        }
        
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/apps/roles").build().toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "apiaccess" };

        final ParameterizedTypeReference<Role> localVarReturnType = new ParameterizedTypeReference<Role>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
    * <p>Deletes a role.</p>
     *<p>Deletes a role specified by the application ID, role template name, and role name.</p>
     * <p><b>200</b> - OK - The API deleted the role.
     * <p><b>204</b> - No Content - The role doesn&#39;t exist.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No application IDs, role template names, or role names could be found that match your request.
* @param appId
        The application ID is the xsappname plus the identifier, which consists of an exclamation mark (!), an identifier for the plan underwhich the application is deployed, and an index number.
* @param roleName
        The name of the role.
* @param templateName
        The name of the role template.
* @return Object
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public Object deleteRoleByRoleName( @Nonnull final String appId,  @Nonnull final String roleName,  @Nonnull final String templateName) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new OpenApiRequestException("Missing the required parameter 'appId' when calling deleteRoleByRoleName");
        }
        
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleName' when calling deleteRoleByRoleName");
        }
        
        // verify the required parameter 'templateName' is set
        if (templateName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'templateName' when calling deleteRoleByRoleName");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("appId", appId);
        localVarPathParams.put("roleName", roleName);
        localVarPathParams.put("templateName", templateName);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/apps/{appId}/roletemplates/{templateName}/roles/{roleName}").buildAndExpand(localVarPathParams).toUriString();

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

        final ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
    * <p>Returns the role of an application.</p>
     *<p>Returns the information about a role specified by the application ID, role template, and role name. The information includes the scopes contained in the role.</p>
     * <p><b>200</b> - OK - The API returned information about the role.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: One of the search parameters application ID, role template name, or role name could be found in your request.
* @param appId
        The application ID of the application.
* @param roleName
        Name of the role.
* @param templateName
        Name of the role template.
* @return Role
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public Role getRoleByAppAndRoleTemplate( @Nonnull final String appId,  @Nonnull final String roleName,  @Nonnull final String templateName) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new OpenApiRequestException("Missing the required parameter 'appId' when calling getRoleByAppAndRoleTemplate");
        }
        
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleName' when calling getRoleByAppAndRoleTemplate");
        }
        
        // verify the required parameter 'templateName' is set
        if (templateName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'templateName' when calling getRoleByAppAndRoleTemplate");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("appId", appId);
        localVarPathParams.put("roleName", roleName);
        localVarPathParams.put("templateName", templateName);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/apps/{appId}/roletemplates/{templateName}/roles/{roleName}").buildAndExpand(localVarPathParams).toUriString();

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

        final ParameterizedTypeReference<Role> localVarReturnType = new ParameterizedTypeReference<Role>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
    * <p>Returns the roles of all service instances.</p>
     *<p>Returns all application roles for all service instances, which are registered at UAA as OAuth2 client. The roles that are returned are limited to the subaccount credentials that are used for this request.</p>
     * <p><b>200</b> - OK - The API returned the roles.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons, no roles could be found.
* @return List&lt;Role&gt;
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public List<Role> getRoles() throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/roles").build().toUriString();

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

        final ParameterizedTypeReference<List<Role>> localVarReturnType = new ParameterizedTypeReference<List<Role>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
    * <p>Returns the roles of an application.</p>
     *<p>Returns all roles of an application specified by the application ID.</p>
     * <p><b>200</b> - OK - The API returned the list of roles.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No application could be found that matches your request.
* @param appId
        The application ID of the application to check for roles.
* @return List&lt;Role&gt;
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public List<Role> getRolesByAppId( @Nonnull final String appId) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new OpenApiRequestException("Missing the required parameter 'appId' when calling getRolesByAppId");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("appId", appId);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/apps/{appId}/roles").buildAndExpand(localVarPathParams).toUriString();

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

        final ParameterizedTypeReference<List<Role>> localVarReturnType = new ParameterizedTypeReference<List<Role>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
    * <p>Updates a role.</p>
     *<p>Update the description of a role specified by application ID, role template name, and role name. Refer to the model below to see limitations for individual parameter values.</p>
     * <p><b>200</b> - OK - The API updated and returned the role.
     * <p><b>201</b> - Created - The API updated and returned the role.
     * <p><b>400</b> - Bad Request - Your request was poorly formed or the role is read-only.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No application IDs, role template names, or role names could be found that match your request.
     * <p><b>409</b> - Conflict.
* @param appId
        The application ID is the xsappname plus the identifier, which consists of an exclamation mark (!), an identifier for the plan underwhich the application is deployed, and an index number.
* @param roleName
        The name of the role.
* @param templateName
        The Name of the role template.
* @param roleImport
        The content of the role. You can change the description.
* @return Role
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public Role updateRole( @Nonnull final String appId,  @Nonnull final String roleName,  @Nonnull final String templateName,  @Nonnull final RoleUpdate roleImport) throws OpenApiRequestException {
        final Object localVarPostBody = roleImport;
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new OpenApiRequestException("Missing the required parameter 'appId' when calling updateRole");
        }
        
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleName' when calling updateRole");
        }
        
        // verify the required parameter 'templateName' is set
        if (templateName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'templateName' when calling updateRole");
        }
        
        // verify the required parameter 'roleImport' is set
        if (roleImport == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleImport' when calling updateRole");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("appId", appId);
        localVarPathParams.put("roleName", roleName);
        localVarPathParams.put("templateName", templateName);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/apps/{appId}/roletemplates/{templateName}/roles/{roleName}").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "apiaccess" };

        final ParameterizedTypeReference<Role> localVarReturnType = new ParameterizedTypeReference<Role>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
