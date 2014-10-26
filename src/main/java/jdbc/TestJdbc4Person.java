package jdbc;

import jdbc.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Starts the Spring Context and will initialize the Spring Integration routes.
 *
 * @author Gunnar Hillert
 * @author Amol Nayak
 * @version 1.0
 */
public final class TestJdbc4Person {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestJdbc4Person.class);

    private TestJdbc4Person() {
    }

    /**
     * Load the Spring Integration Application Context
     *
     * @param args - command line arguments
     */
    public static void main(final String... args) {

        LOGGER.info("开始执行");

        final AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-integration-jdbc-context.xml");
        context.registerShutdownHook();
        context.start();
    }

}
