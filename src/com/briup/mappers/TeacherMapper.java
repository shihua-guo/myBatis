package com.briup.mappers;

import com.briup.bean.Teacher;

public interface TeacherMapper {
	public boolean save(Teacher t);
	public Teacher find();
}
