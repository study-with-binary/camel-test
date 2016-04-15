package cn.binarywang.java.camel.spring.xml;

import org.apache.camel.CamelContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlCamel {

    public static void main(String[] args) throws Exception {
        try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
            "camel-context.xml");) {
            CamelContext camelContext = context.getBean(CamelContext.class);

            camelContext.start();
            while (true) {
                Thread.sleep(10000);
            }

        }
    }
}
