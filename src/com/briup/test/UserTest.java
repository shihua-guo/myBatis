package com.briup.test;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.bean.User;
import com.briup.mappers.UserMapper;

import static  com.briup.command.utils.MyBatisSqlSessionFactoryUtil.openSession;

import java.util.List;
public class UserTest {
	@Test
	public void selectAll(){
		try {
			SqlSession session = openSession();
			UserMapper mapper = session.getMapper(UserMapper.class);
			List<User> userList = mapper.selectAll();
			for(User u:userList){
				System.out.println(u);
			}
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
