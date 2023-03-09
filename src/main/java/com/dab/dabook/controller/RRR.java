package com.dab.dabook.controller;

import lombok.Data;

@Data
public class RRR {
    private Boolean flag;
    private Object data;

    public RRR(Boolean flag) {
        this.flag = flag;
    }

    public RRR(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public RRR() {
    }
}
