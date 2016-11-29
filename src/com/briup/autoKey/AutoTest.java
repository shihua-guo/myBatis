package com.briup.autoKey;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import static  com.briup.command.utils.MyBatisSqlSessionFactoryUtil.openSession;
public class AutoTest {

	/**
	 * @date 2016-09-30 10:04:07 测试自动生成主键策略
	 */
	@Test
	public void testInsertAutoKey() {
		try {
			SqlSession session = openSession();
			AutoBean a = new AutoBean(1, "alan");
			int count = session.insert("com.briup.autoKey.AutoMapper.insertAutoKey", a);
			System.out.println("插入了" + count + "行");
			session.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
