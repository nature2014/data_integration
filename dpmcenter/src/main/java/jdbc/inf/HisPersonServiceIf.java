package jdbc.inf;

import jdbc.Person;
import jdbc.RequestParamater;

/**
 * Created by limin.llm on 2014/11/9.
 */
public interface HisPersonServiceIf<T> {
    /**
     * 根据用户的身份证查询用户信息
     *
     * @param requestParamater
     * @return
     */
    <T> T findPersonByIdentityCard(RequestParamater requestParamater);
}
