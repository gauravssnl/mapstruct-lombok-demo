package com.gauravssnl.mapstructlombokdemo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface AddressMapper {
    @Mapping(source = ".", target = ".")
    AddressDTO toDto(Address address);

    @Mapping(source = ".", target = ".")
    Address toEntity(AddressDTO addressDTO);
}
