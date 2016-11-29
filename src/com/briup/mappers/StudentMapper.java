package com.briup.mappers;

import java.util.List;
import java.util.Map;

import com.briup.bean.Student;

public interface StudentMapper {
	public int saveStu(Student stu) throws Exception;
	public int updateById(Student stu) throws Exception;
	public int deleteById(int id) throws Exception;
	public int updateByRownum(Student stu) throws Exception;
	public Student selectById(int i) throws Exception;
	public Map<String,Object> selectByIdMap(int i) throws Exception;
	public List<Map<String,Object>> selectInfo() throws Exception;
	public List<Student> selectAll() throws Exception;
	
}
