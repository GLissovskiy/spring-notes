package info.javalab.springbootapplicationframework;

import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootApplicationFrameworkApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				SpringApplication.run(SpringbootApplicationFrameworkApplication.class, args);
	
		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}
}
