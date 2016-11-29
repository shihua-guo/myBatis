package com.briup.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.briup.bean.Teacher;
import com.briup.mappers.TeacherMapper;

public class TestT {
	public static void main(String[] args) {
		//get the input stream of the xml file
		InputStream is = null;
		SqlSession session = null;
		try {
			is = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory factory = new SqlSessionFactoryBuilder()
					.build(is);
			session = factory.openSession();
			TeacherMapper mapper = session.getMapper(TeacherMapper.class);
			Teacher t = new Teacher(2,"jade",10);
			mapper.save(t);
			session.commit();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			System.out.println(session==null);
			if(session!=null){
				session.close();
			}
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
