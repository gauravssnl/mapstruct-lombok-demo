package com.gauravssnl.mapstructlombokdemo;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = { AddressMapper.class })
public interface EmployeeMapper {

    @Mapping(source = "id", target = "employeeId")
    @Mapping(source = "name", target = "employeeName")
    @Mapping(source = "address", target = "addressDTO")
    EmployeeDTO toDto(Employee employee);

    @Mapping(source = "employeeId", target = "id")
    @Mapping(source = "employeeName", target = "name")
    @Mapping(source = "addressDTO", target = "address")
    Employee toEntity(EmployeeDTO employeeDTO);

    List<EmployeeDTO> toDto(List<Employee> employeeList);

    List<Employee> toEntity(List<EmployeeDTO> employeeDTOList);

    default Employee fromId(Long id) {
        Employee employee = new Employee();
        employee.setId(id);
        return employee;
    }
}
