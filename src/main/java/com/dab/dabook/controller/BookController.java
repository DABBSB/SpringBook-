package com.dab.dabook.controller;

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


    @GetMapping
    private RRR BookAll() {
        return new RRR(true, servise.list());
    }

    @DeleteMapping("/{id}")
    private RRR deleteBook(@PathVariable Integer id) {
        return new RRR(servise.removeById(id));
    }


    @PutMapping
    private RRR updateBook(@RequestBody Book book) {
        return new RRR(servise.updateById(book));
    }

    @PostMapping
    private RRR save(@RequestBody Book book) {
        return new RRR(true, servise.save(book));
    }
}
