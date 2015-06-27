package jdbc.service;

import jdbc.Person;
import jdbc.RequestParamater;
import jdbc.inf.PersonServiceIf;

import java.util.Arrays;
import java.util.List;


/**
 * 获取患者的业务处理逻辑
 */
public class PersonService implements PersonServiceIf {
    /**
     * 我们可以实现数据持久化到MongoDB，通常这是批量获取外部数据的接口，采用
     * 定时任务获取
     *
     * @param personList
     */
    public void handleMessage(List<Person> personList) {
        System.out.println(Arrays.deepToString(personList.toArray()));
    }

}
