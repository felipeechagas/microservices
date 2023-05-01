package fooconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FooConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FooConfigServerApplication.class, args);
	}

}
