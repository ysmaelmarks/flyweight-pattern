package one.digitalinnovation.runemaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunemakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunemakerApplication.class, args);

		var filledbackpack = new Backpack();
		filledbackpack.useRunes();
	}

}
