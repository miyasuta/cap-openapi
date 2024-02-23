

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

package customer.cap_openapi.generated.authorization.model;

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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * RoleAttribute
 */

// CHECKSTYLE:OFF
public class RoleAttribute 
// CHECKSTYLE:ON
{
  @JsonProperty("attributeName")
  private String attributeName;

  @JsonProperty("attributeValueOrigin")
  private String attributeValueOrigin;

  @JsonProperty("attributeValues")
  private List<String> attributeValues = new ArrayList<>();

  @JsonProperty("description")
  private String description;

  @JsonProperty("valueRequired")
  private Boolean valueRequired;

  @JsonAnySetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the attributeName of this {@link RoleAttribute} instance and return the same instance.
   *
   * @param attributeName  The name has a maximum length of 64 characters. Only the following characters are allowed: alphanumeric characters (aA-zZ) and (0-9) and underscore (_).
   * @return The same instance of this {@link RoleAttribute} class
   */
   @Nonnull public RoleAttribute attributeName(@Nonnull final String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

   /**
   * The name has a maximum length of 64 characters. Only the following characters are allowed: alphanumeric characters (aA-zZ) and (0-9) and underscore (_).
   * @return attributeName  The attributeName of this {@link RoleAttribute} instance.
  **/
  @Nonnull public String getAttributeName() {
    return attributeName;
  }

  /**
  * Set the attributeName of this {@link RoleAttribute} instance.
  *
  * @param attributeName  The name has a maximum length of 64 characters. Only the following characters are allowed: alphanumeric characters (aA-zZ) and (0-9) and underscore (_).
  */
  public void setAttributeName( @Nonnull final String attributeName) {
    this.attributeName = attributeName;
  }

   /**
   * Set the attributeValueOrigin of this {@link RoleAttribute} instance and return the same instance.
   *
   * @param attributeValueOrigin  The attributeValueOrigin of this {@link RoleAttribute}
   * @return The same instance of this {@link RoleAttribute} class
   */
   @Nonnull public RoleAttribute attributeValueOrigin(@Nonnull final String attributeValueOrigin) {
    this.attributeValueOrigin = attributeValueOrigin;
    return this;
  }

   /**
   * Get attributeValueOrigin
   * @return attributeValueOrigin  The attributeValueOrigin of this {@link RoleAttribute} instance.
  **/
  @Nonnull public String getAttributeValueOrigin() {
    return attributeValueOrigin;
  }

  /**
  * Set the attributeValueOrigin of this {@link RoleAttribute} instance.
  *
  * @param attributeValueOrigin  The attributeValueOrigin of this {@link RoleAttribute}
  */
  public void setAttributeValueOrigin( @Nonnull final String attributeValueOrigin) {
    this.attributeValueOrigin = attributeValueOrigin;
  }

   /**
   * Set the attributeValues of this {@link RoleAttribute} instance and return the same instance.
   *
   * @param attributeValues  The attributeValues of this {@link RoleAttribute}
   * @return The same instance of this {@link RoleAttribute} class
   */
   @Nonnull public RoleAttribute attributeValues(@Nonnull final List<String> attributeValues) {
    this.attributeValues = attributeValues;
    return this;
  }
  /**
  * Add one AttributeValues instance to this {@link RoleAttribute}.
  * @param attributeValuesItem The AttributeValues that should be added
  * @return The same instance of type {@link RoleAttribute}
  */
  @Nonnull public RoleAttribute addAttributeValuesItem( @Nonnull final String attributeValuesItem) {
    if (this.attributeValues == null) {
      this.attributeValues = new ArrayList<>();
    }
    this.attributeValues.add(attributeValuesItem);
    return this;
  }

   /**
   * Get attributeValues
   * @return attributeValues  The attributeValues of this {@link RoleAttribute} instance.
  **/
  @Nonnull public List<String> getAttributeValues() {
    return attributeValues;
  }

  /**
  * Set the attributeValues of this {@link RoleAttribute} instance.
  *
  * @param attributeValues  The attributeValues of this {@link RoleAttribute}
  */
  public void setAttributeValues( @Nonnull final List<String> attributeValues) {
    this.attributeValues = attributeValues;
  }

   /**
   * Set the description of this {@link RoleAttribute} instance and return the same instance.
   *
   * @param description  The description of this {@link RoleAttribute}
   * @return The same instance of this {@link RoleAttribute} class
   */
   @Nonnull public RoleAttribute description(@Nonnull final String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description  The description of this {@link RoleAttribute} instance.
  **/
  @Nonnull public String getDescription() {
    return description;
  }

  /**
  * Set the description of this {@link RoleAttribute} instance.
  *
  * @param description  The description of this {@link RoleAttribute}
  */
  public void setDescription( @Nonnull final String description) {
    this.description = description;
  }

   /**
   * Set the valueRequired of this {@link RoleAttribute} instance and return the same instance.
   *
   * @param valueRequired  The valueRequired of this {@link RoleAttribute}
   * @return The same instance of this {@link RoleAttribute} class
   */
   @Nonnull public RoleAttribute valueRequired(@Nonnull final Boolean valueRequired) {
    this.valueRequired = valueRequired;
    return this;
  }

   /**
   * Get valueRequired
   * @return valueRequired  The valueRequired of this {@link RoleAttribute} instance.
  **/
  @Nonnull public Boolean isValueRequired() {
    return valueRequired;
  }

  /**
  * Set the valueRequired of this {@link RoleAttribute} instance.
  *
  * @param valueRequired  The valueRequired of this {@link RoleAttribute}
  */
  public void setValueRequired( @Nonnull final Boolean valueRequired) {
    this.valueRequired = valueRequired;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link RoleAttribute}.
   * @return The set of properties names
   */
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of the {@link RoleAttribute}.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("RoleAttribute has no field with name '" + name + "'.");
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
    final RoleAttribute roleAttribute = (RoleAttribute) o;
    return Objects.equals(this.cloudSdkCustomFields, roleAttribute.cloudSdkCustomFields) &&
        Objects.equals(this.attributeName, roleAttribute.attributeName) &&
        Objects.equals(this.attributeValueOrigin, roleAttribute.attributeValueOrigin) &&
        Objects.equals(this.attributeValues, roleAttribute.attributeValues) &&
        Objects.equals(this.description, roleAttribute.description) &&
        Objects.equals(this.valueRequired, roleAttribute.valueRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeName, attributeValueOrigin, attributeValues, description, valueRequired, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class RoleAttribute {\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    attributeValueOrigin: ").append(toIndentedString(attributeValueOrigin)).append("\n");
    sb.append("    attributeValues: ").append(toIndentedString(attributeValues)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    valueRequired: ").append(toIndentedString(valueRequired)).append("\n");
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
