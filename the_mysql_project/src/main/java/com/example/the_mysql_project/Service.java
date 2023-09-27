package com.example.the_mysql_project;


import java.util.ArrayList;
import java.util.List;

public class Service {
    List<Cars> cars=new ArrayList<>();

    CarsDB db=new CarsDB();

    public void insertCar(Cars c)
    {
        db.save(c);
    }

    public void deleteCar(int id)
    {
        db.delete(id);
    }

    public void carById(int id)
    {
        db.getCarById(id);
    }

    public void updateById(String name,int id)
    {
        db.updateCarById(name,id);
    }

    public void getAllCars()
    {
        db.getAll();
    }

}
