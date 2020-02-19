# Java application example

This is a simple Java application
that loads configuration values from a property file in resources.

The properties file follows the name=value syntax,
explained in the [wikipedia entry](http://en.wikipedia.org/wiki/.properties).

The min and max values are simple properties.
The workDir property value is set using a Maven defined property, using the ${work.dir} syntax.
The ${} placeholder is replaced by the property value.



## Maven instructions

To print the project dependencies:

```
mvn dependency:tree
```

To compile the source code:

```
mvn compile
```

To compile and copy resources to the output directory   (compare the properties file in src/main with the file in target/classes/ after executing):

```
mvn package
```

To run the program using _exec_ plugin:

```
mvn exec:java
```


## To configure the Maven project in Eclipse

'File', 'Import...', 'Maven'-'Existing Maven Projects'

'Select root directory' and 'Browse' to the project base folder.

Check that the desired POM is selected and 'Finish'.


----

[SD Faculty](mailto:leic-sod@disciplinas.tecnico.ulisboa.pt)
