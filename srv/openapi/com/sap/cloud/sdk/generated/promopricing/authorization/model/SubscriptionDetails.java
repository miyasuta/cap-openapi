

/*
 * Authorization
 * Provides functions to administrate the Authorization and Trust Management service (XSUAA) of SAP BTP, Cloud Foundry environment. You can manage service instances of the Authorization and Trust Management service. You can also manage roles, role templates, and role collections of your subaccount.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.cloud.sdk.generated.promopricing.authorization.model;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * SubscriptionDetails
 */

// CHECKSTYLE:OFF
public class SubscriptionDetails 
// CHECKSTYLE:ON
{
  @JsonProperty("id")
  private String id;

  @JsonProperty("appid")
  private String appid;

  @JsonProperty("tenantId")
  private String tenantId;

  @JsonAnySetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the id of this {@link SubscriptionDetails} instance and return the same instance.
   *
   * @param id  The identifier for the subscription to the application.
   * @return The same instance of this {@link SubscriptionDetails} class
   */
   @Nonnull public SubscriptionDetails id(@Nonnull final String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier for the subscription to the application.
   * @return id  The id of this {@link SubscriptionDetails} instance.
  **/
  @Nonnull public String getId() {
    return id;
  }

  /**
  * Set the id of this {@link SubscriptionDetails} instance.
  *
  * @param id  The identifier for the subscription to the application.
  */
  public void setId( @Nonnull final String id) {
    this.id = id;
  }

   /**
   * Set the appid of this {@link SubscriptionDetails} instance and return the same instance.
   *
   * @param appid  The application ID is the xsappname plus the identifier, which consists of an exclamation mark (!), an identifier for the plan underwhich the application is deployed, and an index number.
   * @return The same instance of this {@link SubscriptionDetails} class
   */
   @Nonnull public SubscriptionDetails appid(@Nonnull final String appid) {
    this.appid = appid;
    return this;
  }

   /**
   * The application ID is the xsappname plus the identifier, which consists of an exclamation mark (!), an identifier for the plan underwhich the application is deployed, and an index number.
   * @return appid  The appid of this {@link SubscriptionDetails} instance.
  **/
  @Nonnull public String getAppid() {
    return appid;
  }

  /**
  * Set the appid of this {@link SubscriptionDetails} instance.
  *
  * @param appid  The application ID is the xsappname plus the identifier, which consists of an exclamation mark (!), an identifier for the plan underwhich the application is deployed, and an index number.
  */
  public void setAppid( @Nonnull final String appid) {
    this.appid = appid;
  }

   /**
   * Set the tenantId of this {@link SubscriptionDetails} instance and return the same instance.
   *
   * @param tenantId  Tenant ID of your subaccount. The zoneId parameter is the same ID and can be used interchangably with tenant ID.
   * @return The same instance of this {@link SubscriptionDetails} class
   */
   @Nonnull public SubscriptionDetails tenantId(@Nonnull final String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Tenant ID of your subaccount. The zoneId parameter is the same ID and can be used interchangably with tenant ID.
   * @return tenantId  The tenantId of this {@link SubscriptionDetails} instance.
  **/
  @Nonnull public String getTenantId() {
    return tenantId;
  }

  /**
  * Set the tenantId of this {@link SubscriptionDetails} instance.
  *
  * @param tenantId  Tenant ID of your subaccount. The zoneId parameter is the same ID and can be used interchangably with tenant ID.
  */
  public void setTenantId( @Nonnull final String tenantId) {
    this.tenantId = tenantId;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link SubscriptionDetails}.
   * @return The set of properties names
   */
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of the {@link SubscriptionDetails}.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("SubscriptionDetails has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  @Override
  public boolean equals(@Nullable final java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final SubscriptionDetails subscriptionDetails = (SubscriptionDetails) o;
    return Objects.equals(this.cloudSdkCustomFields, subscriptionDetails.cloudSdkCustomFields) &&
        Objects.equals(this.id, subscriptionDetails.id) &&
        Objects.equals(this.appid, subscriptionDetails.appid) &&
        Objects.equals(this.tenantId, subscriptionDetails.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, appid, tenantId, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    cloudSdkCustomFields.forEach((k,v) -> sb.append("    ").append(k).append(": ").append(toIndentedString(v)).append("\n"));
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(final java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
