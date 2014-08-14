package be.vdab;

import java.math.BigDecimal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.gaming.Spelletje;
import be.vdab.restclient.CreateRestClientBeans;
import be.vdab.service.CreateServiceBeans;
import be.vdab.service.EuroService;

public class Main {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("container.xml")) {
			System.out.println(context.getBean(Spelletje.class).getAantalVijanden());
		}

	}

}
