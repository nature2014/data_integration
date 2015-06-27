package com.cyznj.iservice;

import com.cyznj.domain.RequestContext;
import gateway.DataQueryGateway;

import com.cyznj.domain.RequestContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by limin.llm on 2015/6/27.
 */
public class PatientServiceImpl implements PatientService {
    private DataQueryGateway dataQueryGateway;

    public DataQueryGateway getDataQueryGateway() {
        return dataQueryGateway;
    }

    public void setDataQueryGateway(DataQueryGateway dataQueryGateway) {
        this.dataQueryGateway = dataQueryGateway;
    }


    @Override
    public Map<String, Object> queryPatient(String uid, Map<String, Object> parameters, RequestContext requestContext) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("name", "peterli");
        return result;
    }

    @Override
    public List<Map<String, Object>> queryPatientHistoryRecord(String uid, Map<String, Object> parameters, RequestContext requestContext) {
        String requestXml = "<getPatientByIdentityRequest xmlns=\"http://www.cyznj.com/patients\"><identity>320106700320243102</identity></getPatientByIdentityRequest>";
        String result = dataQueryGateway.queryData(requestXml);
        return null;
    }
}
