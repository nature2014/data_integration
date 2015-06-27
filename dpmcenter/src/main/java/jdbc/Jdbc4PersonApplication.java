package jdbc;

import jdbc.inf.HisPersonServiceIf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Starts the Spring Context and will initialize the Spring Integration.
 * 需要在某个地方调用stop方法以便停止这个Application服务中间件
 */
public final class Jdbc4PersonApplication implements HisPersonServiceIf<Person> {
    static final Jdbc4PersonApplication jdbcService = new Jdbc4PersonApplication();
    private static final Logger LOGGER = LoggerFactory.getLogger(Jdbc4PersonApplication.class);
    private static final AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-integration-jdbc-context.xml");
    private static volatile boolean active = false;

    /**
     * 单例初始化容器
     */
    private Jdbc4PersonApplication() {
    }

    public static Jdbc4PersonApplication getInstance() {
        if (!active) {
            synchronized (Jdbc4PersonApplication.class) {
                if (!active) {
                    LOGGER.warn("开始启动容器");
                    context.registerShutdownHook();
                    context.start();
                    active = true;
                }
            }
        }
        return jdbcService;
    }

    /**
     * 主动调用的接口关闭容器
     */
    public void stop() {
        if (active) {
            context.stop();
            context.close();
            LOGGER.warn("结束执行");
        }
    }

    protected void finalize() {
        if (active) {
            context.stop();
            context.close();
            LOGGER.warn("结束执行");
        }
    }

    /**
     * 包装类，避免调用方使用容器
     *
     * @param requestParamater
     * @return
     */
    public Person findPersonByIdentityCard(RequestParamater requestParamater) {
        HisPersonServiceIf<Person> hisPersonServiceIf = context.getBean("hisPersonService", HisPersonServiceIf.class);
        Person person = hisPersonServiceIf.findPersonByIdentityCard(requestParamater);
        return person;
    }

    /**
     * Load the Spring Integration Application Context
     *
     * @param args - command line arguments
     */
    public static void main(final String... args) {
        LOGGER.info("开始执行");
        Person person = Jdbc4PersonApplication.getInstance().findPersonByIdentityCard(new RequestParamater("34088119850323341"));
        System.out.println(person);
        LOGGER.info("结束执行");
        Jdbc4PersonApplication.getInstance().stop();
    }

}
