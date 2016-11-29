package com.briup.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.briup.bean.Student;
import com.briup.mappers.StudentMapper;

public class Test {
	@org.junit.Test
	public void test(){
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			SqlSession session = factory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			Student stu = new Student(1,"jade","f",new Date());
			try {
				int count = mapper.updateById(stu);
				System.out.println("更新"+count+"行");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			session.commit();
			session.close();
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
		System.out.println("插入"+stumap.saveStu(stu)+"行");
		session.commit();
		session.close();
		is.close();
	}
}
