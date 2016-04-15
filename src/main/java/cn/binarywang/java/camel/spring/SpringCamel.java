package cn.binarywang.java.camel.spring;

import org.apache.camel.CamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCamel {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(
            AppConfig.class);
        System.err.println(ctx);
        CamelContext a = ctx.getBean(CamelContext.class);
        a.start();

        while (true) {
            Thread.sleep(2000);
        }
    }
}
