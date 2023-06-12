package com.javacodegeeks.examples.jaxws;
 
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface RandomQuoteService {
     
    @WebMethod
    public String getQuote();
    
    @WebMethod    
    public String ciao();
}