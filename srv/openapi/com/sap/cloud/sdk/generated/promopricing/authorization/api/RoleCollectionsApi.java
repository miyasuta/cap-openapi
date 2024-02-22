

package com.sap.cloud.sdk.generated.promopricing.authorization.api;

import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;
import com.sap.cloud.sdk.services.openapi.core.OpenApiResponse;
import com.sap.cloud.sdk.services.openapi.core.AbstractOpenApiService;
import com.sap.cloud.sdk.services.openapi.apiclient.ApiClient;

import com.sap.cloud.sdk.generated.promopricing.authorization.model.Role ; //NOPMD
import com.sap.cloud.sdk.generated.promopricing.authorization.model.RoleCollection ; //NOPMD
import com.sap.cloud.sdk.generated.promopricing.authorization.model.RoleCollectionDescription ; //NOPMD
import com.sap.cloud.sdk.generated.promopricing.authorization.model.RoleCollectionImport ; //NOPMD
import com.sap.cloud.sdk.generated.promopricing.authorization.model.RoleReference ; //NOPMD

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

public class RoleCollectionsApi extends AbstractOpenApiService {
    /**
    * Instantiates this API class to invoke operations on the Authorization.
    *
    * @param httpDestination The destination that API should be used with
    */
    public RoleCollectionsApi( @Nonnull final HttpDestinationProperties httpDestination )
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
    public RoleCollectionsApi( @Nonnull final ApiClient apiClient )
    {
         super(apiClient);
    }

