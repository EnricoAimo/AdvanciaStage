package com.jaxws.series.top.down.approach.service;

import in.benchresources.entities.book.BookRequestType;
import in.benchresources.entities.book.BookResponseType;
import in.benchresources.services.bookservice.IBookService;
 
import javax.jws.WebService;
 
@WebService(serviceName="BookService", 
endpointInterface="in.benchresources.services.bookservice.IBookService")
public class BookServiceImpl implements IBookService {
 
    // http://localhost:8080/Metro-JAX-WS-Top-Down/services/BookService?wsdl - Apache Tomcat 7.x
    // http://localhost:7001/Metro-JAX-WS-Top-Down/services/BookService?wsdl - Oracle Weblogic 12c 
 
    @Override
    public BookResponseType getBookByISDNRequestNumber(BookRequestType parameters) {
 
        // create object of responseType and set values & return
        BookResponseType bookResponseType = new BookResponseType();
        bookResponseType.setBookISBN(parameters.getIsbnNumber());
        bookResponseType.setBookName("Microbiology Study");
        bookResponseType.setAuthor("T. Devasena");
        bookResponseType.setCategory("Microbiology");
        return bookResponseType;
    }
}