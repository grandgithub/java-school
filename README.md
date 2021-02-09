# java-school

to use specific task change the branch

# issues
Q: IntelliJ doesn't let me to execute Application

A: from IntelliJ menu: File -> Project structure -> Project (Ctrl+Alt+Shift+S)
- set SDK -> 1.8
- set specific language level -> 8
- set output path -> full_system_path_to_project\out   

# tasks description
##Task00 (folder task00)
to run use Application class
1) Create class User that will contain the following info:
firstname
lastname
age
email
status (ACTIVE, INACTIVE, BLOCKED, NEW)
timestamp (when user was registered in the system)
Add contructor with all parameters, getters, setters, custom toString method.
2) create class Application with main method.
In this main method you should do the following:
- create list of users. To create users - use constructor with all parameters. 
You can use array or ArrayList(preferably).
Some of the created users should have status as NEW.
- iterate through the list of users and change status to ACTIVE for NEW users 
whose timestamp when they were registered in the system is older than yesterday. 
You can extract this functionality into a separate method
- BONUS TASK: write a method that will pick up INACTIVE users that where registered more than 1 month ago and set their status to BLOCKED

##Task02 (folder task02)
to run use Task02 & Task02_Stream classes
1) Create abstract class Animal ( if you want you can use Interface ). 
Create child classes: Dog, Cat, Bird. In main method, create a collection of with 6 objects ( 2xDogs, 2xCats and 2xBirds). 
Create 2 methods that will filter the initial collection and return a new collection based on search criteria. 1-st method will filter and return only dogs. Second only cats and dogs. 

Think about how you name the methods. 

2) Convert the initial collection into Set. Then convert it back to ArrayList and check no objects where lost. 

3) Create a Map. The map should contain the following data: KEY: ClassName + ClassName; VALUE: Collection of {Object, Object} The data should base on the initial collection of 6 objects. Use brute force algorithm. 

Example of first the elements: 
Key:"Dog+Dog" 
Value: {First Dog object, Second Dog object} 

Key:"Dog+Cat" 
Value: {First Dog object, First Cat object} 

Key:"Dog+Cat" 
Value: {First Dog object, Second Cat object} 

Please not the that the object combinations should not repeat. 

Create a method that will have the map and a string ( search criteria ) as input parameters and return a new map that will contain items that fit the search criteria.

