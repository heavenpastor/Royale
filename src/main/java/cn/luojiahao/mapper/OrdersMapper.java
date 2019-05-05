package cn.luojiahao.mapper;

import cn.luojiahao.domain.Orders;
import cn.luojiahao.domain.User;

import java.util.List;

public interface OrdersMapper {
    public List<Orders> findAll();
    public List<User> findOrdersList();
}
