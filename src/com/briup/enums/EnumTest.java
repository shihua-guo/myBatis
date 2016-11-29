package com.briup.enums;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.dynamic.S_Emp;
import com.briup.mappers.DynamicMapper;

import static com.briup.command.utils.MyBatisSqlSessionFactoryUtil.openSession;

import java.util.List;
public class EnumTest {
	/**
	 * @date 2016-09-29 21:54:40
	 * 测试插入enum
	 */
	@Test
	public void testAddEnum(){
		try {
			SqlSession session = openSession();
			EnumBean e = new EnumBean(1,Gender.MALE);
			session.insert("com.briup.book.EnumMapper.addEnum",e);
			session.commit();
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
