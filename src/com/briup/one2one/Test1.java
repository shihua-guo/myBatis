package com.briup.one2one;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import static com.briup.command.utils.MyBatisSqlSessionFactoryUtil.openSession;
public class Test1 {
	/**
	 * @date 2016-09-28 18:42:46
	 * 测试一对一，测试插入Hus
	 */
	@Test
	public void testInsertHus(){
		try{
			SqlSession session = openSession();
			HusMapper mapper = session.getMapper(HusMapper.class);
			Hus h = new Hus(1,"alan");
			mapper.insert(h);
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * @date 2016-09-28 19:11:17
	 * 测试获取Hus
	 */
	@Test
	public void testGetHus(){
		try{
			SqlSession session = openSession();
			HusMapper mapper = session.getMapper(HusMapper.class);
			Hus h = mapper.getHus(1);
			System.out.println(h);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	/**
	 * @date 2016-09-28 18:40:50
	 * 测试一对一，现在测试插入Wife
	 */
	@Test
	public void testInsertWife(){
		try{
			SqlSession session = openSession();
			WifeMapper mapper = session.getMapper(WifeMapper.class);
			HusMapper mapper2 = session.getMapper(HusMapper.class);
			Hus h = mapper2.getHus(1);
			Wife w = new Wife(1,"jade",h);
			mapper.insert(w);
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	/**
	 * @date 2016-09-28 19:30:44
	 * 测试使用id级联查询wife和hus 
	 */
	@Test
	public void testSelectCouple(){
		try{
			SqlSession session = openSession();
			WifeMapper mapper = session.getMapper(WifeMapper.class);
			Wife w = mapper.selectCouple(1);
			System.out.println(w);
			System.out.println(w.getHus());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * @date 2016-09-28 20:17:04
	 * 测试直接获取wife
	 */
	@Test
	public void testSelectWife(){
		try{
			SqlSession session = openSession();
			Wife w = session.selectOne(
					"com.briup.one2one.One2OneMapper.selectWifeById", 1);
			System.out.println(w);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * @date 2016-09-28 20:17:04
	 * 测试直接获取hus
	 */
	@Test
	public void testSelectHusById(){
		try{
			SqlSession session = openSession();
			Hus w = session.selectOne(
					"com.briup.one2one.One2OneMapper.selectHusById", 1);
			System.out.println(w);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	/**
	 * @date 2016-09-28 20:17:04
	 * 测试直接获取wife和hus
	 */
	@Test
	public void testSelectWifeAndHusByWid(){
		try{
			SqlSession session = openSession();
			Wife w = session.selectOne(
					"com.briup.one2one.One2OneMapper.selectWifeAndHusByWid", 1);
			System.out.println(w);
			System.out.println(w.getHus());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
