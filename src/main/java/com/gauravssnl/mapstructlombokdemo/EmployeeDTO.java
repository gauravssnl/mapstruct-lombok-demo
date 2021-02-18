package com.gauravssnl.mapstructlombokdemo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeeDTO {
    private Long employeeId;
    private String employeeName;
    private AddressDTO addressDTO;

}
