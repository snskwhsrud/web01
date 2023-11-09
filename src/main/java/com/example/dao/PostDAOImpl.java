package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PostDAOImpl implements PostDAO{
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.PostMapper";

	@Override
	public List<HashMap<String, Object>> list() {
		return session.selectList(namespace + ".list");
	}

}
