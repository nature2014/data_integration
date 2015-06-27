package com.cyznj.iservice;

import java.util.List;
import java.util.Map;

/**
 * Created by limin.llm on 2015/6/27.
 */
public interface PatientService {
    /**
     * 根据uid和上下文信息查询用户的资料
     *
     * @param uid
     * @param context
     * @return
     */
    public Map<String, Object> queryPatient(String uid, Map<String, Object> context);

    /**
     * 根据uid和上下文信息查询用户的历史资料列表
     *
     * @param uid
     * @param context
     * @return
     */
    public List<Map<String, Object>> queryPatientHistoryRecord(String uid, Map<String, Object> context);

}
