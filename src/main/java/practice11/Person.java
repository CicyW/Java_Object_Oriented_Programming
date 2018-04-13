package practice11;

public class Person {

    String name;
    Integer age;
    Integer id;

    public Person(Integer id,String name, Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getId() {
        return id;
    }

    public String introduce(){
        return "My name is "+ name+". I am " +  age.toString()+" years old.";
    }

    @Override
    public boolean equals(Object p) {
        if (this == p) return true;
        if (p == null || getClass() != p.getClass()) return false;

        Person person = (Person) p;

        if (age != person.age) return false;
        return name.equals(person.name);
    }
}
