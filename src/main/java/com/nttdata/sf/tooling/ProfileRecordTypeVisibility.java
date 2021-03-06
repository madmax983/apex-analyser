
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileRecordTypeVisibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileRecordTypeVisibility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="default" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="personAccountDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="recordType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileRecordTypeVisibility", propOrder = {
    "_default",
    "personAccountDefault",
    "recordType",
    "visible"
})
public class ProfileRecordTypeVisibility {

    @XmlElement(name = "default")
    protected boolean _default;
    protected Boolean personAccountDefault;
    @XmlElement(required = true)
    protected String recordType;
    protected boolean visible;

    /**
     * Gets the value of the default property.
     * 
     */
    public boolean isDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     */
    public void setDefault(boolean value) {
        this._default = value;
    }

    /**
     * Gets the value of the personAccountDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonAccountDefault() {
        return personAccountDefault;
    }

    /**
     * Sets the value of the personAccountDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonAccountDefault(Boolean value) {
        this.personAccountDefault = value;
    }

    /**
     * Gets the value of the recordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordType() {
        return recordType;
    }

    /**
     * Sets the value of the recordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordType(String value) {
        this.recordType = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     */
    public void setVisible(boolean value) {
        this.visible = value;
    }

}
