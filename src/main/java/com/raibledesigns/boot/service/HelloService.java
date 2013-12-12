package com.raibledesigns.boot.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@Path("/hello")
@XmlRootElement
@Component
public class HelloService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
   	public Message message() {
   		return new Message("Hello World");
   	}
}