        /**
    * <p>Adds a role to role a collection.</p>
     *<p>Adds a role reference, specified by role name, application ID, and role template name, to a role collection.</p>
     * <p><b>200</b> - OK - The API updated the role collection with the specified role.
     * <p><b>201</b> - Created - The API updated the role collection with the specified role.
     * <p><b>400</b> - Bad Request - The request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No role collection or role could be found that matches your request.
* @param roleCollectionName
        The name of the role collection to update. The name has a maximum length of 64 characters.
* @param roleName
        The name of the role to add to the role collection.
* @param roleTemplateAppID
        The application ID, with which the role is associated. The application ID is the xsappname plus the identifier, which consists of an exclamation mark (!), an identifier for the plan underwhich the application is deployed, and an index number.
* @param roleTemplateName
        The name of the role template, with which the role is associated.
* @return Object
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public Object addRoleToRoleCollection( @Nonnull final String roleCollectionName,  @Nonnull final String roleName,  @Nonnull final String roleTemplateAppID,  @Nonnull final String roleTemplateName) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'roleCollectionName' is set
        if (roleCollectionName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleCollectionName' when calling addRoleToRoleCollection");
        }
        
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleName' when calling addRoleToRoleCollection");
        }
        
        // verify the required parameter 'roleTemplateAppID' is set
        if (roleTemplateAppID == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleTemplateAppID' when calling addRoleToRoleCollection");
        }
        
        // verify the required parameter 'roleTemplateName' is set
        if (roleTemplateName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleTemplateName' when calling addRoleToRoleCollection");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("roleCollectionName", roleCollectionName);
        localVarPathParams.put("roleName", roleName);
        localVarPathParams.put("roleTemplateAppID", roleTemplateAppID);
        localVarPathParams.put("roleTemplateName", roleTemplateName);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/rolecollections/{roleCollectionName}/roles/{roleTemplateAppID}/{roleName}/{roleTemplateName}").buildAndExpand(localVarPathParams).toUriString();

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
        return apiClient.invokeAPI(localVarPath, HttpMethod.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
    * <p>Adds roles to a role collection.</p>
     *<p>Updates a role collection with an array of roles. Specify the roles by role name, application ID, and role template name. These roles are added to the roles already included in the role collection.</p>
     * <p><b>200</b> - OK - The API updated the role collection with the specified roles.
     * <p><b>201</b> - Created - The API updated the role collection with the specified roles.
     * <p><b>400</b> - Bad Request - The request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No role collection or role could be found that matches your request.
* @param roleCollectionName
        The name of the role collection to update.
* @param roleReferences
        The list of role references in an array, specified by the role name, application ID, and role template name.
* @return Object
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public Object addRolesToRoleCollection( @Nonnull final String roleCollectionName,  @Nonnull final List<RoleReference> roleReferences) throws OpenApiRequestException {
        final Object localVarPostBody = roleReferences;
        
        // verify the required parameter 'roleCollectionName' is set
        if (roleCollectionName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleCollectionName' when calling addRolesToRoleCollection");
        }
        
        // verify the required parameter 'roleReferences' is set
        if (roleReferences == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleReferences' when calling addRolesToRoleCollection");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("roleCollectionName", roleCollectionName);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/rolecollections/{roleCollectionName}/roles").buildAndExpand(localVarPathParams).toUriString();

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

        final ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Returns a page of role collections.</p>
     *<p>Returns the specified page of role collection search result. The role collections are the result of a previous paged GET request for role collections of the current subaccount.</p>
     * <p><b>200</b> - OK - The API returned a page of role collection information.
     * <p><b>400</b> - Bad Request - The request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons, no role collections could be found that match your request.
     * @param pageId  (required)
        The ID of a paged search result. The initial page of a result is 0. The following pages are identified by a sequential integer.
     * @param showGroups  (optional, default to false)
        Set this parameter to true, to include the groups, to which the role collections are assigned.
     * @param showRoles  (optional, default to true)
        Set this parameter to true, to include the roles, which are associated with the roles collections.
     * @param showUsers  (optional, default to false)
        Set this parameter to true, to include the users, to whom the role collections are assigned.
     * @return List&lt;RoleCollection&gt;
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable  public List<RoleCollection> call2( @Nonnull final Integer pageId,  @Nullable final Boolean showGroups,  @Nullable final Boolean showRoles,  @Nullable final Boolean showUsers) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'pageId' is set
        if (pageId == null) {
            throw new OpenApiRequestException("Missing the required parameter 'pageId' when calling call2");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("pageId", pageId);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/rolecollections/pages/{pageId}").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "showGroups", showGroups));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "showRoles", showRoles));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "showUsers", showUsers));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "apiaccess" };

        final ParameterizedTypeReference<List<RoleCollection>> localVarReturnType = new ParameterizedTypeReference<List<RoleCollection>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
    * <p>Returns a page of role collections.</p>
     *<p>Returns the specified page of role collection search result. The role collections are the result of a previous paged GET request for role collections of the current subaccount.</p>
     * <p><b>200</b> - OK - The API returned a page of role collection information.
     * <p><b>400</b> - Bad Request - The request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons, no role collections could be found that match your request.
* @param pageId
        The ID of a paged search result. The initial page of a result is 0. The following pages are identified by a sequential integer.
* @return List&lt;RoleCollection&gt;
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public List<RoleCollection> call2( @Nonnull final Integer pageId) throws OpenApiRequestException {
        return call2(pageId, null, null, null);
    }
    /**
    * <p>Updates the description of a role collection.</p>
     *<p>Updates the description of a role collection specified by the name of the role collection. You can&#39;t change any other attribute of the role collection. Refer to the model below to see limitations for individual parameter values.</p>
     * <p><b>200</b> - OK - The API updated the role collection description.
     * <p><b>201</b> - Created - The API updated the role collection description.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No role collection could be found that matches your request.
* @param roleCollectionName
        The name of the role collection.
* @param roleDescription
        The content of the role collection description. The description has a maximum length of 1000 characters.
* @return Object
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public Object changeRoleCollectionDescription( @Nonnull final String roleCollectionName,  @Nonnull final RoleCollectionDescription roleDescription) throws OpenApiRequestException {
        final Object localVarPostBody = roleDescription;
        
        // verify the required parameter 'roleCollectionName' is set
        if (roleCollectionName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleCollectionName' when calling changeRoleCollectionDescription");
        }
        
        // verify the required parameter 'roleDescription' is set
        if (roleDescription == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleDescription' when calling changeRoleCollectionDescription");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("roleCollectionName", roleCollectionName);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/rolecollections/{roleCollectionName}").buildAndExpand(localVarPathParams).toUriString();

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

        final ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
    * <p>Creates a role collection.</p>
     *<p>Creates a role collection. You must include a role name at a minimum. The description is created as null if you don&#39;t include one. You can include role references as defined by the role name, the application ID, and role template name. To assign group members, use the /Groups endpoint. Groups are mapped to role collections in the Authorization and Trust Management service. For more information, see [Add Member](https://docs.cloudfoundry.org/api/uaa/version/74.4.0/index.html#add-member) in the documentation of Cloud Foundry or [User Management SCIM](https://api.sap.com/api/PlatformAPI/resource) SAP API Business Hub. Refer to the model below to see limitations for individual parameter values.</p>
     * <p><b>200</b> - OK - The API created the role collection and returned information about the role collection.
     * <p><b>201</b> - Created - The API created the role collection and returned information about the role collection.
     * <p><b>400</b> - Bad Request - The request was poorly formed. For example, the API doesn&#39;t support setting isReadOnly to true.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons, no role collections could be found that match your request.
* @param roleCollectionImport
        Defines the role collection. Role name is required. The description is optional. You can include references to existing roles as defined by role name, application ID, and role template name.
* @return RoleCollection
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public RoleCollection createRoleCollection( @Nonnull final RoleCollectionImport roleCollectionImport) throws OpenApiRequestException {
        final Object localVarPostBody = roleCollectionImport;
        
        // verify the required parameter 'roleCollectionImport' is set
        if (roleCollectionImport == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleCollectionImport' when calling createRoleCollection");
        }
        
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/rolecollections").build().toUriString();

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

        final ParameterizedTypeReference<RoleCollection> localVarReturnType = new ParameterizedTypeReference<RoleCollection>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
    * <p>Deletes a role collection.</p>
     *<p>Deletes a role collection specified by the name of the role collection.</p>
     * <p><b>200</b> - OK - The API deleted the role collection.
     * <p><b>204</b> - No Content - The API deleted the role collection.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No role collection could be found that matches your request.
* @param roleCollectionName
        The name of the role collection to be deleted.
* @return Object
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public Object deleteRoleCollectionByName( @Nonnull final String roleCollectionName) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'roleCollectionName' is set
        if (roleCollectionName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleCollectionName' when calling deleteRoleCollectionByName");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("roleCollectionName", roleCollectionName);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/rolecollections/{roleCollectionName}").buildAndExpand(localVarPathParams).toUriString();

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
    * <p>Deletes a role from a role collection.</p>
     *<p>Deletes a role specified by the role reference from a role collection.</p>
     * <p><b>200</b> - OK - The API removed the role from the role collection.
     * <p><b>204</b> - No Content - The API removed the role from the role collection.
     * <p><b>400</b> - Bad Request - The request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No role collection or role could be found that matches your request.
* @param roleCollectionName
        The name of the role collection to update.
* @param roleName
        The name of the role to remove from the role collection.
* @param roleTemplateAppID
        The application ID, with which the role is associated. The application ID is the xsappname plus the identifier, which consists of an exclamation mark (!), an identifier for the plan underwhich the application is deployed, and an index number.
* @param roleTemplateName
        The name of the role template, with which the role is associated.
* @return Object
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public Object deleteRoleFromRoleCollection( @Nonnull final String roleCollectionName,  @Nonnull final String roleName,  @Nonnull final String roleTemplateAppID,  @Nonnull final String roleTemplateName) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'roleCollectionName' is set
        if (roleCollectionName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleCollectionName' when calling deleteRoleFromRoleCollection");
        }
        
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleName' when calling deleteRoleFromRoleCollection");
        }
        
        // verify the required parameter 'roleTemplateAppID' is set
        if (roleTemplateAppID == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleTemplateAppID' when calling deleteRoleFromRoleCollection");
        }
        
        // verify the required parameter 'roleTemplateName' is set
        if (roleTemplateName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleTemplateName' when calling deleteRoleFromRoleCollection");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("roleCollectionName", roleCollectionName);
        localVarPathParams.put("roleName", roleName);
        localVarPathParams.put("roleTemplateAppID", roleTemplateAppID);
        localVarPathParams.put("roleTemplateName", roleTemplateName);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/rolecollections/{roleCollectionName}/roles/{roleTemplateAppID}/{roleName}/{roleTemplateName}").buildAndExpand(localVarPathParams).toUriString();

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
     * <p>Returns a role collection.</p>
     *<p>Returns information about a role collection identified by the name of the role collection.</p>
     * <p><b>200</b> - OK - The API retuned information about the role.
     * <p><b>400</b> - Bad Request - The request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No role collection could be found that matches your request.
     * @param roleCollectionName  (required)
        The name of collection to be returned.
     * @param withUsers  (optional, default to false)
        Set this parameter to list the users assigned to this role collection.
     * @return RoleCollection
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable  public RoleCollection getRoleCollectionByName( @Nonnull final String roleCollectionName,  @Nullable final Boolean withUsers) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'roleCollectionName' is set
        if (roleCollectionName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleCollectionName' when calling getRoleCollectionByName");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("roleCollectionName", roleCollectionName);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/rolecollections/{roleCollectionName}").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "withUsers", withUsers));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "apiaccess" };

        final ParameterizedTypeReference<RoleCollection> localVarReturnType = new ParameterizedTypeReference<RoleCollection>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
    * <p>Returns a role collection.</p>
     *<p>Returns information about a role collection identified by the name of the role collection.</p>
     * <p><b>200</b> - OK - The API retuned information about the role.
     * <p><b>400</b> - Bad Request - The request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No role collection could be found that matches your request.
* @param roleCollectionName
        The name of collection to be returned.
* @return RoleCollection
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public RoleCollection getRoleCollectionByName( @Nonnull final String roleCollectionName) throws OpenApiRequestException {
        return getRoleCollectionByName(roleCollectionName, null);
    }

    /**
     * <p>Returns role collections.</p>
     *<p>Returns all role collections, which exist within the current subaccount.</p>
     * <p><b>200</b> - OK - The API returned role collections of the current subaccount.
     * <p><b>400</b> - Bad Request - The request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons, no role collections could be found that match your request.
     * @param showGroups  (optional, default to false)
        Set this parameter to true, to include the groups to which the role collections are assigned.
     * @param showRoles  (optional, default to true)
        Set this parameter to true, to include the roles, which are associated with the role collections.
     * @param showUsers  (optional, default to false)
        Set this parameter to true, to include the users to whom the role collections are assigned.
     * @return List&lt;RoleCollection&gt;
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable  public List<RoleCollection> getRoleCollections( @Nullable final Boolean showGroups,  @Nullable final Boolean showRoles,  @Nullable final Boolean showUsers) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/rolecollections").build().toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "showGroups", showGroups));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "showRoles", showRoles));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "showUsers", showUsers));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "apiaccess" };

        final ParameterizedTypeReference<List<RoleCollection>> localVarReturnType = new ParameterizedTypeReference<List<RoleCollection>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
    * <p>Returns role collections.</p>
     *<p>Returns all role collections, which exist within the current subaccount.</p>
     * <p><b>200</b> - OK - The API returned role collections of the current subaccount.
     * <p><b>400</b> - Bad Request - The request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons, no role collections could be found that match your request.
* @return List&lt;RoleCollection&gt;
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public List<RoleCollection> getRoleCollections() throws OpenApiRequestException {
        return getRoleCollections(null, null, null);
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
     * <p>Returns role collections of a subaccount in paged format.</p>
     *<p>Returns all role collections, which exist within the current subaccount. The result in paged, enabling you to handle large responses.</p>
     * <p><b>200</b> - OK - The API returned role collections of the current subaccount.
     * <p><b>400</b> - Bad Request - The request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons, no role collections could be found that match your request.
     * @param showGroups  (optional, default to false)
        Set this parameter to true, to include the groups, to which the role collections are assigned.
     * @param showRoles  (optional, default to true)
        Set this parameter to true, to include the roles, which are associated with the role collections.
     * @param showUsers  (optional, default to false)
        Set this parameter to true, to include the users to whom the role collections are assigned.
     * @return List&lt;RoleCollection&gt;
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable  public List<RoleCollection> getRoleCollectionsByPaging( @Nullable final Boolean showGroups,  @Nullable final Boolean showRoles,  @Nullable final Boolean showUsers) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/rolecollections/pages").build().toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "showGroups", showGroups));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "showRoles", showRoles));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "showUsers", showUsers));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "apiaccess" };

        final ParameterizedTypeReference<List<RoleCollection>> localVarReturnType = new ParameterizedTypeReference<List<RoleCollection>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
    * <p>Returns role collections of a subaccount in paged format.</p>
     *<p>Returns all role collections, which exist within the current subaccount. The result in paged, enabling you to handle large responses.</p>
     * <p><b>200</b> - OK - The API returned role collections of the current subaccount.
     * <p><b>400</b> - Bad Request - The request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons, no role collections could be found that match your request.
* @return List&lt;RoleCollection&gt;
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public List<RoleCollection> getRoleCollectionsByPaging() throws OpenApiRequestException {
        return getRoleCollectionsByPaging(null, null, null);
    }
    /**
    * <p>Returns the roles of a role collection.</p>
     *<p>Returns information about the roles of a role collection specified by the name of the role collection.</p>
     * <p><b>200</b> - OK - The API returned roles for the role collection
     * <p><b>400</b> - Bad Request - The request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No role collection could be found that matches your request.
* @param roleCollectionName
        Name of the role collection
* @return List&lt;Role&gt;
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public List<Role> getRolesByRoleCollectionName( @Nonnull final String roleCollectionName) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'roleCollectionName' is set
        if (roleCollectionName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleCollectionName' when calling getRolesByRoleCollectionName");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("roleCollectionName", roleCollectionName);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/rolecollections/{roleCollectionName}/roles").buildAndExpand(localVarPathParams).toUriString();

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
}
