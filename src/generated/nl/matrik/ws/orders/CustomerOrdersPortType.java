package nl.matrik.ws.orders;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2017-10-21T18:53:15.082+02:00
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://orders.ws.matrik.nl/", name = "CustomerOrdersPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CustomerOrdersPortType {

    @WebMethod
    @WebResult(name = "getOrdersResponse", targetNamespace = "http://orders.ws.matrik.nl/", partName = "parameters")
    public GetOrdersResponse getOrders(
        @WebParam(partName = "parameters", name = "getOrdersRequest", targetNamespace = "http://orders.ws.matrik.nl/")
        GetOrdersRequest parameters
    );

    @WebMethod
    @WebResult(name = "createOrdersResponse", targetNamespace = "http://orders.ws.matrik.nl/", partName = "parameters")
    public CreateOrdersResponse createOrders(
        @WebParam(partName = "parameters", name = "createOrdersRequest", targetNamespace = "http://orders.ws.matrik.nl/")
        CreateOrdersRequest parameters
    );

    @WebMethod
    @WebResult(name = "deleteOrdersResponse", targetNamespace = "http://orders.ws.matrik.nl/", partName = "parameters")
    public DeleteOrdersResponse deleteOrders(
        @WebParam(partName = "parameters", name = "deleteOrdersRequest", targetNamespace = "http://orders.ws.matrik.nl/")
        DeleteOrdersRequest parameters
    );
}
