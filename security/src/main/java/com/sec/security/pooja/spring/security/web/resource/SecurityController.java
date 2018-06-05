package com.sec.security.pooja.spring.security.web.resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sec.security.pooja.spring.security.web.wrapper.ExampleClass;

@RestController
public class SecurityController {

	@GetMapping("/unsecured")
	public ExampleClass getUnsecuredResponse() {
		return new ExampleClass("Summer of 69", "Hotel California");
	}

	@GetMapping("/secured")
	public ExampleClass getSecuredResponse() {
		return new ExampleClass("Summer of 69 Secured", "Hotel California secured");
	}

	@GetMapping("/admin")
	@PreAuthorize("hasAuthority('ROLE_WRITE')")
	public ExampleClass getAdminRes() {
		return new ExampleClass("ADMIN", "YYYY");

	}

}
