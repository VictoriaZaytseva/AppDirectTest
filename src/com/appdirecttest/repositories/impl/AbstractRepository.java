package com.appdirecttest.repositories.impl;

import javax.sql.DataSource;

public abstract class AbstractRepository {
	
	private DataSource dataSource;	
	private String Table;
	private String Fields;
	private String QMarks;
	
	public void setDataSource(DataSource dataSource) {
			this.dataSource = dataSource;
	}
}
