package com.jk.model;

import java.io.Serializable;

public class Test implements Serializable {

    private static final long serialVersionUID = 5532756005837282504L;

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
