package com.dab.dabook.servise.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dab.dabook.dao.BookDao;
import com.dab.dabook.domain.Book;
import com.dab.dabook.servise.IBookServise;
import org.springframework.stereotype.Service;

@Service
public class IBookServiseImpl extends ServiceImpl<BookDao, Book> implements IBookServise {

}
