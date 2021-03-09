# mapstruct-lombok-demo
MapStruct &amp; Lombok Demo

# Generate Maven project
```bash
mvn archetype:generate '-DgroupId=com.gauravssnl.mapstructlombokdemo' -DartifactId=mapstruct-lombok-demo -DarchetypeArtifactId=maven-arche
type-quickstart '-DarchetypeVersion=1.4' -DinteractiveMode=true
```

# References

1. https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html 
2.  https://mapstruct.org/documentation/stable/reference/html/
3. https://projectlombok.org/features/GetterSetter

# Example 
1. Lombok

#### Address.java

```java
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
```

2. MapStruct

#### AddressMapper.java

```java
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface AddressMapper {
    @Mapping(source = ".", target = ".")
    AddressDTO toDto(Address address);

    @Mapping(source = ".", target = ".")
    Address toEntity(AddressDTO addressDTO);
}
```


