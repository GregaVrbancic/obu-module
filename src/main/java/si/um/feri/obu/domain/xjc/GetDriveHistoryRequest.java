//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.11 at 10:15:57 AM CET 
//


package si.um.feri.obu.domain.xjc;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for getDriveHistoryRequest complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="getDriveHistoryRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OBUId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDriveHistoryRequest", propOrder = {
        "obuId"
})
@XmlRootElement(name = "getDriveHistoryRequest")
public class GetDriveHistoryRequest {

    @XmlElement(name = "OBUId", required = true)
    protected String obuId;

    /**
     * Gets the value of the obuId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOBUId() {
        return obuId;
    }

    /**
     * Sets the value of the obuId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOBUId(String value) {
        this.obuId = value;
    }

}
