package com.yuconggen.mybatis.test;

import com.yuconggen.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class User {
//    @Test
//    public void insertTest() throws IOException {
//        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
//        SqlSession sqlSession = build.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        int i = mapper.insertUser();
//        sqlSession.commit();
//        System.out.println("result" + i);
//    }
//
//    @Test
//    public void deleteTest() throws IOException {
//        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
//        SqlSession sqlSession = build.openSession(true);
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        int i = mapper.deleteuser();
////        sqlSession.commit();
//        System.out.println("result" + i);
//    }
//
//    @Test
//    public void selectTest() throws IOException {
//        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
//        SqlSession sqlSession = build.openSession(true);
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<com.com.yuconggen.mybatis.pojo.User> i = mapper.selectUser();
////        sqlSession.commit();
//        for (com.com.yuconggen.mybatis.pojo.User user : i) {
//            System.out.println(user);
//        }
//        i.forEach(user -> System.out.println(user));
////        System.out.println("result"+i);
//    }
//
//    @Test
//    public void selectAllTest() {
//        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<com.com.yuconggen.mybatis.pojo.User> users = mapper.selectUser();
//        users.forEach(user -> System.out.println(user));
//
//    }
//
//    @Test
//    public void loginTest() {
//        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
////        List<com.com.yuconggen.mybatis.pojo.User> users = mapper.selectUser();
//        com.com.yuconggen.mybatis.pojo.User user;
//        user = mapper.loginuser("111yu", 22);
//        System.out.println(user);
//
//    }
//
//    @Test
//    public void loginTest1() {
//        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
////        List<com.com.yuconggen.mybatis.pojo.User> users = mapper.selectUser();
//        com.yuconggen.mybatis.pojo.User user;
//        user = mapper.loginuser1(new com.yuconggen.mybatis.pojo.User(1,"yu", 27, "1", "111@qq.com"));
//        System.out.println(user);
//
//    }

//    @Test
//    public void insertAllMap1() {
//        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
////        List<com.com.yuconggen.mybatis.pojo.User> users = mapper.selectUser();
//       int i = mapper.insertUser1();
//        System.out.println(i);
//    }

}
