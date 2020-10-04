# java-school

to use specific task change the branch

# issues
Q: IntelliJ doesn't let me to execute Application

A: from IntelliJ menu: File -> Project structure -> Project (Ctrl+Alt+Shift+S)
- set SDK -> 1.8
- set output path -> full_system_path_to_project\out   

# tasks description
Task1 (remote branch origin/task1)
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
You can use array or ArrayList(prefferably).
Some of the created users should have status as NEW.
- iterate through the list of users and change status to ACTIVE for NEW users 
whose timestamp when they were registered in the system is older than yesterday. 
You can extract this functionality into a separate method
- BONUS TASK: write a method that will pick up INACTIVE users that where registered more than 1 month ago and set their status to BLOCKED
