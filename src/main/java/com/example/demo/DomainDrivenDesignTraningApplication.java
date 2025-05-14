package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// Spring Bootのデータソースの初期化を防ぐ。今回はDB接続は行わないため。
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class DomainDrivenDesignTraningApplication {

	public static void main(
			String[] args) {
		SpringApplication.run(DomainDrivenDesignTraningApplication.class, args);
	}
}
