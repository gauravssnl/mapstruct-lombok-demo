package com.gauravssnl.mapstructlombokdemo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDTO {
    private Long id;
    private String city;
    private String name;
    private String state;
    private String country;
}
