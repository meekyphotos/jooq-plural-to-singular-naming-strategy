# jooq-plural-to-singular-naming-strategy

Custom JOOQ Naming strategy to create classes in singular form starting from plural table names.

Deplurization is done using
```xml
        <dependency>
            <groupId>org.jibx</groupId>
            <artifactId>jibx-tools</artifactId>
            <version>1.3.1</version>
        </dependency>
```
        
To use it add the following configuration in your JOOQ generator 
```xml
<strategy>
  <name>org.travelhub.jooq.plugins.naming.PluralToSingularNamingStrategy</name>
</strategy>
```

and list this project as dependency in the plugin section

# License 

This software is license under MIT 
