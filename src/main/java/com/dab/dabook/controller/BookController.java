package com.dab.dabook.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.dab.dabook.domain.Book;
import com.dab.dabook.servise.IBookServise;
import org.springframework.web.bind.annotation.*;

//@PathVariable, @RequestBody
@RestController
@RequestMapping("/books")
public class BookController {

    private final IBookServise servise;

    public BookController(IBookServise servise) {
        this.servise = servise;
    }

    //查询全部
    @GetMapping
    private RRR BookAll() {
        return new RRR(true, servise.list());
    }

    //删除
    @DeleteMapping("/{id}")
    private RRR deleteBook(@PathVariable Integer id) {
        return new RRR(servise.removeById(id));
    }

    //修改
    @PutMapping
    private RRR updateBook(@RequestBody Book book) {
        return new RRR(servise.updateById(book));
    }

    //添加
    @PostMapping
    private RRR save(@RequestBody Book book) {
        return new RRR(true, servise.save(book));
    }

    //    id查询
    @GetMapping("/{id}")
    private RRR bookById(@PathVariable Integer id) {
        return new RRR(true, servise.getById(id));
    }

    //    分页查询
    @GetMapping("/{currentPage}/{pageSize}")
    public RRR Pages(@PathVariable int currentPage, @PathVariable int pageSize, Book book) {
        IPage<Book> iPage = servise.getPage(currentPage, pageSize, book);
        return new RRR(null != iPage, iPage);
    }
}
