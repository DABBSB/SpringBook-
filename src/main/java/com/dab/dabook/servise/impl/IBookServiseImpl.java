package com.dab.dabook.servise.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dab.dabook.dao.BookDao;
import com.dab.dabook.domain.Book;
import com.dab.dabook.servise.IBookServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IBookServiseImpl extends ServiceImpl<BookDao, Book> implements IBookServise {
    //每个层级都有联系
    @Autowired
    public BookDao dao;

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage, pageSize);
        return dao.selectPage(page, null);
    }
}
