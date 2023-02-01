package com.thecoinkarma.blog.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;


//when unauthorized person tried to access authorized api....then we will send this error
@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint{
	
	//when unauthorized person tried to access authorized api....then we will send this error
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {

		response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Access Denied");
	}

}
