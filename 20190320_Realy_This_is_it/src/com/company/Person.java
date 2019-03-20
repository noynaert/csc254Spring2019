package com.company;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    //constructors
    public Person(String name, int age){
        setName(name);
        setAge(age);
    }
    public Person(String name){
        this(name, 0);
    }
    public Person(int age){
        this("ANONYMOUS", age);
    }
    public Person(){
        this("ANONYMOUS", 0);
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age > 120)
            this.age = 120;
        else
            this.age = age;
        this.age = (age > 120) ? 120 : age;
    }

    //getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        //Any of these would work.  You don't need to do all of them.
        String result = String.format("Name: %s, Age: %d", name, age);
        result = String.format("Name: %s, Age: %d", this.name, this.age);
        result = String.format("Name: %s, Age: %d", getName(), getAge());
        result = String.format("Name: %s, Age: %d", this.getName(), age);

        return result;
    }

    public int compareTo(Person other){
        int result = name.compareToIgnoreCase(other.name);

        //If the same name, break the tie on age.
        if(result == 0)
            result = this.age - other.age;

        return result;
    }
}
