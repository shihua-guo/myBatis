package com.briup.mappers;


import java.util.Map;

import com.briup.many2many.MUser;

public interface Many2ManyMapper {
	public MUser selectUserRoleByUid(int id);
	public int insertUR(Map map);
	public int insertUR2(Map map);
}
