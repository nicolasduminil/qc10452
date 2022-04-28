
package com.grdf.poc.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "qc10452Literal", namespace = "http://poc.grdf.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qc10452Literal", namespace = "http://poc.grdf.com/")
public class Qc10452Literal {

    @XmlElement(name = "data2literal", namespace = "")
    private String data2Literal;

    /**
     * 
     * @return
     *     returns String
     */
    public String getData2Literal() {
        return this.data2Literal;
    }

    /**
     * 
     * @param data2Literal
     *     the value for the data2Literal property
     */
    public void setData2Literal(String data2Literal) {
        this.data2Literal = data2Literal;
    }

}
