package com.scu.wang;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * wangshengqiang
 */
public class Bean {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer age;

    public Bean() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
