package com.gauravssnl.mapstructlombokdemo;

import java.util.ArrayList;
import java.util.List;
import org.mapstruct.factory.Mappers;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
*/
public class EmployeeMapperImpl implements EmployeeMapper {

    private final AddressMapper addressMapper = Mappers.getMapper( AddressMapper.class );

    @Override
    public EmployeeDTO toDto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setEmployeeId( employee.getId() );
        employeeDTO.setEmployeeName( employee.getName() );
        employeeDTO.setAddressDTO( addressMapper.toDto( employee.getAddress() ) );

        return employeeDTO;
    }

    @Override
    public Employee toEntity(EmployeeDTO employeeDTO) {
        if ( employeeDTO == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setId( employeeDTO.getEmployeeId() );
        employee.setName( employeeDTO.getEmployeeName() );
        employee.setAddress( addressMapper.toEntity( employeeDTO.getAddressDTO() ) );

        return employee;
    }

    @Override
    public List<EmployeeDTO> toDto(List<Employee> employeeList) {
        if ( employeeList == null ) {
            return null;
        }

        List<EmployeeDTO> list = new ArrayList<EmployeeDTO>( employeeList.size() );
        for ( Employee employee : employeeList ) {
            list.add( toDto( employee ) );
        }

        return list;
    }

    @Override
    public List<Employee> toEntity(List<EmployeeDTO> employeeDTOList) {
        if ( employeeDTOList == null ) {
            return null;
        }

        List<Employee> list = new ArrayList<Employee>( employeeDTOList.size() );
        for ( EmployeeDTO employeeDTO : employeeDTOList ) {
            list.add( toEntity( employeeDTO ) );
        }

        return list;
    }
}
