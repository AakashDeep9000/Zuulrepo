package com.stackroute.maverick.springbootzuulgatwayproxy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtAuthenticationConfig {

    @Value("${apigateway.security.jwt.url:/login}")
    private String url;

    @Value("${apigateway.security.jwt.header:Authorization}")
    private String header;

    @Value("${apigateway.security.jwt.prefix:Bearer}")
    private String prefix;

    @Value("${apigateway.security.jwt.expiration:#{24*60*60}}")
    private int expiration; // default 24 hours

	@Value("${apigateway.security.jwt.secret}")
    private String secret;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public int getExpiration() {
		return expiration;
	}

	public void setExpiration(int expiration) {
		this.expiration = expiration;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}
    
    
}
