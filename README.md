# Java application example

This is a (very) simple Java application.

It just says Hi, receives and prints the command line arguments, and says Bye!

It includes a plug-in to generate launch scripts for Windows and Linux.


## Maven instructions

To print the project dependencies:

```
mvn dependency:tree
```

To compile the source code:

```
mvn compile
```

To run the program using _exec_ plugin:

```
mvn exec:java
```

To generate launch scripts for Windows and Linux
(the POM is configured to attach appassembler:assemble to the _install_ phase):

```
mvn install
```

To run using appassembler plugin on Windows:

```
target\appassembler\bin\java-app test 1 2 3
```

To run using appassembler plugin on Linux:

```
./target/appassembler/bin/java-app test 1 2 3
```


## To configure the Maven project in Eclipse

'File', 'Import...', 'Maven'-'Existing Maven Projects'

'Select root directory' and 'Browse' to the project base folder.

Check that the desired POM is selected and 'Finish'.


----

[SD Faculty](mailto:leic-sod@disciplinas.tecnico.ulisboa.pt)
