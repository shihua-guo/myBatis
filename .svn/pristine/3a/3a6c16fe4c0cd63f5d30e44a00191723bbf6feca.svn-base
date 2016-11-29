package com.briup.test;

import static com.briup.command.utils.MyBatisSqlSessionFactoryUtil.openSession;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.bean.Student;
import com.briup.mappers.StudentMapper;
public class Test5 {
	/*
	 * 测试selectById，使用id查询，返回一个Student结果
	 */
	@Test
	public void selectByIdTest(){
		try{
			SqlSession session = openSession();
//			Student stu =  session.selectOne(
//					"com.briup.mappers.StudentMapper.selectById",3);
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			Student stu = mapper.selectById(3);
			System.out.println(stu);
			session.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	/*
	 * 测试只查询部分信息
	 */
	@Test
	public void selectByIdTest2(){
		try{
			SqlSession session = openSession();
//			Student stu =  session.selectOne(
//					"com.briup.mappers.StudentMapper.selectById",3);
			//使用student接收
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			Student stu = mapper.selectById(3);
			System.out.println(stu);
			
			//使用map接收
			Map<String,Object> infoMap = mapper.selectByIdMap(3);
			for(String key:infoMap.keySet()){
				System.out.println(infoMap.get(key));
			}
			session.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	/*
	 * 查询所有学生某项信息，返回一个map
	 */
	@Test
	public void selectTest3(){
		try{
			SqlSession session = openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			List<Map<String, Object>> all = mapper.selectInfo();
			for(Map<String, Object> map:all){
				for(String key:map.keySet()){
					System.out.println(key+map.get(key));
				}
			}
			session.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	/*
	 * 查询所有学生，返回一个Student
	 */
	@Test
	public void selectAllTest(){
		try{
			SqlSession session = openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			List<Student> stuList = mapper.selectAll();
			for(Student stu:stuList){
				System.out.println(stu);
			}
			session.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
}
