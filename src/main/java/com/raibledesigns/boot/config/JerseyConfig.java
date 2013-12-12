package com.raibledesigns.boot.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import com.raibledesigns.boot.service.HelloService;

@ApplicationPath("v1.0")
public class JerseyConfig extends ResourceConfig  {

	public JerseyConfig() {
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
        property(ServerProperties.JSON_PROCESSING_FEATURE_DISABLE, false);
        property(ServerProperties.MOXY_JSON_FEATURE_DISABLE, true);
        property(ServerProperties.WADL_FEATURE_DISABLE, true);
        register(HelloService.class);
        register(LoggingFilter.class);
        register(JacksonFeature.class);
    }

}