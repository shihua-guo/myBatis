package com.briup.test;

import static com.briup.command.utils.MyBatisSqlSessionFactoryUtil.openSession;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.bean.Address;
import com.briup.bean.User;

public class Test6 {

	/**
	 * date:2016-09-28 15:05:05 测试外键：user引入address的id作为外键
	 */
	@Test
	public void testAddress() {
		SqlSession session = openSession();
		User u = session.selectOne("com.briup.mappers.UserMapper.selectAddress", 1);
		System.out.println(u);
	}

	/**
	 * date:2016-09-28 16:25:53
	 * 测试TypeHandler：AddressHandler
	 * 遇到的错误：调用session.insert的时候没有把对象传进去
	 */
	@Test
	public void testTypeHandler(){
		try{
			Address a = new Address(3,"China","Guangdong","Dongguan");
			User u = new User(3,"cat",new Date(),a);
			SqlSession session = openSession();
			int i = session.insert("saveUser",u);
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
