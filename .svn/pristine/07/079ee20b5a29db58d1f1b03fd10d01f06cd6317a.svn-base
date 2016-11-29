package com.briup.annotation2;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.briup.autoKey.AutoBean;

public interface AnnotationMapper {
	
	/**
	 * @date 2016-09-30 17:14:44
	 * 测试注解:使用id查询单个结果
	 */
	@Select("select * from mb_auto where id=#{id}")
	@ResultType(com.briup.autoKey.AutoBean.class)
	public AutoBean selectById(int id);
	
	/**
	 * @date 2016-09-30 17:14:27
	 * 测试注解：查询所有结果
	 */
	@Select("select * from mb_auto")
	@Results(id="autoResult",value={
			@Result(id=true ,column="id",property="id"),
			@Result(column="name",property="name")
	})
	public List<AutoBean> selectAll();
	
	/**
	 * @date 2016-09-30 17:18:08 测试注解：插入 序列增长
	 */
	@Insert("insert into mb_auto values(#{id},#{name})")
	@SelectKey(before=true,
		statement="select mb_auto_id.nextval from dual",
		keyProperty="id",resultType=int.class)
	public void insert(AutoBean a);
	
	/**
	 * @date 2016-10-09 09:55:02 测试注解：插入 支持主键自动增长策略
	 */
	/*@Insert("insert into mb_auto values(#{id},#{name})")
	@SelectKey(before=true,
	statement="select mb_auto_id.nextval from dual",
	keyProperty="id",resultType=int.class)
	public void insertAuto(AutoBean a);*/
	
}
