
package com.nttdata.sf.partner;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InvalidFieldFault", targetNamespace = "urn:fault.partner.soap.sforce.com")
public class InvalidFieldFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidFieldFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public InvalidFieldFault_Exception(String message, InvalidFieldFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public InvalidFieldFault_Exception(String message, InvalidFieldFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.nttdata.sf.partner.InvalidFieldFault
     */
    public InvalidFieldFault getFaultInfo() {
        return faultInfo;
    }

}
