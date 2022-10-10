package com.Shop_Ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude =DataSourceAutoConfiguration.class)
public class ShopEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopEcommerceApplication.class, args);
	}

}
