package com.briup.dynamic;

import static com.briup.command.utils.MyBatisSqlSessionFactoryUtil.openSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.mappers.DynamicMapper;

public class DynamicTest {
	/*
	 * @date 2016-09-29 14:58:04 测试动态SQL语句：If 给函数传入参数的Map
	 */
	@Test
	public void testSelectByIf() {
		try {
			SqlSession session = openSession();
			DynamicMapper mapper = session.getMapper(DynamicMapper.class);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("title", "Stock Clerk");
			map.put("minSalary", 1000);
			List<S_Emp> s = mapper.selectByIf(map);
			for (S_Emp emp : s) {
				System.out.println(emp);
			}
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * @date 2016-09-29 15:18:01
	 * 通过传入限定的参数进行查询
	 */
	@Test
	public void testSelectByIf2(){
		try {
			SqlSession session = openSession();
			DynamicMapper mapper = session.getMapper(DynamicMapper.class);
			String title = "Stock Clerk";
			List<S_Emp> s = mapper.selectByIf2(title,1009D,1600D,null,null);
			for (S_Emp emp : s) {
				System.out.println(emp);
			}
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @date 2016-09-29 18:42:34
	 * 测试使用choose
	 */
	@Test
	public void testSelectByChoose(){
		try {
			SqlSession session = openSession();
			DynamicMapper mapper = session.getMapper(DynamicMapper.class);
			Map<String,Object> map = new HashMap<String, Object>();
//			map.put("selectBy", "title");
//			map.put("title", "Stock Clerk");
			map.put("selectBy", "salary");
			map.put("salary", 1300);
			List<S_Emp> list = mapper.selectByChoose(map);
			for(S_Emp e:list){
				System.out.println(e);
			}
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @date 2016-09-29 19:15:02
	 * 测试使用where
	 */
	@Test
	public void testSelectByWhere(){
		try {
			SqlSession session = openSession();
			DynamicMapper mapper = session.getMapper(DynamicMapper.class);
			Map<String,Object> map = new HashMap<String, Object>();
//			map.put("title", "Stock Clerk");
			map.put("minSalary", 1300);
			map.put("maxSalary", 1600);
			List<S_Emp> list = mapper.selectByWhere(map);
			for(S_Emp e:list){
				System.out.println(e);
			}
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @date 2016-09-29 19:35:56
	 * 测试trim
	 */
	@Test
	public void testSelectByTrim(){
		try {
			SqlSession session = openSession();
			DynamicMapper mapper = session.getMapper(DynamicMapper.class);
			Map<String,Object> map = new HashMap<String, Object>();
			map.put("title", "Stock Clerk");
			map.put("salary", 1200);
			List<S_Emp> list = mapper.selectByTrim(map);
			for(S_Emp e:list){
				System.out.println(e);
			}
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @date 2016-09-29 20:01:05
	 * 测试forEach
	 */
	@Test
	public void testSelectByForEach(){
		try {
			SqlSession session = openSession();
			DynamicMapper mapper = session.getMapper(DynamicMapper.class);
			List<Integer> idList = new ArrayList<Integer>();
			idList.add(1);
			idList.add(3);
			List<S_Emp> list = mapper.selectByForEach(idList);
			for(S_Emp e:list){
				System.out.println(e);
			}
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @date 2016-09-29 20:50:59
	 * 测试SET
	 */
	@Test
	public void testUpdateBySet(){
		try {
			SqlSession session = openSession();
			DynamicMapper mapper = session.getMapper(DynamicMapper.class);
			S_Emp s = new S_Emp();
			s.setId(100);
			s.setLast_name("jade");
			s.setComments("i am alan i love jade");
			int count= mapper.updateBySet(s);
			System.out.println("修改"+count+"行");
			session.commit();
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @date 2016-09-29 21:29:36
	 * 测试bind
	 */
	@Test
	public void testSelectByBind(){
		try {
			SqlSession session = openSession();
			DynamicMapper mapper = session.getMapper(DynamicMapper.class);
			List<S_Emp> list = mapper.selectByBind("tock");
			for(S_Emp e:list){
				System.out.println(e);
			}
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @date 2016-09-29 22:14:16
	 * 测试查询所有结果，并返回map，来接收
	 */
	@Test
	public void testSelectAll(){
		try {
			SqlSession session = openSession();
			Map<Integer, S_Emp> map = session.selectMap(
					"com.briup.mappers.DynamicMapper.selectAll", "id");
			for(Integer key:map.keySet()){
				System.out.println(key+"---->"+map.get(key));
			}
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @date 2016-09-30 11:36:21
	 * 测试分页（非常少用，因为没什么用，从筛选中的结果来分）
	 * 需要把row的范围放入查询语句
	 */
	@Test
	public void testSelectByPage(){
		try {
			SqlSession session = openSession();
			DynamicMapper mapper = session.getMapper(DynamicMapper.class);
			RowBounds rb = new RowBounds(10, 5);
			List<S_Emp> empList = mapper.selectByPage(rb);
			for(S_Emp s:empList){
				System.out.println(s);
			}
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @date 2016-10-09 09:28:45 测试ForEach，使用in条件
	 */
	@Test
	public void testSelectByForEach2(){
		try {
			SqlSession session = openSession();
			DynamicMapper mapper = session.getMapper(DynamicMapper.class);
			List<Integer> idList = new ArrayList<Integer>();
			idList.add(1);
			idList.add(3);
			List<S_Emp> empList = mapper.selectByForEach2(idList);
			for(S_Emp s:empList){
				System.out.println(s);
			}
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
