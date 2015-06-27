package com.cyznj.iservice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by limin.llm on 2015/6/27.
 */
public class PatientServiceImpl implements PatientService {
    @Override
    public Map<String, Object> queryPatient(String uid, Map<String, Object> context) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("name", "peterli");
        return result;
    }

    @Override
    public List<Map<String, Object>> queryPatientHistoryRecord(String uid, Map<String, Object> context) {
        return null;
    }
}
