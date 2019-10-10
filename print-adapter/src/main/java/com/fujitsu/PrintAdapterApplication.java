package com.fujitsu;

import com.fujitsu.business.MesToAdapterBusiness;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrintAdapterApplication implements CommandLineRunner {

	@Autowired
	MesToAdapterBusiness mesToAdapterBusiness;

	public static void main(String[] args) {
		SpringApplication.run(PrintAdapterApplication.class, args);
	}

	@Override
	public void run(String... args) {
		mesToAdapterBusiness.start();
	}

}
