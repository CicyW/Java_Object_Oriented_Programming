package practice04;

import com.google.common.base.Function;

public class Student extends Person{
    Integer klass;

    public Student(){

    }
    public Student(String name, Integer age,Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }

    public String introduce(){
        return basicintroduce() + " I am a Student. I am at Class " +klass+".";
    }

}
