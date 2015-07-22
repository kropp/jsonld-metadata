java-jsonld-mappings
====================

Library provides easy to use Java classes and builders for [schema.org](http://schema.org/) entities.

All classes are auto generated from schema.rdfa

Example usage:
```
final Article article = SchemaOrg.article()
        .name("World Cup starts today!")
        .text("Full text")
        .author(SchemaOrg.sportsOrganization().name("FIFA").build())
        .comment(
                SchemaOrg.comment().text("Hooray!").author(SchemaOrg.person().name("Max Mustermann").build()).build()
        ).build();
```

Than one can serialize it to JSON with __Jackson__ as follows:
```
final ObjectMapper objectMapper = new ObjectMapper();
objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
objectMapper.writeValue(System.out, event);
```