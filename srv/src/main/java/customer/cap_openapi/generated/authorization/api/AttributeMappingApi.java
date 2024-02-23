

package customer.cap_openapi.generated.authorization.api;

import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;
import com.sap.cloud.sdk.services.openapi.core.OpenApiResponse;
import com.sap.cloud.sdk.services.openapi.core.AbstractOpenApiService;
import com.sap.cloud.sdk.services.openapi.apiclient.ApiClient;

import customer.cap_openapi.generated.authorization.model.App ; //NOPMD
import customer.cap_openapi.generated.authorization.model.IdentityProviderMapping ; //NOPMD
import customer.cap_openapi.generated.authorization.model.RoleCollectionAttribute ; //NOPMD

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

public class AttributeMappingApi extends AbstractOpenApiService {
    /**
    * Instantiates this API class to invoke operations on the Authorization.
    *
    * @param httpDestination The destination that API should be used with
    */
    public AttributeMappingApi( @Nonnull final HttpDestinationProperties httpDestination )
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
    public AttributeMappingApi( @Nonnull final ApiClient apiClient )
    {
         super(apiClient);
    }

        /**
    * <p>Add an identity provider attribute with a value to a role collection.</p>
     *<p>Add an attribute with a value to an identity provider and application role collection.</p>
     * <p><b>200</b> - OK - The API created the attribute mapping.
     * <p><b>400</b> - Bad Request - Your request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found
* @param origin
        The origin key is the unique name of the identity provider (IdP).
* @param attribute
        The JSON contains the attribute name, value, and comparison operator.
* @return An OpenApiResponse containing the status code of the HttpResponse.
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
     @Nonnull  public OpenApiResponse addIdpAttributeToRoleCollection( @Nonnull final String origin,  @Nonnull final IdentityProviderMapping attribute) throws OpenApiRequestException {
        final Object localVarPostBody = attribute;
        
        // verify the required parameter 'origin' is set
        if (origin == null) {
            throw new OpenApiRequestException("Missing the required parameter 'origin' when calling addIdpAttributeToRoleCollection");
        }
        
        // verify the required parameter 'attribute' is set
        if (attribute == null) {
            throw new OpenApiRequestException("Missing the required parameter 'attribute' when calling addIdpAttributeToRoleCollection");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("origin", origin);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/identity-providers/{origin}/attributes").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "apiaccess" };

        final ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
        return new OpenApiResponse(apiClient);
    }
    /**
    * <p>Deletes an attribute mapping from a role collection.</p>
     *<p>Deletes an attribute mapping from a role collection specified by the attribute name, value, the operator, and the role collection name.</p>
     * <p><b>200</b> - OK - The API deleted the attribute.
     * <p><b>400</b> - Bad Request - Your request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No attribute was found with the specified values.
* @param attributeName
        Name of the identity provider attribute.
* @param attributeValue
        Value of the identity provider attribute.
* @param operator
        Matching operator between the attribute name and attribute value.
* @param origin
        The origin key is the unique name of the identity provider (IdP).
* @param roleCollectionName
        Name of the role collection
* @return List&lt;App&gt;
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public List<App> deleteIdpAttributeToRoleCollection( @Nonnull final String attributeName,  @Nonnull final String attributeValue,  @Nonnull final String operator,  @Nonnull final String origin,  @Nonnull final String roleCollectionName) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'attributeName' is set
        if (attributeName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'attributeName' when calling deleteIdpAttributeToRoleCollection");
        }
        
        // verify the required parameter 'attributeValue' is set
        if (attributeValue == null) {
            throw new OpenApiRequestException("Missing the required parameter 'attributeValue' when calling deleteIdpAttributeToRoleCollection");
        }
        
        // verify the required parameter 'operator' is set
        if (operator == null) {
            throw new OpenApiRequestException("Missing the required parameter 'operator' when calling deleteIdpAttributeToRoleCollection");
        }
        
        // verify the required parameter 'origin' is set
        if (origin == null) {
            throw new OpenApiRequestException("Missing the required parameter 'origin' when calling deleteIdpAttributeToRoleCollection");
        }
        
        // verify the required parameter 'roleCollectionName' is set
        if (roleCollectionName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleCollectionName' when calling deleteIdpAttributeToRoleCollection");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("attributeName", attributeName);
        localVarPathParams.put("attributeValue", attributeValue);
        localVarPathParams.put("operator", operator);
        localVarPathParams.put("origin", origin);
        localVarPathParams.put("roleCollectionName", roleCollectionName);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/identity-providers/{origin}/attributes/{attributeName}/{operator}/{attributeValue}/rolecollections/{roleCollectionName}").buildAndExpand(localVarPathParams).toUriString();

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

        final ParameterizedTypeReference<List<App>> localVarReturnType = new ParameterizedTypeReference<List<App>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
    * <p>Returns role collections and their attributes for an identity provider.</p>
     *<p>Returns role collections and their attributes specified by the identity provider (origin).</p>
     * <p><b>200</b> - OK - The API returned the list of role collections and their attributes.
     * <p><b>400</b> - Bad Request - Your request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - No identity provider could be found matching your origin key.
* @param origin
        The origin key is the unique name of the identity provider (IdP).
* @return List&lt;RoleCollectionAttribute&gt;
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public List<RoleCollectionAttribute> getIdpAttributeValues( @Nonnull final String origin) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'origin' is set
        if (origin == null) {
            throw new OpenApiRequestException("Missing the required parameter 'origin' when calling getIdpAttributeValues");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("origin", origin);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/identity-providers/{origin}/attributes/rolecollections").buildAndExpand(localVarPathParams).toUriString();

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

        final ParameterizedTypeReference<List<RoleCollectionAttribute>> localVarReturnType = new ParameterizedTypeReference<List<RoleCollectionAttribute>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
    * <p>Returns the attributes for a role collection.</p>
     *<p>Returns the attributes for a specific role collection specified by the identity provider (origin) and the role collection name.</p>
     * <p><b>200</b> - OK - The API returned the list of role collections.
     * <p><b>400</b> - Bad Request - Your request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - No identity provider or role collection could be found matching your request.
* @param origin
        The origin key is the unique name of the identity provider (IdP).
* @param roleCollectionName
        The Name of the role collection.
* @return List&lt;RoleCollectionAttribute&gt;
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public List<RoleCollectionAttribute> getIdpAttributeValuesFromRoleCollection( @Nonnull final String origin,  @Nonnull final String roleCollectionName) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'origin' is set
        if (origin == null) {
            throw new OpenApiRequestException("Missing the required parameter 'origin' when calling getIdpAttributeValuesFromRoleCollection");
        }
        
        // verify the required parameter 'roleCollectionName' is set
        if (roleCollectionName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleCollectionName' when calling getIdpAttributeValuesFromRoleCollection");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("origin", origin);
        localVarPathParams.put("roleCollectionName", roleCollectionName);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/identity-providers/{origin}/rolecollections/{roleCollectionName}").buildAndExpand(localVarPathParams).toUriString();

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

        final ParameterizedTypeReference<List<RoleCollectionAttribute>> localVarReturnType = new ParameterizedTypeReference<List<RoleCollectionAttribute>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
    * <p>Returns a specific role collection that contains a specific attribute.</p>
     *<p>Returns a role collection that contains a specific attribute, specified by the role collection name and attribute name.</p>
     * <p><b>200</b> - OK - The API returned the list of registered service instances.
     * <p><b>400</b> - Bad Request - Your request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No role collection could be found that matches your request.
* @param attributeName
        The name of the attribute.
* @param origin
        The origin key is the unique name of the identity provider (IdP).
* @param roleCollectionName
        The Name of the role collection.
* @return List&lt;App&gt;
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public List<App> getIdpAttributeValuesFromRoleCollectionByAttribute( @Nonnull final String attributeName,  @Nonnull final String origin,  @Nonnull final String roleCollectionName) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'attributeName' is set
        if (attributeName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'attributeName' when calling getIdpAttributeValuesFromRoleCollectionByAttribute");
        }
        
        // verify the required parameter 'origin' is set
        if (origin == null) {
            throw new OpenApiRequestException("Missing the required parameter 'origin' when calling getIdpAttributeValuesFromRoleCollectionByAttribute");
        }
        
        // verify the required parameter 'roleCollectionName' is set
        if (roleCollectionName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'roleCollectionName' when calling getIdpAttributeValuesFromRoleCollectionByAttribute");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("attributeName", attributeName);
        localVarPathParams.put("origin", origin);
        localVarPathParams.put("roleCollectionName", roleCollectionName);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/identity-providers/{origin}/attributes/{attributeName}/rolecollections/{roleCollectionName}").buildAndExpand(localVarPathParams).toUriString();

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

        final ParameterizedTypeReference<List<App>> localVarReturnType = new ParameterizedTypeReference<List<App>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
    * <p>Returns all role collections with a specific attribute name and value.</p>
     *<p>Returns all role collections of a specific identity provider that have a specific attribute name and value.</p>
     * <p><b>200</b> - OK - The API returned the list of registered service instances.
     * <p><b>400</b> - Bad Request - Your request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No role collections could be found matching your attribute parameters or values.
* @param origin
        The origin key is the unique name of the identity provider (IdP).
* @param attributeName
        attribute name
* @param attributeValue
        IDP attribute value
* @return List&lt;App&gt;
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public List<App> getRoleCollectionByAttributeValue( @Nonnull final String origin,  @Nonnull final String attributeName,  @Nonnull final String attributeValue) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'origin' is set
        if (origin == null) {
            throw new OpenApiRequestException("Missing the required parameter 'origin' when calling getRoleCollectionByAttributeValue");
        }
        
        // verify the required parameter 'attributeName' is set
        if (attributeName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'attributeName' when calling getRoleCollectionByAttributeValue");
        }
        
        // verify the required parameter 'attributeValue' is set
        if (attributeValue == null) {
            throw new OpenApiRequestException("Missing the required parameter 'attributeValue' when calling getRoleCollectionByAttributeValue");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("origin", origin);
        localVarPathParams.put("attributeName", attributeName);
        localVarPathParams.put("attributeValue", attributeValue);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/identity-providers/{origin}/attributes/{attributeName}/{attributeValue}").buildAndExpand(localVarPathParams).toUriString();

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

        final ParameterizedTypeReference<List<App>> localVarReturnType = new ParameterizedTypeReference<List<App>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
