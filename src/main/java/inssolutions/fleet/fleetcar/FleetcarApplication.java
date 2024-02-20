package inssolutions.fleet.fleetcar;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class FleetcarApplication {

	public static void main(String[] args) {
		SpringApplication.run(FleetcarApplication.class, args);
	}

}
