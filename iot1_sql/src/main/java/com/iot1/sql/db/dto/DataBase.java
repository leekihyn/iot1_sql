package com.iot1.sql.db.dto;

import org.springframework.stereotype.Component;

@Component
public class DataBase{
	private String database;
	private String table_name;

	public String getTableName() {
		return table_name;
	}

	public void setTableName(String tableName) {
		this.table_name = tableName;
	}
 
	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	@Override
	public String toString() { 
		return "DataBase [database=" + database + ", tableName=" + table_name + "]";
	}
}
