package com.iot1.sql.db.dao;

import java.util.List;
import java.util.Map;

import com.iot1.sql.db.dto.Column;
import com.iot1.sql.db.dto.DataBase;
import com.iot1.sql.db.dto.Table;
import com.iot1.sql.db.dto.db_info;


public interface DbDAO {
	public List<db_info> selectDbInfoList(db_info di) ;
	public db_info selectDbInfo(db_info di);
	public boolean isConnecteDB(db_info di) throws Exception;
	public List<DataBase> selectDatabaseList() throws Exception;
	public List<Table> selectTableList(DataBase di) throws Exception;
	public List<Column> selectTableInfo(Table table) throws Exception;
	public Map<String,Object> runSql(Map<String, String> pm)throws Exception;
	
	  
} 
  