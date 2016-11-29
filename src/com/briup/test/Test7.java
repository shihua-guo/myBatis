package com.briup.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import static com.briup.command.utils.MyBatisSqlSessionFactoryUtil2.openSession;

public class Test7 {
	/*
	 * @date 2016-09-29 10:09:50 测试使用其他类型(环境)的数据库
	 */
	@Test
	public void testOtherEnviro() {
		try {
			SqlSession session = openSession();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
