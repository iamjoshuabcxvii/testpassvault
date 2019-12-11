package testpassvault.demo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SecretStuffConfig.class)
@Slf4j
public class DemoApplication implements CommandLineRunner {

    public DemoApplication(SecretStuffConfig secretStuffConfig) {
        this.secretStuffConfig = secretStuffConfig;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    private final SecretStuffConfig secretStuffConfig;

    @Override
    public void run(String... args) throws Exception {
        log.info("*** secret username: " + secretStuffConfig.getUser());
        log.info("*** secret password: " + secretStuffConfig.getPassword());
        log.info("*** secret car: " + secretStuffConfig.getCar());
    }

}
