package nl.matrik.ws.orders.handlers;

import javax.xml.namespace.QName;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import java.util.Iterator;
import java.util.Set;


public class SiteHandler implements SOAPHandler<SOAPMessageContext> {




    @Override
    public boolean handleMessage(SOAPMessageContext context) {

        Boolean isResponse = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if(!isResponse) {

            SOAPMessage soapMessage = context.getMessage();

            try {

                SOAPEnvelope envelope = soapMessage.getSOAPPart().getEnvelope();
                SOAPHeader header = envelope.getHeader();
                Iterator childElements = header.getChildElements();

                while(childElements.hasNext()) {

                    Node eachNode = (Node) childElements.next();
                    String name = eachNode.getLocalName();

                    if(name != null && name.equals("SiteName")) {
                        System.out.println("Site name: " + eachNode.getValue());
                    }

                }

            } catch (SOAPException e) {
                e.printStackTrace();
            }


        } else {
            System.out.println("Response is on the way!");
        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return false;
    }

    @Override
    public void close(MessageContext context) {
    }

    @Override
    public Set<QName> getHeaders() {
        return null;
    }


}
