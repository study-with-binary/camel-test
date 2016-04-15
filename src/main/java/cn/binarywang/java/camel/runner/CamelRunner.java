package cn.binarywang.java.camel.runner;

import java.lang.reflect.Method;

public class CamelRunner {
    public static void main(String[] args) {
        try {
            Method method = org.apache.camel.main.Main.class.getMethod("main",
                String[].class);

            method.invoke(null, (Object) new String[] { "-r",
                "cn.binarywang.java.camel.TimerRouteBuilder" });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
