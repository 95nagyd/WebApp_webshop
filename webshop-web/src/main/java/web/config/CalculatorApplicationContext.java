package web.config;
import hu.iit.me.CalculatorController;
import hu.iit.me.service.BasicCalculator;
import hu.iit.me.service.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorApplicationContext {

    @Bean
    public CalculatorController calculatorController(){
        return new CalculatorController(calculator());
    }

    @Bean
    public Calculator calculator(){
        return new BasicCalculator();
    }

    @Bean
    public  String helloWorld(){
        return "hello world!";
    }
}
