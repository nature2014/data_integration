package jdbc;

import java.io.Serializable;

/**
 * Created by limin.llm on 2014/10/26.
 */
public class RequestParamater {
    private String identityCard;

    public RequestParamater() {
    }

    public RequestParamater(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }
}
