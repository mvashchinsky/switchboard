/*
 * TeamCity REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2018.1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.devexperts.switchboard.integrations.teamcity.swagger.codegen.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

/**
 * Property
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-01T01:12:43.660+03:00")
@XmlRootElement(name = "property")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "property")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Property {
    @JsonProperty("name")
    @JacksonXmlProperty(isAttribute = true, localName = "name")
    @XmlAttribute(name = "name")
    private String name = null;

    @JsonProperty("value")
    @JacksonXmlProperty(isAttribute = true, localName = "value")
    @XmlAttribute(name = "value")
    private String value = null;

    @JsonProperty("inherited")
    @JacksonXmlProperty(isAttribute = true, localName = "inherited")
    @XmlAttribute(name = "inherited")
    private Boolean inherited = false;

    @JsonProperty("type")
    @JacksonXmlProperty(localName = "type")
    @XmlElement(name = "type")
    private Type type = null;

    public Property name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Property value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     **/
    @ApiModelProperty(value = "")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Property inherited(Boolean inherited) {
        this.inherited = inherited;
        return this;
    }

    /**
     * Get inherited
     *
     * @return inherited
     **/
    @ApiModelProperty(value = "")
    public Boolean isInherited() {
        return inherited;
    }

    public void setInherited(Boolean inherited) {
        this.inherited = inherited;
    }

    public Property type(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @ApiModelProperty(value = "")
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Property property = (Property) o;
        return Objects.equals(this.name, property.name) &&
                Objects.equals(this.value, property.value) &&
                Objects.equals(this.inherited, property.inherited) &&
                Objects.equals(this.type, property.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, inherited, type);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Property {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    inherited: ").append(toIndentedString(inherited)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

