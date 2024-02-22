

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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Scope
 */

// CHECKSTYLE:OFF
public class Scope 
// CHECKSTYLE:ON
{
  @JsonProperty("custom-grant-as-authority-to-apps")
  private List<String> customGrantAsAuthorityToApps = new ArrayList<>();

  @JsonProperty("custom-granted-apps")
  private List<String> customGrantedApps = new ArrayList<>();

  @JsonProperty("description")
  private String description;

  @JsonProperty("grant-as-authority-to-apps")
  private List<String> grantAsAuthorityToApps = new ArrayList<>();

  @JsonProperty("granted-apps")
  private List<String> grantedApps = new ArrayList<>();

  @JsonProperty("name")
  private String name;

  @JsonAnySetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the customGrantAsAuthorityToApps of this {@link Scope} instance and return the same instance.
   *
   * @param customGrantAsAuthorityToApps  The customGrantAsAuthorityToApps of this {@link Scope}
   * @return The same instance of this {@link Scope} class
   */
   @Nonnull public Scope customGrantAsAuthorityToApps(@Nonnull final List<String> customGrantAsAuthorityToApps) {
    this.customGrantAsAuthorityToApps = customGrantAsAuthorityToApps;
    return this;
  }
  /**
  * Add one CustomGrantAsAuthorityToApps instance to this {@link Scope}.
  * @param customGrantAsAuthorityToAppsItem The CustomGrantAsAuthorityToApps that should be added
  * @return The same instance of type {@link Scope}
  */
  @Nonnull public Scope addCustomGrantAsAuthorityToAppsItem( @Nonnull final String customGrantAsAuthorityToAppsItem) {
    if (this.customGrantAsAuthorityToApps == null) {
      this.customGrantAsAuthorityToApps = new ArrayList<>();
    }
    this.customGrantAsAuthorityToApps.add(customGrantAsAuthorityToAppsItem);
    return this;
  }

   /**
   * Get customGrantAsAuthorityToApps
   * @return customGrantAsAuthorityToApps  The customGrantAsAuthorityToApps of this {@link Scope} instance.
  **/
  @Nonnull public List<String> getCustomGrantAsAuthorityToApps() {
    return customGrantAsAuthorityToApps;
  }

  /**
  * Set the customGrantAsAuthorityToApps of this {@link Scope} instance.
  *
  * @param customGrantAsAuthorityToApps  The customGrantAsAuthorityToApps of this {@link Scope}
  */
  public void setCustomGrantAsAuthorityToApps( @Nonnull final List<String> customGrantAsAuthorityToApps) {
    this.customGrantAsAuthorityToApps = customGrantAsAuthorityToApps;
  }

   /**
   * Set the customGrantedApps of this {@link Scope} instance and return the same instance.
   *
   * @param customGrantedApps  The customGrantedApps of this {@link Scope}
   * @return The same instance of this {@link Scope} class
   */
   @Nonnull public Scope customGrantedApps(@Nonnull final List<String> customGrantedApps) {
    this.customGrantedApps = customGrantedApps;
    return this;
  }
  /**
  * Add one CustomGrantedApps instance to this {@link Scope}.
  * @param customGrantedAppsItem The CustomGrantedApps that should be added
  * @return The same instance of type {@link Scope}
  */
  @Nonnull public Scope addCustomGrantedAppsItem( @Nonnull final String customGrantedAppsItem) {
    if (this.customGrantedApps == null) {
      this.customGrantedApps = new ArrayList<>();
    }
    this.customGrantedApps.add(customGrantedAppsItem);
    return this;
  }

   /**
   * Get customGrantedApps
   * @return customGrantedApps  The customGrantedApps of this {@link Scope} instance.
  **/
  @Nonnull public List<String> getCustomGrantedApps() {
    return customGrantedApps;
  }

  /**
  * Set the customGrantedApps of this {@link Scope} instance.
  *
  * @param customGrantedApps  The customGrantedApps of this {@link Scope}
  */
  public void setCustomGrantedApps( @Nonnull final List<String> customGrantedApps) {
    this.customGrantedApps = customGrantedApps;
  }

   /**
   * Set the description of this {@link Scope} instance and return the same instance.
   *
   * @param description  The description of this {@link Scope}
   * @return The same instance of this {@link Scope} class
   */
   @Nonnull public Scope description(@Nonnull final String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description  The description of this {@link Scope} instance.
  **/
  @Nonnull public String getDescription() {
    return description;
  }

  /**
  * Set the description of this {@link Scope} instance.
  *
  * @param description  The description of this {@link Scope}
  */
  public void setDescription( @Nonnull final String description) {
    this.description = description;
  }

   /**
   * Set the grantAsAuthorityToApps of this {@link Scope} instance and return the same instance.
   *
   * @param grantAsAuthorityToApps  The grantAsAuthorityToApps of this {@link Scope}
   * @return The same instance of this {@link Scope} class
   */
   @Nonnull public Scope grantAsAuthorityToApps(@Nonnull final List<String> grantAsAuthorityToApps) {
    this.grantAsAuthorityToApps = grantAsAuthorityToApps;
    return this;
  }
  /**
  * Add one GrantAsAuthorityToApps instance to this {@link Scope}.
  * @param grantAsAuthorityToAppsItem The GrantAsAuthorityToApps that should be added
  * @return The same instance of type {@link Scope}
  */
  @Nonnull public Scope addGrantAsAuthorityToAppsItem( @Nonnull final String grantAsAuthorityToAppsItem) {
    if (this.grantAsAuthorityToApps == null) {
      this.grantAsAuthorityToApps = new ArrayList<>();
    }
    this.grantAsAuthorityToApps.add(grantAsAuthorityToAppsItem);
    return this;
  }

   /**
   * Get grantAsAuthorityToApps
   * @return grantAsAuthorityToApps  The grantAsAuthorityToApps of this {@link Scope} instance.
  **/
  @Nonnull public List<String> getGrantAsAuthorityToApps() {
    return grantAsAuthorityToApps;
  }

  /**
  * Set the grantAsAuthorityToApps of this {@link Scope} instance.
  *
  * @param grantAsAuthorityToApps  The grantAsAuthorityToApps of this {@link Scope}
  */
  public void setGrantAsAuthorityToApps( @Nonnull final List<String> grantAsAuthorityToApps) {
    this.grantAsAuthorityToApps = grantAsAuthorityToApps;
  }

   /**
   * Set the grantedApps of this {@link Scope} instance and return the same instance.
   *
   * @param grantedApps  The grantedApps of this {@link Scope}
   * @return The same instance of this {@link Scope} class
   */
   @Nonnull public Scope grantedApps(@Nonnull final List<String> grantedApps) {
    this.grantedApps = grantedApps;
    return this;
  }
  /**
  * Add one GrantedApps instance to this {@link Scope}.
  * @param grantedAppsItem The GrantedApps that should be added
  * @return The same instance of type {@link Scope}
  */
  @Nonnull public Scope addGrantedAppsItem( @Nonnull final String grantedAppsItem) {
    if (this.grantedApps == null) {
      this.grantedApps = new ArrayList<>();
    }
    this.grantedApps.add(grantedAppsItem);
    return this;
  }

   /**
   * Get grantedApps
   * @return grantedApps  The grantedApps of this {@link Scope} instance.
  **/
  @Nonnull public List<String> getGrantedApps() {
    return grantedApps;
  }

  /**
  * Set the grantedApps of this {@link Scope} instance.
  *
  * @param grantedApps  The grantedApps of this {@link Scope}
  */
  public void setGrantedApps( @Nonnull final List<String> grantedApps) {
    this.grantedApps = grantedApps;
  }

   /**
   * Set the name of this {@link Scope} instance and return the same instance.
   *
   * @param name  The name of the application and scope as defined in the application security descriptor xs-security.json. The name has a maximum length of 193 characters, including the fully qualified application name. The fully qualified scope name starts with the application ID followed by an optional number of components and finally the scope, each separated by a period (.). For example: service-manager!b105.entitlement.notify. Only the following characters are allowed: alphanumeric characters (aA-zZ) and (0-9), hyphen (-), underscore (_), forward slash (/), backslash (\\), and colon (:).
   * @return The same instance of this {@link Scope} class
   */
   @Nonnull public Scope name(@Nonnull final String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the application and scope as defined in the application security descriptor xs-security.json. The name has a maximum length of 193 characters, including the fully qualified application name. The fully qualified scope name starts with the application ID followed by an optional number of components and finally the scope, each separated by a period (.). For example: service-manager!b105.entitlement.notify. Only the following characters are allowed: alphanumeric characters (aA-zZ) and (0-9), hyphen (-), underscore (_), forward slash (/), backslash (\\), and colon (:).
   * @return name  The name of this {@link Scope} instance.
  **/
  @Nonnull public String getName() {
    return name;
  }

  /**
  * Set the name of this {@link Scope} instance.
  *
  * @param name  The name of the application and scope as defined in the application security descriptor xs-security.json. The name has a maximum length of 193 characters, including the fully qualified application name. The fully qualified scope name starts with the application ID followed by an optional number of components and finally the scope, each separated by a period (.). For example: service-manager!b105.entitlement.notify. Only the following characters are allowed: alphanumeric characters (aA-zZ) and (0-9), hyphen (-), underscore (_), forward slash (/), backslash (\\), and colon (:).
  */
  public void setName( @Nonnull final String name) {
    this.name = name;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link Scope}.
   * @return The set of properties names
   */
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of the {@link Scope}.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("Scope has no field with name '" + name + "'.");
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
    final Scope scope = (Scope) o;
    return Objects.equals(this.cloudSdkCustomFields, scope.cloudSdkCustomFields) &&
        Objects.equals(this.customGrantAsAuthorityToApps, scope.customGrantAsAuthorityToApps) &&
        Objects.equals(this.customGrantedApps, scope.customGrantedApps) &&
        Objects.equals(this.description, scope.description) &&
        Objects.equals(this.grantAsAuthorityToApps, scope.grantAsAuthorityToApps) &&
        Objects.equals(this.grantedApps, scope.grantedApps) &&
        Objects.equals(this.name, scope.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customGrantAsAuthorityToApps, customGrantedApps, description, grantAsAuthorityToApps, grantedApps, name, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class Scope {\n");
    sb.append("    customGrantAsAuthorityToApps: ").append(toIndentedString(customGrantAsAuthorityToApps)).append("\n");
    sb.append("    customGrantedApps: ").append(toIndentedString(customGrantedApps)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    grantAsAuthorityToApps: ").append(toIndentedString(grantAsAuthorityToApps)).append("\n");
    sb.append("    grantedApps: ").append(toIndentedString(grantedApps)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

