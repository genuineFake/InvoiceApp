package org.genuinefake;

import org.genuinefake.scope.SessionReplicationAwareScopeMetadataResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(scopeResolver = SessionReplicationAwareScopeMetadataResolver.class)
public class InvoiceappApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvoiceappApplication.class, args);
	}
}
