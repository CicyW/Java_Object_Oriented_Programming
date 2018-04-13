package practice04;

public class Person {
    String name;
    Integer age;

    public Person(){

    }
    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }


    public String basicintroduce(){
        return "My name is "+ name+". I am " +  age.toString()+" years old.";
    }
}
