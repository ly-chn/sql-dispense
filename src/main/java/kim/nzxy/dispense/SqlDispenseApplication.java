package kim.nzxy.dispense;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@SpringBootApplication
@EnableWebMvc
public class SqlDispenseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqlDispenseApplication.class, args);
    }

}
