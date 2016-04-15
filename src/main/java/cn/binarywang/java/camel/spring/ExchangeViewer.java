package cn.binarywang.java.camel.spring;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ExchangeViewer implements Processor {
    @Override
    public void process(Exchange exchange) {
        System.err.println(exchange.getIn());
        System.err.println(ToStringBuilder.reflectionToString(exchange));
    }
}