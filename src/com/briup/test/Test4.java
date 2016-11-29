package com.briup.test;

import static com.briup.command.utils.MyBatisSqlSessionFactoryUtil.openSession;
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
public class Test4 {
	
	/*
	 * 测试使用工具类直接获取Sqlsession
	 * 。。。。静态导入
	 */
	@Test
	public void testUtil(){
		SqlSession session = openSession();
		//sql+parameter
		Teacher t = session.selectOne("com.briup.mappers.TeacherMapper.find");
		System.out.println(t.toString());
	}
	
	/**
	 * 测试插入
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
