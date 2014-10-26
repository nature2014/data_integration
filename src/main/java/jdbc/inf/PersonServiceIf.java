package jdbc.inf;

import jdbc.Person;

import java.util.List;

/**
 * Created by limin.llm on 2014/10/26.
 */
public interface PersonServiceIf {
    public void handleMessage(List<Person> personList);
}
