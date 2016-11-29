package com.briup.mappers;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import com.briup.dynamic.S_Emp;

public interface DynamicMapper {
	public List<S_Emp> selectByIf(Map<String,Object> map);
	public List<S_Emp> selectByIf2(String title,double minSalary,double maxSalary,
			Date minDate,Date maxDate);
	public List<S_Emp> selectByChoose(Map<String,Object> map);
	public List<S_Emp> selectByWhere(Map<String,Object> map);
	public List<S_Emp> selectByTrim(Map<String,Object> map);
	public List<S_Emp> selectByForEach(List<Integer> id);
	public int updateBySet(S_Emp s);
	public List<S_Emp> selectByBind(String title);
	public Map<Integer,S_Emp> selectAll();
	public List<S_Emp> selectByPage(RowBounds rb);
	
	public List<S_Emp> selectByForEach2(List<Integer> id);
}
