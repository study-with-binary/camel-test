package cn.binarywang.java.camel;

import org.apache.camel.main.Main;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyCamelMain extends Main {
    static Logger LOGGER = LoggerFactory.getLogger(MyCamelMain.class);

    @Test
    public void main() {
        String[] args = { "-t" };
        MyCamelMain main = new MyCamelMain();
        main.addRouteBuilder(new TimerRouteBuilder());
        try {
            main.run(args);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
    }
}
