# InPaD
InPaD is an Interactive Pattern Detection Tool
Code: 
This code is about Basic design patterns
- Creational
 ** Abstract Factory
 ** Prototype
 ** Builder
 ** Singleton
- Structural
 ** Adapter
 ** Bridge
 ** Composite
 ** Facade
- Behavioural
 ** Observer
 ** Strategy
 ** State

After working on Java code, converted into maven project.

Extract source file dependencies:

 Used Depends jar to extract source files
 command to convert source code to dependency file
 1. Download depends.jar 
 2. Use this command to generate dependency file,
 java -jar depends.jar -s -d <output-directory> java <java-project-directory> <dependency-file-name> 
 
 Example:
  java -jar depends.jar -s -d  github/inpad/src/main/java/edu/psu/behavioural/strategy/ java github/inpad/src/main/java/edu/psu/behavioural/strategy/ strategy

 This will generate two files:
  1. depends-dv8map.json
  2. <designpattern-name>.json
 In the <designpattern-name>.json, we can see some values in the variable list.
  "variables" : [ ".\\src\\main\\java\\edu\\psu\\Client.java"................]
 - Represent source file dependency in dv8 format.
 
Convert to design matrix(DSM) 
  Used Dv8 tool to convert <designpattern-name>.json to DV8DSM file
  Load json file into the application, dependency graph can be seen.
  
  Attached json and dv8dsm files for reference.
 
