package com.subrat.java8;

import java.util.ArrayList;
import java.util.List;

public class EmpData {
    public static List<Employee> getAllEmp(){
        List<Employee> employeeList=new ArrayList<>();
        Employee e1=new Employee(1,"Subrat1",31,31000);
        Employee e2=new Employee(2,"Subrat2",32,32000);
        Employee e3=new Employee(3,"Subrat3",33,33000);
        Employee e4=new Employee(4,"Subrat4",34,34000);
        Employee e5=new Employee(5,"Subrat5",35,35000);
        Employee e6=new Employee(6,"Subrat1",36,36000);
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);
        return employeeList;

    }
}
