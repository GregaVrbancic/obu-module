//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.23 at 10:32:12 AM CET 
//


package si.um.feri.obu.domain.xjc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for commandState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="commandState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="START"/>
 *     &lt;enumeration value="STOP"/>
 *     &lt;enumeration value="OPEN"/>
 *     &lt;enumeration value="CLOSE"/>
 *     &lt;enumeration value="RESTART"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "commandState")
@XmlEnum
public enum CommandState {

    START,
    STOP,
    OPEN,
    CLOSE,
    RESTART;

    public String value() {
        return name();
    }

    public static CommandState fromValue(String v) {
        return valueOf(v);
    }

}
