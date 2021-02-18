package com.gauravssnl.mapstructlombokdemo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMapperDemo {
    public static void main(String[] args) {
        Employee employee = getEmployee();
        System.out.println(employee.toString());
    }

    public static Address getAdress1() {
        Address address = new Address();
        address.setCity("city1");
        address.setCountry("country1");
        address.setName("name1");
        address.setState("state1");
        address.setId(1L);
        return address;
    }

    public static Address getAdress2() {
        Address address = new Address();
        address.setCity("city2");
        address.setCountry("country2");
        address.setName("name2");
        address.setState("state2");
        address.setId(2L);
        return address;
    }

    public static  Employee getEmployee() {
        Address address1 = getAdress1();
        Employee employee1 = new Employee();
        employee1.setAddress(address1);
        employee1.setName("ename1");
        employee1.setId(1L);
        return employee1;
    }

    public static List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        Address address1 = getAdress1();
        Employee employee1 = new Employee();
        employee1.setAddress(address1);
        employee1.setName("ename1");
        employee1.setId(1L);

        Address address2 = getAdress2();
        Employee employee2 = new Employee();
        employee2.setAddress(address2);
        employee2.setName("ename2");
        employee2.setId(2L);
        return employeeList;
    }

}