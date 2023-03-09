package com.dab.dabook.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dab.dabook.domain.Book;
import com.dab.dabook.service.IBookServece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class ControllerBook {
    @Autowired
    private IBookServece service;

    //    查询全部
    @GetMapping
    private RRR getAll() {
        return new RRR(true, service.list());
    }

    //    id查询
    @GetMapping("/{id}")
    private RRR getById(@PathVariable Integer id) {
        return new RRR(true, service.getById(id));
    }

    //    增加
    @PostMapping
    private RRR save(@RequestBody Book book) {
        return new RRR(true, service.save(book));
    }

    //删除
    @DeleteMapping("/{id}")
    private RRR delete(@PathVariable Integer id) {
        return new RRR(true, service.removeById(id));
    }

    //    修改
    @PutMapping()
    private RRR update(@RequestBody Book book) {
        return new RRR(true, service.updateById(book));
    }

    //    分页
    @GetMapping("/{currentPage}/{PageSize}")
    private RRR page(@PathVariable Integer currentPage, @PathVariable Integer PageSize, Book book) {
        IPage page = service.getpage(currentPage, PageSize, book);
        return new RRR(page != null, page);
    }
}
