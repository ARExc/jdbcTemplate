package com.spring.Dao.Impl;

import com.spring.Dao.BookDao;
import jakarta.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer getBookPrice(Integer bookId) {
        String sql = "select price from t_book where book_id=?";
        return jdbcTemplate.queryForObject(sql,Integer.class,bookId);
    }

    @Override
    public void updateBookStock(Integer bookId) {
        String sql = "update t_book set stock=stock-1 where book_id = ?";
        jdbcTemplate.update(sql,bookId);
    }

    @Override
    public void updateUserBalace(Integer userId,Integer price) {
        String sql = "update t_user set balance =balance-? where user_id = ?";
        jdbcTemplate.update(sql,userId);
    }
}
