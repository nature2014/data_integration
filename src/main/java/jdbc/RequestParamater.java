package jdbc;

import java.io.Serializable;

/**
 * Created by limin.llm on 2014/10/26.
 */
public class RequestParamater {
    private String name;
    private String identityCard;

    RequestParamater() {
    }

    RequestParamater(String name, String identityCard) {
        this.name = name;
        this.identityCard = identityCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }
}
