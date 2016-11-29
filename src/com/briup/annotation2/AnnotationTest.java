package com.briup.annotation2;

import static com.briup.command.utils.MyBatisSqlSessionFactoryUtil.openSession;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.autoKey.AutoBean;;
public class AnnotationTest {
	/**
	 * @date 2016-09-30 17:14:44
	 * 测试注解:使用id查询单个结果
	 */
	@Test
	public void testAnnoSelect(){
		try {
			SqlSession session = openSession();
			System.out.println(session);
			AnnotationMapper mapper = session.getMapper(AnnotationMapper.class);
			AutoBean auto = mapper.selectById(3);
			System.out.println(auto);
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @date 2016-09-30 17:14:27
	 * 测试注解：查询所有结果
	 */
	@Test
	public void testSelectAll(){
		try {
			SqlSession session = openSession();
			System.out.println(session);
			AnnotationMapper mapper = session.getMapper(AnnotationMapper.class);
			List<AutoBean> auto = mapper.selectAll();
			for(AutoBean a:auto){
				System.out.println(a);
			}
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
