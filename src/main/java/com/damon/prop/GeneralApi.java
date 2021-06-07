package com.damon.prop;

import com.alibaba.fastjson.JSON;

/**
 * @author damon
 */
public class GeneralApi extends AbstractApi{
    private String apiUrl;
    private String apiName;

    private String realName;

    @Override
    public String getApiUrl() {
        return "得到api的Url";
    }

    public String getAddress(){
        return "address";
    }

    public static void main(String[] args) {
        GeneralApi generalApi = new GeneralApi();
        generalApi.setApiName("11");
        generalApi.setApiUrl("22");
        generalApi.setRealName(" damon fan");
        do1(generalApi);
    }

    public static void do1(Api abstractApi){
        System.out.println(JSON.toJSONString(abstractApi));
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
