package com.Dotin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * JDBC
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

        //create
        System.out.println("------Create Table------");
        String createSql = "create table Student(ID int PRIMARY KEY AUTO_INCREMENT," +
                " NAME varchar(20) not null, AGE int not null);";
        studentJDBCTemplate.sqlExecution(createSql);

        //insert
        System.out.println("------Record Creation------");
        studentJDBCTemplate.create("Ehsan", 27);
        studentJDBCTemplate.create("Ali", 15);
        studentJDBCTemplate.create("Amin", 30);

        //select all
        System.out.println("-----Listing Multiple Records-----");
        List<Student> students = studentJDBCTemplate.listStudent();
        for (Student record : students) {
            System.out.print("ID : " + record.getId());
            System.out.print(", Name : " + record.getName());
            System.out.println(", Age : " + record.getAge());
        }

        //update
        System.out.println("-----Updating Record with ID = 2 -----");
        studentJDBCTemplate.update(2, 45);

        //select
        System.out.println("-----Listing Record with ID = 2 -----");
        Student student = studentJDBCTemplate.getStudent(2);
        System.out.print("ID : " + student.getId());
        System.out.print(", Name : " + student.getName());
        System.out.println(", Age : " + student.getAge());
    }
}

/*
Spring JDBC Framework takes care of all the low-level details starting from
 opening the connection, prepare and execute the SQL statement, process exceptions,
  handle transactions and finally close the connection.

Spring JDBC provides several approaches and correspondingly different classes
 to interface with the database.
  We're going to take classic and the most popular approach which makes use of
   "JdbcTemplate" class of the framework.
    This is the central framework class that manages all the database communication
     and exception handling.

     The "JDBC Template class" executes SQL queries, updates statements,
      stores procedure calls, performs iteration over ResultSets,
       and extracts returned parameter values.
        It also catches JDBC exceptions and translates them to the generic,
         more informative, exception hierarchy defined in the
          "org.springframework.dao" package.

          Instances of the JdbcTemplate class are threadsafe once configured.
           So you can configure a single instance of a JdbcTemplate and then
            safely inject this shared reference into multiple DAOs.
 */