package it.polito.tdp.corsi.DB;

import java.sql.Connection;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectDB {
	
	private static final String jdbcURL = "jdbc:mysql://localhost/iscritticorsi";
	private static HikariDataSource ds; 
	
	 /*public static Connection getConnection() {
		if(ds ==null) {
			HikariConfig config= new HikariConfig();
			config.setJdbcUrl(jdbcURL);
			config.setUsername("root");
			config.setPassword("s235307");
			
			config.addDataSourceProperty("cachePregStmts", true);
			
			return ds.getConnection();
	
		}
	}
*/
}
