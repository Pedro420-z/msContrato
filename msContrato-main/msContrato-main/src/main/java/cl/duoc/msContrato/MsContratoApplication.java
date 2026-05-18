package cl.duoc.msContrato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MsContratoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsContratoApplication.class, args);
	}

}
