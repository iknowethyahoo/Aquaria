package com.pricl.test.core.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.context.request.NativeWebRequest;

import com.pricl.test.core.Subject;
import com.pricl.test.core.util.SessionAttributesHolder;

public class ArgumentResolver implements WebArgumentResolver {
	@Override
	public Object resolveArgument(MethodParameter param,
			NativeWebRequest request) throws Exception {
		if (Subject.class.isAssignableFrom(param.getParameterType())) {
			Subject subject = SessionAttributesHolder.getSubject(request
					.getNativeRequest(HttpServletRequest.class));
			return subject;
		}
		return WebArgumentResolver.UNRESOLVED;
	}
}
