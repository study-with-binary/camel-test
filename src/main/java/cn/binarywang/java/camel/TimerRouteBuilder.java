package cn.binarywang.java.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimerRouteBuilder extends RouteBuilder {
    static Logger LOG = LoggerFactory.getLogger(TimerRouteBuilder.class);

    @Override
    public void configure() {
        from("timer://timer1?period=1000").process(new Processor() {
            public void process(Exchange msg) {
                LOG.info("Processing {}", msg);
            }
        });
    }
}
