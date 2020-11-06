package com.damon.prop;

/**
 * @author damon
 */
public abstract class AbstractApi implements Api{
    @Override
    public String getApiMethod() {
        return "api方法名称";
    }
}
