package com.damon.prop;

import java.io.Serializable;

/**
 * @author damon
 */
public interface Api extends Serializable {

    /**
     * 得到方法名称
     * @return 方法名称
     */
    String getApiMethod();

    /**
     * 得到api的Url
     * @return url路径
     */
    String getApiUrl();
}
