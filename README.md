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

MIT License

Copyright (c) 2019 travellingfreak

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
