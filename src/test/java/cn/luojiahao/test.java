package cn.luojiahao;

import cn.luojiahao.domain.Orders;
import cn.luojiahao.domain.Role;
import cn.luojiahao.domain.User;
import cn.luojiahao.mapper.OrdersMapper;
import cn.luojiahao.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {

    @Test
    public void test() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<User> ordersList = mapper.findOrdersList();
        for (User user : ordersList) {
            System.out.println(user.getUsername());
            List<Orders> ordersList1 = user.getOrdersList();
            for (Orders orders : ordersList1) {
                System.out.println(orders);
            }
            //测试github
            System.out.println("----------------------");
        }
    }
    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allMap = mapper.findAllMap();
        for (User user : allMap) {
            System.out.println(user.getUsername());
            List<Role> roleList = user.getRoleList();
            for (Role role : roleList) {
                System.out.println(role);
            }
            System.out.println("----------------------");
        }
    }
}
