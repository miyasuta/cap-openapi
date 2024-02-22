

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
 * RoleCollectionDescription
 */

// CHECKSTYLE:OFF
public class RoleCollectionDescription 
// CHECKSTYLE:ON
{
  @JsonProperty("description")
  private String description;

  @JsonAnySetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the description of this {@link RoleCollectionDescription} instance and return the same instance.
   *
   * @param description  The description has a maximum length of 1000 characters.
   * @return The same instance of this {@link RoleCollectionDescription} class
   */
   @Nonnull public RoleCollectionDescription description(@Nonnull final String description) {
    this.description = description;
    return this;
  }

   /**
   * The description has a maximum length of 1000 characters.
   * @return description  The description of this {@link RoleCollectionDescription} instance.
  **/
  @Nonnull public String getDescription() {
    return description;
  }

  /**
  * Set the description of this {@link RoleCollectionDescription} instance.
  *
  * @param description  The description has a maximum length of 1000 characters.
  */
  public void setDescription( @Nonnull final String description) {
    this.description = description;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link RoleCollectionDescription}.
   * @return The set of properties names
   */
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of the {@link RoleCollectionDescription}.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("RoleCollectionDescription has no field with name '" + name + "'.");
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
    final RoleCollectionDescription roleCollectionDescription = (RoleCollectionDescription) o;
    return Objects.equals(this.cloudSdkCustomFields, roleCollectionDescription.cloudSdkCustomFields) &&
        Objects.equals(this.description, roleCollectionDescription.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class RoleCollectionDescription {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

