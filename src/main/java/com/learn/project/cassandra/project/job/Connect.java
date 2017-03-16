package com.learn.project.cassandra.project.job;

import com.datastax.driver.core.*;

public class Connect {

	public static void main(String[] args) {

		Connect connect = new Connect();
		connect.ConnectWithCassandra();
	}
	
	public void ConnectWithCassandra() {
		
		
		Cluster cluster = Cluster.builder()
		        .withClusterName("my_cluster")
		        .addContactPoint("127.0.0.1")
		        .build();
		Session session = cluster.connect(); 
		ResultSet result = session.execute("SELECT * FROM my_keyspace.emp");
		result.getColumnDefinitions();
		System.out.println(cluster.getClusterName());
	}
}
