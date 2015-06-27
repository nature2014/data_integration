package syncfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 同步src/input src/output目录文件，
 * 测试：在src/input目录下创建个新文件，立即同步到output目录
 */
public class TestFileSupport {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-integration-file-context.xml");
    }
}
