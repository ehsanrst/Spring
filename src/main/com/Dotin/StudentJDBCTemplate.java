package com.Dotin;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Following is the implementation class file StudentJDBCTemplate.java
 * for the defined DAO interface StudentDAO.
 */
public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    //create table
    public void sqlExecution(String sql) {
        jdbcTemplateObject.execute(sql);
        System.out.println("Create Table!");
    }

    //insert (.update)
    public void create(String name, Integer age) {
        String sql = "insert into Student (name,age) values (?,?)";
        jdbcTemplateObject.update(sql, name, age);
        System.out.println("Create Record Name : " + name + ", Age = " + age);
    }

    //select (.queryForObject) need to map Result to Student
    public Student getStudent(Integer id) {
        String sql = "select * from Student where id = ?";
        Student student = jdbcTemplateObject.queryForObject(sql,
                new Object[]{id}, new StudentMapper());

        return student;
    }

    //select all (.query) need to map Result to Student
    public List<Student> listStudent() {
        String sql = "select * from Student";
        List<Student> students = jdbcTemplateObject.query(sql, new StudentMapper());
        return students;
    }

    //delete (.update)
    public void delete(Integer id) {
        String sql = "delete from Student where id = ?";
        jdbcTemplateObject.update(sql, id);
        System.out.println("Deleted Record with ID = " + id);
    }

    //update (.update)
    public void update(Integer id, Integer age) {
        String sql = "update Student set age = ? where id = ?";
        jdbcTemplateObject.update(sql, age, id);
        System.out.println("Update Record with ID = " + id);
    }
}

/*
Executing SQL statements:
    Querying for an integer : .queryForInt(sql)
    Querying for a long : .queryForLong(sql)
    A simple query using a bind variable : .queryForInt(sql, new Object[]{10})
    Querying for a String : .queryForObject(sql, new Object[]{10}, String.class)
    Inserting a row into the table : .update(sql, new Object[]{"Zara", 11})
    Updating a row into the table : .update(sql, new Object[]{"Zara", 10})
    Deleting a row from the table : .update(sql, new Object[]{20} )
    Executing DDL Statements : .execute(sql)
 */