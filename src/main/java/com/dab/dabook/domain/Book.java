package com.dab.dabook.domain;

import lombok.Data;

@Data
public class Book {
    public Integer id;
    private String type;
    private String name;
    private String description;
}
