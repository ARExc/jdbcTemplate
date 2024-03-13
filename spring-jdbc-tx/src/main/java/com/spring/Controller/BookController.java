package com.spring.Controller;

import com.spring.Service.BookService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Resource
    private BookService bookService;

    public void buyBook(Integer bookId,Integer userId){
        bookService.buyBook(bookId,userId);
    }
}
