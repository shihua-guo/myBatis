package com.briup.many2many;

import static com.briup.command.utils.MyBatisSqlSessionFactoryUtil.openSession;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.mappers.Many2ManyMapper;

public class M2MTest {

	/*
	 * @date 2016-09-29 00:57:38 测试通过Uid查询User，返回Role的集合
	 */
	@Test
	public void testSelectUserRoleByUid() {
		try {
			SqlSession session = openSession();
			Many2ManyMapper mapper = session.getMapper(Many2ManyMapper.class);
			MUser u = mapper.selectUserRoleByUid(1);
			System.out.println(u);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @date 2016-10-08 18:26:13 M2M测试插入,测试如果多个参数直接传入Map
	 * 
	 */
	@Test
	public void testInsertUR(){
		try {
			SqlSession session = openSession();
			Many2ManyMapper mapper = session.getMapper(Many2ManyMapper.class);
			MUser u = new MUser(1,"alan");
			MRole r = new MRole(3,"teacher");
			Map<String,Integer> idMap = new HashMap<String,Integer>();
			idMap.put("userid", u.getId());
			idMap.put("roleid", r.getId());
			int count = mapper.insertUR(idMap);
			System.out.println("修改了"+count+"行");
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @date 测试通过直接传入2个对象，来插入id值
	 */
	@Test
	public void testInsertUR2(){
		try {
			SqlSession session = openSession();
			Many2ManyMapper mapper = session.getMapper(Many2ManyMapper.class);
			MUser u = new MUser(1,"alan");
			MRole r = new MRole(3,"teacher");
			Map<String,Object> idMap = new HashMap<String,Object>();
			idMap.put("userid", u);
			idMap.put("roleid", r);
			int count = mapper.insertUR2(idMap);
			System.out.println("修改了"+count+"行");
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
