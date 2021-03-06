package com.briup.many2one;
import static com.briup.command.utils.MyBatisSqlSessionFactoryUtil.openSession;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.mappers.Many2OneMapper;
public class M2OTest {
	
	
	/**
	 * @date 2016-09-28 21:48:33
	 * 测试多对一，获取班级的同时获取班级里面的所有同学
	 */
	@Test
	public void testSelectClzStusByCid(){
		try {
			SqlSession session = openSession();
			Many2OneMapper mapper = session.getMapper(Many2OneMapper.class);
			OneClz c = mapper.selectClzStusByCid2(1);
			System.out.println(c);
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @date 2016-09-28 22:16:14
	 * 测试单独获取同学，不要班级
	 */
	@Test
	public void testSelectStusByid(){
		try {
			SqlSession session = openSession();
			Many2OneMapper mapper = session.getMapper(Many2OneMapper.class);
			MStudent s = mapper.selectStusByid(1);
			System.out.println(s);
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @date 2016-09-28 22:23:09
	 * 测试单独获取班级，不要同学
	 */
	@Test
	public void testSelectClzByid(){
		try {
			SqlSession session = openSession();
			Many2OneMapper mapper = session.getMapper(Many2OneMapper.class);
			OneClz c = mapper.selectClzByid(1);
			System.out.println(c);
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @date 2016-09-29 00:14:48
	 * 测试使用子查询：
	 * 通过CID查询班级，再查询学生
	 */
	@Test
	public void testSelectStusByCid(){
		try {
			SqlSession session = openSession();
			Many2OneMapper mapper = session.getMapper(Many2OneMapper.class);
			OneClz c = mapper.selectClzStusByCid2(1);
			System.out.println(c);
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @date 2016-10-08 19:42:47 测试通过map，插入班级id到Stu.
	 * 在xml中可以直接用map的key值调用存入对象的属性。
	 */
	@Test
	public void testInsertClzInStu(){
		try {
			SqlSession session = openSession();
			Many2OneMapper mapper = session.getMapper(Many2OneMapper.class);
			Map<String,Object> map = new HashMap<String,Object>();
			MStudent stu = new MStudent(3, "bob");
			OneClz clz = new OneClz(1,"briup" );
			map.put("stu", stu);
			map.put("clz", clz);
			mapper.insertClzInStu(map);
			session.commit();
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
