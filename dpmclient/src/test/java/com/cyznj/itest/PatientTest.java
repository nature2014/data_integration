package com.cyznj.itest;

import com.caucho.hessian.client.HessianProxyFactory;
import com.cyznj.iservice.PatientService;

import java.util.Map;

/**
 * Created by limin.llm on 2015/6/27.
 */
public class PatientTest {
    public static void main(String[] args) {
        try {
            String url = "http://localhost/patientservice";
            HessianProxyFactory factory = new HessianProxyFactory();
            PatientService helloService = (PatientService) factory.create(
                    PatientService.class, url);
            Map<String, Object> result = helloService.queryPatient("320106700320243102", null);
            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
