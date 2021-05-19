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
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

/**
 * Type
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-01T01:12:43.660+03:00")
@XmlRootElement(name = "type")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "type")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Type {
    @JsonProperty("rawValue")
    @JacksonXmlProperty(isAttribute = true, localName = "rawValue")
    @XmlAttribute(name = "rawValue")
    private String rawValue = null;

    public Type rawValue(String rawValue) {
        this.rawValue = rawValue;
        return this;
    }

    /**
     * Get rawValue
     *
     * @return rawValue
     **/
    @ApiModelProperty(value = "")
    public String getRawValue() {
        return rawValue;
    }

    public void setRawValue(String rawValue) {
        this.rawValue = rawValue;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Type type = (Type) o;
        return Objects.equals(this.rawValue, type.rawValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rawValue);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Type {\n");

        sb.append("    rawValue: ").append(toIndentedString(rawValue)).append("\n");
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

