package com.spring.Dao;

public interface BookDao {

    Integer getBookPrice(Integer bookId);

    void updateBookStock(Integer bookId);

    void updateUserBalace(Integer userId,Integer price);
}
