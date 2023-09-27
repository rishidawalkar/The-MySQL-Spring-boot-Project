package com.example.the_mysql_project;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarsDB {
    Connection conn=null;

    public CarsDB()
    {
        try {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatech","root","root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void save(Cars c)
    {
        String query="insert into cars(name,price,model) values(?,?,?)";

        try {
            PreparedStatement st=conn.prepareStatement(query);

            st.setString(1,c.getName());
            st.setDouble(2,c.getPrice());
            st.setString(3, c.getModel());
            st.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(int id){
        String query="delete from cars where id=?";

        try {
            PreparedStatement st=conn.prepareStatement(query);

            st.setInt(1,id);
            st.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getCarById(int id)
    {
        String query="select name,price,model from cars where id=?";

        try {
            PreparedStatement st=conn.prepareStatement(query);
            st.setInt(1,id);

            ResultSet rs=st.executeQuery();

            if(rs.next()) {
                String name = rs.getString("name");
                double price=rs.getDouble("price");
              String model=rs.getString("model");

                System.out.println("Name: "+name);
                System.out.println("Price: "+price);
                System.out.println("Model: "+model);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateCarById(String name,int id)
    {
        String query="update cars set name=? where id=?";

        try {
            PreparedStatement st= conn.prepareStatement(query);
            st.setString(1,name);
            st.setInt(2,id);
            st.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getAll()
    {

        String query="select name,price,model from cars";

        try {
            PreparedStatement st=conn.prepareStatement(query);
            ResultSet rs=st.executeQuery();

            while(rs.next()) {

                String name=rs.getString("name");
                double price=rs.getDouble("price");
                String model=rs.getString("model");

                System.out.println("Name: "+name + ", Price: "+price+ ", Model: "+model);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
