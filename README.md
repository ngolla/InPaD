# InPaD
InPaD is an Interactive Pattern Detection Tool
Code: 
This code is about Basic design patterns
- Creational
 ** Abstract Factory
 ** Prototype
- Structural
 ** Adapter
- Behavioural
 ** Observer
 ** Strategy
After working on Java code, converted into maven project.
Made changes in pom.xml to generate jar file. 
Extract source file dependencies:
 - Used Depends jar to extract source files
 command to convert source code to dependency file
 Download depends.jar 
 > java -jar depends.jar -s -d <output-directory> java <java-project-directory> <dependency-file-name> 
 This will generate two files:
  1. depends-dv8map.json
  2. <dependency-file-name>.json
 In the <dependency-file-name>.json, we can see some values in the variable list.
  "variables" : [ ".\\src\\main\\java\\edu\\psu\\Client.java"................]
 Represent source file dependency in dv8 format.
  Used Dv8 tool to convert <dependency-file-name>.json to DV8DSM file
  Load json file into the application, dependency graph can be seen.
  
  Attached json and dv8dsm files for reference.
 
