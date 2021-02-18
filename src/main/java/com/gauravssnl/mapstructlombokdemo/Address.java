package com.gauravssnl.mapstructlombokdemo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Address {
    private Long id;
    private String city;
    private String name;
    private String state;
    private String country;
}
