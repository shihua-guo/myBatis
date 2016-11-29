package com.briup.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.briup.bean.Teacher;

public class FindTest {
	public static void main(String[] args) throws Exception{
		InputStream inputStream = 
				Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		session.getConnection();
		Teacher t = session.selectOne("com.briup.mappers.TeacherMapper.find");
		System.out.println(t.toString());
		/*
		 * 用于测试缓存，当运行同一条语句期间，使用sqlplus修改了表的内容，但是
		 * mybatis查询的依然是修改前的结果：
		 * 直接调用缓存的结果
		 */
//		Thread.sleep(10000);
//		Teacher t2 = session.selectOne("com.briup.mappers.TeacherMapper.find");
//		System.out.println(t2.toString());
		
	}
}
