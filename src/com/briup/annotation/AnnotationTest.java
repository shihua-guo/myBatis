package com.briup.annotation;

import static com.briup.command.utils.MyBatisSqlSessionFactoryUtil.openSession;

import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.mappers.AnnotationMapper;

public class AnnotationTest {
	/*
	 * @date 2016-09-29 11:21:20 测试注解
	 */
	@Test
	public void testAnnotation() {
		try {
			
			/*
			 * 这个是测试如何获取数据源
			DataSourceFactory d = new UnpooledDataSourceFactory(); 
			d.getDataSource();*/
			SqlSession session = openSession();
			AnnotationMapper mapper = session.getMapper(AnnotationMapper.class);
			AStudent s = mapper.selectAnnotation(1);
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
