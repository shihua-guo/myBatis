package com.briup.typeConvert;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.StringTokenizer;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.briup.bean.Address;

public class AddressHandler extends BaseTypeHandler<Address> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Address address, JdbcType jdbcType)
			throws SQLException {
		System.out.println("Address对象转化为String");
		StringBuilder sb = new StringBuilder();
		// 拼接成String
		sb.append(address.getId() + ",");
		sb.append(address.getCountry() + ",");
		sb.append(address.getProvince() + ",");
		sb.append(address.getCity());
		// 传入ps
		ps.setString(i, sb.toString());
	}

	@Override
	public Address getNullableResult(ResultSet rs, String columnName) throws SQLException {
		// 获取到当前列的值，后面进行分割
		String result = rs.getString(columnName);
		StringTokenizer st = new StringTokenizer(",");
		Address a = new Address();
		a.setId(Integer.parseInt(st.nextToken()));
		a.setCountry(st.nextToken());
		a.setProvince(st.nextToken());
		a.setCity(st.nextToken());
		return a;
	}

	@Override
	public Address getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		// 获取到当前列的值，后面进行分割
		String result = rs.getString(columnIndex);
		StringTokenizer st = new StringTokenizer(",");
		Address a = new Address();
		a.setId(Integer.parseInt(st.nextToken()));
		a.setCountry(st.nextToken());
		a.setProvince(st.nextToken());
		a.setCity(st.nextToken());
		return a;
	}

	@Override
	public Address getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {

		return null;
	}

}
