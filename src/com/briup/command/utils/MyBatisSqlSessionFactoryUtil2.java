package com.briup.command.utils;

import java.io.IOException;
import java.io.InputStream;

import javax.management.RuntimeErrorException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSqlSessionFactoryUtil2 {
	private static SqlSessionFactory sf;
	public static SqlSessionFactory getInstance(){
		
		try {
			if(sf==null){
				InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
				//如果一个参数运行就是默认的。
				sf = new SqlSessionFactoryBuilder().build(is,"shoppingcart");
				System.out.println(sf);
				is.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} 
		return sf;
	}
	public static SqlSession openSession(){
		return getInstance().openSession();
	}
}
