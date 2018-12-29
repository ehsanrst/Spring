package com.Dotin;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {
    //This is the method to be used to initialize database resources ie. connection.
    public void setDataSource(DataSource ds);

    //This is the method to be used to create a record in the Student table.
    public void create(String name, Integer age);

    //This is the method to be used to list down a record from the Student table
    public Student getStudent(Integer id);

    //This is the method to be used to list down all the records from the Student table.
    public List<Student> listStudent();

    // This is the method to be used to delete a record from the Student table.
    public void delete(Integer id);

    //This is the method to be used to update a record into the Student table.
    public void update(Integer id, Integer age);
}

/*
Create DAO interface StudentDAO and list down all the required methods.
 Though it is not required and you can directly write StudentJDBCTemplate class.

DAO stands for Data Access Object, which is commonly used for database interaction.
 DAOs exist to provide a means to read and write data to the database and they
  should expose this functionality through an interface by which the rest of
   the application will access them.
 */