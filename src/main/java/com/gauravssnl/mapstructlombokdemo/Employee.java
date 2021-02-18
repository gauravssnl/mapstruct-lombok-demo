package com.gauravssnl.mapstructlombokdemo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
    private Long id;
    private String name;
    private Address address;
}
