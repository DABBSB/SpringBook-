package com.dab.dabook.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dab.dabook.domain.Book;

public interface IBookServece extends IService<Book> {

    IPage getpage(Integer currentPage, Integer pageSize, Book book);
}

