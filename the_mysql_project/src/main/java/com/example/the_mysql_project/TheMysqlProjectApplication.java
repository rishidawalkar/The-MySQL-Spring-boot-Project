package com.example.the_mysql_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheMysqlProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheMysqlProjectApplication.class, args);
		Service service=new Service();

		//service.insertCar(new Cars("Tesla",12082,"Y"));		//insert method

		//service.deleteCar(4);		//delete method

		//service.carById(2);		//get record by id method

		//service.updateById("BMW",1);	//update method

		//service.getAllCars();		//get all record method
	}

}
