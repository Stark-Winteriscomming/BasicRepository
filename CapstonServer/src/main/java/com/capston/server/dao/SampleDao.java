package com.capston.server.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
 

 
@Repository("sampleDAO")
public class SampleDao extends AbstractDao{

	 @SuppressWarnings("unchecked")
	 public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception{
		 return (List<Map<String, Object>>)selectList("sample.selectBoardList", map);
	 }

 
}