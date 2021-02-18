package com.gauravssnl.mapstructlombokdemo;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
*/
public class AddressMapperImpl implements AddressMapper {

    @Override
    public AddressDTO toDto(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setId( address.getId() );
        addressDTO.setCity( address.getCity() );
        addressDTO.setName( address.getName() );
        addressDTO.setState( address.getState() );
        addressDTO.setCountry( address.getCountry() );

        return addressDTO;
    }

    @Override
    public Address toEntity(AddressDTO addressDTO) {
        if ( addressDTO == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( addressDTO.getId() );
        address.setCity( addressDTO.getCity() );
        address.setName( addressDTO.getName() );
        address.setState( addressDTO.getState() );
        address.setCountry( addressDTO.getCountry() );

        return address;
    }
}
