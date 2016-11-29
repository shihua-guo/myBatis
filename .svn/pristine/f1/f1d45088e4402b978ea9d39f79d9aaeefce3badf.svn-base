package com.briup.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.briup.bean.Student;
import com.briup.bean.Teacher;
import com.briup.mappers.StudentMapper;
public class Test2 {
	
	/*
	 * 测试没有了XxxMapper.java接口是否能使用
	 * 直接调用xml中的sql语句namespace+id
	 */
	@Test
	public void testInsertMapper(){
		try {
			InputStream is = 
					Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory factory = 
					new SqlSessionFactoryBuilder().build(is);
			SqlSession session = factory.openSession();
			//sql+parameter
			Teacher t = session.selectOne("com.briup.mappers.TeacherMapper.find");
			System.out.println(t.toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory = 
				new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		StudentMapper stumap =session.getMapper(StudentMapper.class);
		Student stu = new Student(1,"alan","m",new Date());
		stumap.saveStu(stu);
		session.commit();
		session.close();
		is.close();
	}
}
