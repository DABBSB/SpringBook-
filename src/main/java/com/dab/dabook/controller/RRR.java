package com.dab.dabook.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.dab.dabook.domain.Book;

public class RRR {
    public Boolean flag;
    public Object data;

    public RRR() {
    }

    public RRR(Boolean flag) {
        this.flag = flag;
    }

    public RRR(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }


    public RRR(IPage<Book> page) {
        this.data = page;
    }
}
