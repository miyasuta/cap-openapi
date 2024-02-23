

package customer.cap_openapi.generated.authorization.api;

import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;
import com.sap.cloud.sdk.services.openapi.core.OpenApiResponse;
import com.sap.cloud.sdk.services.openapi.core.AbstractOpenApiService;
import com.sap.cloud.sdk.services.openapi.apiclient.ApiClient;

import customer.cap_openapi.generated.authorization.model.RoleTemplate ; //NOPMD

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

public class RoleTemplatesApi extends AbstractOpenApiService {
    /**
    * Instantiates this API class to invoke operations on the Authorization.
    *
    * @param httpDestination The destination that API should be used with
    */
    public RoleTemplatesApi( @Nonnull final HttpDestinationProperties httpDestination )
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
    public RoleTemplatesApi( @Nonnull final ApiClient apiClient )
    {
         super(apiClient);
    }

        /**
    * <p>Returns role templates for an application.</p>
     *<p>Returns information about all role templates for an application that is specified by the application ID.</p>
     * <p><b>200</b> - OK - The API returned the list of role templates.
     * <p><b>400</b> - Bad Request - Your request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No service instance could be found that matches your request.
* @param appId
        The ID of application.
* @return List&lt;RoleTemplate&gt;
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public List<RoleTemplate> getRoleTemplateByAppName( @Nonnull final String appId) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new OpenApiRequestException("Missing the required parameter 'appId' when calling getRoleTemplateByAppName");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("appId", appId);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/apps/{appId}/roletemplates").buildAndExpand(localVarPathParams).toUriString();

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

        final ParameterizedTypeReference<List<RoleTemplate>> localVarReturnType = new ParameterizedTypeReference<List<RoleTemplate>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
    * <p>Returns a role template of an application.</p>
     *<p>Returns information about a role template of an application, which is specified by the application ID and the role template name.</p>
     * <p><b>200</b> - OK - The API returned the role template.
     * <p><b>400</b> - Bad Request - Your request was poorly formed.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No application or role template could be found that matches your request.
* @param appId
        The ID of the application.
* @param templateName
        The name of the role template.
* @return RoleTemplate
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public RoleTemplate getRoleTemplateByName( @Nonnull final String appId,  @Nonnull final String templateName) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new OpenApiRequestException("Missing the required parameter 'appId' when calling getRoleTemplateByName");
        }
        
        // verify the required parameter 'templateName' is set
        if (templateName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'templateName' when calling getRoleTemplateByName");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("appId", appId);
        localVarPathParams.put("templateName", templateName);
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/apps/{appId}/roletemplates/{templateName}").buildAndExpand(localVarPathParams).toUriString();

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

        final ParameterizedTypeReference<RoleTemplate> localVarReturnType = new ParameterizedTypeReference<RoleTemplate>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Returns all role templates</p>
     *<p>Returns information about all role templates of applications protected by the service instance of the Authorization and Trust Management service.</p>
     * <p><b>200</b> - OK - The API returned the role template information.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No role templates were found.
     * @param showRoles  (optional, default to false)
        If the parameter is set, the API also returns information about the roles associated with the role templates.
     * @return List&lt;RoleTemplate&gt;
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable  public List<RoleTemplate> getRoleTemplates( @Nullable final Boolean showRoles) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        final String localVarPath = UriComponentsBuilder.fromPath("/sap/rest/authorization/v2/apps/roletemplates").build().toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "showRoles", showRoles));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "apiaccess" };

        final ParameterizedTypeReference<List<RoleTemplate>> localVarReturnType = new ParameterizedTypeReference<List<RoleTemplate>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
    * <p>Returns all role templates</p>
     *<p>Returns information about all role templates of applications protected by the service instance of the Authorization and Trust Management service.</p>
     * <p><b>200</b> - OK - The API returned the role template information.
     * <p><b>401</b> - Unauthorized - Your authentication credentials have been refused.
     * <p><b>403</b> - Forbidden - You don&#39;t have the authorizations required to access the resource.
     * <p><b>404</b> - Not Found - Possible reasons: No role templates were found.
* @return List&lt;RoleTemplate&gt;
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public List<RoleTemplate> getRoleTemplates() throws OpenApiRequestException {
        return getRoleTemplates(null);
    }
}
