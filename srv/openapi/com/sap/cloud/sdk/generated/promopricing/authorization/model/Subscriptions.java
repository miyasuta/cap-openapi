

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
import com.sap.cloud.sdk.generated.promopricing.authorization.model.CloneSubscriptionDetails;
import com.sap.cloud.sdk.generated.promopricing.authorization.model.SubscriptionDetails;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Subscriptions
 */

// CHECKSTYLE:OFF
public class Subscriptions 
// CHECKSTYLE:ON
{
  @JsonProperty("cloneCount")
  private Integer cloneCount;

  @JsonProperty("subscriptions")
  private List<SubscriptionDetails> subscriptions = new ArrayList<>();

  @JsonProperty("subscriptionCountForTenant")
  private Integer subscriptionCountForTenant;

  @JsonProperty("cloneSubscriptions")
  private List<CloneSubscriptionDetails> cloneSubscriptions = new ArrayList<>();

  @JsonProperty("referenceCount")
  private Integer referenceCount;

  @JsonProperty("cloneSubscriptionCount")
  private Integer cloneSubscriptionCount;

  @JsonProperty("subscriptionCount")
  private Integer subscriptionCount;

  @JsonAnySetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the cloneCount of this {@link Subscriptions} instance and return the same instance.
   *
   * @param cloneCount  Only relevant for reuse instances. Total number of following instances of your broker service instance. The service only returns this array if the service instance uses the broker plan.
   * @return The same instance of this {@link Subscriptions} class
   */
   @Nonnull public Subscriptions cloneCount(@Nonnull final Integer cloneCount) {
    this.cloneCount = cloneCount;
    return this;
  }

   /**
   * Only relevant for reuse instances. Total number of following instances of your broker service instance. The service only returns this array if the service instance uses the broker plan.
   * @return cloneCount  The cloneCount of this {@link Subscriptions} instance.
  **/
  @Nonnull public Integer getCloneCount() {
    return cloneCount;
  }

  /**
  * Set the cloneCount of this {@link Subscriptions} instance.
  *
  * @param cloneCount  Only relevant for reuse instances. Total number of following instances of your broker service instance. The service only returns this array if the service instance uses the broker plan.
  */
  public void setCloneCount( @Nonnull final Integer cloneCount) {
    this.cloneCount = cloneCount;
  }

   /**
   * Set the subscriptions of this {@link Subscriptions} instance and return the same instance.
   *
   * @param subscriptions  An array of subscriptions to your multitenant application for this tenant. The service only returns this array if you set the listSubscriptions query paramter to true.
   * @return The same instance of this {@link Subscriptions} class
   */
   @Nonnull public Subscriptions subscriptions(@Nonnull final List<SubscriptionDetails> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }
  /**
  * Add one Subscriptions instance to this {@link Subscriptions}.
  * @param subscriptionsItem The Subscriptions that should be added
  * @return The same instance of type {@link Subscriptions}
  */
  @Nonnull public Subscriptions addSubscriptionsItem( @Nonnull final SubscriptionDetails subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

   /**
   * An array of subscriptions to your multitenant application for this tenant. The service only returns this array if you set the listSubscriptions query paramter to true.
   * @return subscriptions  The subscriptions of this {@link Subscriptions} instance.
  **/
  @Nonnull public List<SubscriptionDetails> getSubscriptions() {
    return subscriptions;
  }

  /**
  * Set the subscriptions of this {@link Subscriptions} instance.
  *
  * @param subscriptions  An array of subscriptions to your multitenant application for this tenant. The service only returns this array if you set the listSubscriptions query paramter to true.
  */
  public void setSubscriptions( @Nonnull final List<SubscriptionDetails> subscriptions) {
    this.subscriptions = subscriptions;
  }

   /**
   * Set the subscriptionCountForTenant of this {@link Subscriptions} instance and return the same instance.
   *
   * @param subscriptionCountForTenant  The number of subscriptions to your multitenant application for this tenant.
   * @return The same instance of this {@link Subscriptions} class
   */
   @Nonnull public Subscriptions subscriptionCountForTenant(@Nonnull final Integer subscriptionCountForTenant) {
    this.subscriptionCountForTenant = subscriptionCountForTenant;
    return this;
  }

   /**
   * The number of subscriptions to your multitenant application for this tenant.
   * @return subscriptionCountForTenant  The subscriptionCountForTenant of this {@link Subscriptions} instance.
  **/
  @Nonnull public Integer getSubscriptionCountForTenant() {
    return subscriptionCountForTenant;
  }

  /**
  * Set the subscriptionCountForTenant of this {@link Subscriptions} instance.
  *
  * @param subscriptionCountForTenant  The number of subscriptions to your multitenant application for this tenant.
  */
  public void setSubscriptionCountForTenant( @Nonnull final Integer subscriptionCountForTenant) {
    this.subscriptionCountForTenant = subscriptionCountForTenant;
  }

   /**
   * Set the cloneSubscriptions of this {@link Subscriptions} instance and return the same instance.
   *
   * @param cloneSubscriptions  Only relevant for reuse instances. An array of following instances of your broker service instance. The service only returns this array if you set the listCloneSubscriptions query paramter to true and the service instance uses the broker plan.
   * @return The same instance of this {@link Subscriptions} class
   */
   @Nonnull public Subscriptions cloneSubscriptions(@Nonnull final List<CloneSubscriptionDetails> cloneSubscriptions) {
    this.cloneSubscriptions = cloneSubscriptions;
    return this;
  }
  /**
  * Add one CloneSubscriptions instance to this {@link Subscriptions}.
  * @param cloneSubscriptionsItem The CloneSubscriptions that should be added
  * @return The same instance of type {@link Subscriptions}
  */
  @Nonnull public Subscriptions addCloneSubscriptionsItem( @Nonnull final CloneSubscriptionDetails cloneSubscriptionsItem) {
    if (this.cloneSubscriptions == null) {
      this.cloneSubscriptions = new ArrayList<>();
    }
    this.cloneSubscriptions.add(cloneSubscriptionsItem);
    return this;
  }

   /**
   * Only relevant for reuse instances. An array of following instances of your broker service instance. The service only returns this array if you set the listCloneSubscriptions query paramter to true and the service instance uses the broker plan.
   * @return cloneSubscriptions  The cloneSubscriptions of this {@link Subscriptions} instance.
  **/
  @Nonnull public List<CloneSubscriptionDetails> getCloneSubscriptions() {
    return cloneSubscriptions;
  }

  /**
  * Set the cloneSubscriptions of this {@link Subscriptions} instance.
  *
  * @param cloneSubscriptions  Only relevant for reuse instances. An array of following instances of your broker service instance. The service only returns this array if you set the listCloneSubscriptions query paramter to true and the service instance uses the broker plan.
  */
  public void setCloneSubscriptions( @Nonnull final List<CloneSubscriptionDetails> cloneSubscriptions) {
    this.cloneSubscriptions = cloneSubscriptions;
  }

   /**
   * Set the referenceCount of this {@link Subscriptions} instance and return the same instance.
   *
   * @param referenceCount  Total number of refrences to the broker service instance.
   * @return The same instance of this {@link Subscriptions} class
   */
   @Nonnull public Subscriptions referenceCount(@Nonnull final Integer referenceCount) {
    this.referenceCount = referenceCount;
    return this;
  }

   /**
   * Total number of refrences to the broker service instance.
   * @return referenceCount  The referenceCount of this {@link Subscriptions} instance.
  **/
  @Nonnull public Integer getReferenceCount() {
    return referenceCount;
  }

  /**
  * Set the referenceCount of this {@link Subscriptions} instance.
  *
  * @param referenceCount  Total number of refrences to the broker service instance.
  */
  public void setReferenceCount( @Nonnull final Integer referenceCount) {
    this.referenceCount = referenceCount;
  }

   /**
   * Set the cloneSubscriptionCount of this {@link Subscriptions} instance and return the same instance.
   *
   * @param cloneSubscriptionCount  Only relevant for reuse instances. Total number of subscriptions to following service instances.
   * @return The same instance of this {@link Subscriptions} class
   */
   @Nonnull public Subscriptions cloneSubscriptionCount(@Nonnull final Integer cloneSubscriptionCount) {
    this.cloneSubscriptionCount = cloneSubscriptionCount;
    return this;
  }

   /**
   * Only relevant for reuse instances. Total number of subscriptions to following service instances.
   * @return cloneSubscriptionCount  The cloneSubscriptionCount of this {@link Subscriptions} instance.
  **/
  @Nonnull public Integer getCloneSubscriptionCount() {
    return cloneSubscriptionCount;
  }

  /**
  * Set the cloneSubscriptionCount of this {@link Subscriptions} instance.
  *
  * @param cloneSubscriptionCount  Only relevant for reuse instances. Total number of subscriptions to following service instances.
  */
  public void setCloneSubscriptionCount( @Nonnull final Integer cloneSubscriptionCount) {
    this.cloneSubscriptionCount = cloneSubscriptionCount;
  }

   /**
   * Set the subscriptionCount of this {@link Subscriptions} instance and return the same instance.
   *
   * @param subscriptionCount  Total number of subscriptions to your multitenant application.
   * @return The same instance of this {@link Subscriptions} class
   */
   @Nonnull public Subscriptions subscriptionCount(@Nonnull final Integer subscriptionCount) {
    this.subscriptionCount = subscriptionCount;
    return this;
  }

   /**
   * Total number of subscriptions to your multitenant application.
   * @return subscriptionCount  The subscriptionCount of this {@link Subscriptions} instance.
  **/
  @Nonnull public Integer getSubscriptionCount() {
    return subscriptionCount;
  }

  /**
  * Set the subscriptionCount of this {@link Subscriptions} instance.
  *
  * @param subscriptionCount  Total number of subscriptions to your multitenant application.
  */
  public void setSubscriptionCount( @Nonnull final Integer subscriptionCount) {
    this.subscriptionCount = subscriptionCount;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link Subscriptions}.
   * @return The set of properties names
   */
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of the {@link Subscriptions}.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("Subscriptions has no field with name '" + name + "'.");
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
    final Subscriptions subscriptions = (Subscriptions) o;
    return Objects.equals(this.cloudSdkCustomFields, subscriptions.cloudSdkCustomFields) &&
        Objects.equals(this.cloneCount, subscriptions.cloneCount) &&
        Objects.equals(this.subscriptions, subscriptions.subscriptions) &&
        Objects.equals(this.subscriptionCountForTenant, subscriptions.subscriptionCountForTenant) &&
        Objects.equals(this.cloneSubscriptions, subscriptions.cloneSubscriptions) &&
        Objects.equals(this.referenceCount, subscriptions.referenceCount) &&
        Objects.equals(this.cloneSubscriptionCount, subscriptions.cloneSubscriptionCount) &&
        Objects.equals(this.subscriptionCount, subscriptions.subscriptionCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloneCount, subscriptions, subscriptionCountForTenant, cloneSubscriptions, referenceCount, cloneSubscriptionCount, subscriptionCount, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class Subscriptions {\n");
    sb.append("    cloneCount: ").append(toIndentedString(cloneCount)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    subscriptionCountForTenant: ").append(toIndentedString(subscriptionCountForTenant)).append("\n");
    sb.append("    cloneSubscriptions: ").append(toIndentedString(cloneSubscriptions)).append("\n");
    sb.append("    referenceCount: ").append(toIndentedString(referenceCount)).append("\n");
    sb.append("    cloneSubscriptionCount: ").append(toIndentedString(cloneSubscriptionCount)).append("\n");
    sb.append("    subscriptionCount: ").append(toIndentedString(subscriptionCount)).append("\n");
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
