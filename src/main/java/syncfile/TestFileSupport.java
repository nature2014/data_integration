package syncfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFileSupport {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-integration-file-context.xml");
    }
}
