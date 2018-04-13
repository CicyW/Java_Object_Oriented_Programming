package practice06;

public class Teacher extends Person{

    Integer klass;

    public Teacher(){ }

    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public Teacher(String name, Integer age,Integer klass) {
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
        String str =  super.introduce() + " I am a Teacher. ";//使用super调用父类方法
        if (klass==null)
            str = str + "I teach No Class.";
        else
            str = str + "I teach Class " +klass +".";
        return str;
    }

}
