package com.dab.dabook.servise;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dab.dabook.domain.Book;

public interface IBookServise extends IService<Book> {
    IPage<Book> getPage(int currentPage, int pageSize, Book book);
}
