package cn.edu.xmu.other;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"cn.edu.xmu.other"})
@MapperScan("cn.edu.xmu.other.mapper")
@EnableSwagger2
public class OtherServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(OtherServiceApplication.class, args);
	}
}
