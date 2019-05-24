package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	/**
	 * Запуск сервиса
	 * @param args
	 */

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
