package com.endava.timbuchalka.s6;

public class S6_30_Person {
}

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age < 0 || age > 100 ? 0 : age;
    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {
        String fullName = "";
        if (!firstName.isEmpty()) {
            fullName = firstName;
        }
        if (!lastName.isEmpty()) {
            fullName += (!fullName.isEmpty() ? " " : "") + lastName;
        }
        return fullName;
    }
}
