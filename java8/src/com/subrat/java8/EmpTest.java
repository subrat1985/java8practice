package com.subrat.java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static com.subrat.java8.EmpData.*;

public class EmpTest {
    public static void main(String[] args) {
        List<String> empName= getAllEmp().stream().map(ep->ep.getName()).collect(Collectors.toList());
        System.out.println("All employee name"+empName);

        Map<Integer, Set<Employee>> employeeListByAge = getAllEmp().stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.toSet()));
        System.out.println(employeeListByAge);

    }
}
