package com.supinfo.ecommerce;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {

	/*	MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017/ProductDB=mongodb+srv://group4proj:4proj4proj@cluster0-mpxso.azure.mongodb.net/test?authSource=admin&replicaSet=Cluster0-shard-0&w=majority&readPreference=primary&appname=MongoDB%20Compass&retryWrites=true&ssl=true");

		try(MongoClient mongoClient = new MongoClient(uri)){
			MongoDatabase database = mongoClient.getDatabase("4PROJ");

		}*/
		SpringApplication.run(EcommerceApplication.class, args);



	}

}
