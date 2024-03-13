package com.spring.Service.Impl;

import com.spring.Dao.BookDao;
import com.spring.Service.BookService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookDao bookDao;

    @Override
    public void buyBook(Integer bookId, Integer userId) {
        Integer price = bookDao.getBookPrice(bookId);

        bookDao.updateBookStock(bookId);

        bookDao.updateUserBalace(userId,price);
    }
}
