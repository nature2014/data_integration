package com.cyznj.domain;

/**
 * Created by limin.llm on 2015/6/27.
 */
public class RequestContext {
    /**
     * 默认请求类型
     */
    private ServiceType serviceType = ServiceType.WS;

    /**
     * 请求的客户端标识
     */
    private String appClient;

    /**
     * 验证的sign签名
     */
    private String appSecurity;

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public String getAppClient() {
        return appClient;
    }

    public void setAppClient(String appClient) {
        this.appClient = appClient;
    }

    public String getAppSecurity() {
        return appSecurity;
    }

    public void setAppSecurity(String appSecurity) {
        this.appSecurity = appSecurity;
    }

    public enum ServiceType {
        WS, JDBC, REST;
    }
}
