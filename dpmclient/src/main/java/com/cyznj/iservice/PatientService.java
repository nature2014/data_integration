package com.cyznj.iservice;

import com.cyznj.domain.RequestContext;

import java.util.List;
import java.util.Map;

/**
 * Created by limin.llm on 2015/6/27.
 */
public interface PatientService {
    /**
     * 根据uid和上下文信息查询用户的资料
     * uid:为应用系统的唯一性标识
     *
     * @param uid            为应用系统的唯一性标识
     * @param parameters     请求参数
     * @param requestContext 请求上下文
     * @return
     */
    public Map<String, Object> queryPatient(String uid, Map<String, Object> parameters, RequestContext requestContext);

    /**
     * 根据uid和上下文信息查询用户的历史资料列表
     *
     * @param uid            为应用系统的唯一性标识
     * @param parameters     请求参数
     * @param requestContext 请求上下文
     * @return
     */
    public List<Map<String, Object>> queryPatientHistoryRecord(String uid, Map<String, Object> parameters, RequestContext requestContext);

}
