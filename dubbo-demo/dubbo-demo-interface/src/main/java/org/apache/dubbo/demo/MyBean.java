package org.apache.dubbo.demo;

import java.io.Serializable;

public class MyBean implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
