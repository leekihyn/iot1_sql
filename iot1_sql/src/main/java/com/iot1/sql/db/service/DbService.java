package com.iot1.sql.db.service;

import java.util.List;
import java.util.Map;

import com.iot1.sql.db.dto.Column;
import com.iot1.sql.db.dto.DataBase;
import com.iot1.sql.db.dto.Table;
import com.iot1.sql.db.dto.db_info;


public interface DbService {
	public List<db_info> getDbInfoList(db_info di);
	public List<DataBase> getDataBaseList() throws Exception;
	public boolean isConnecteDB(db_info pDi) throws Exception;
	public List<Table> getTableList(DataBase di) throws Exception; 
	public List<Column> getTableInfo(Table table)throws Exception; 
	public Map<String,Object> runSql(Map<String, String> pm) throws Exception; 
}
 