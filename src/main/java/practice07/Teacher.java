package practice07;

public class Teacher extends Person{
    Klass klass;

    public Teacher(){}

    public Teacher(String name, Integer age){
        super(name, age);
    }
    public Teacher(String name, Integer age,Klass klass){
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce(){
        String str =  super.introduce() + " I am a Teacher. ";//使用super调用父类方法
        if (klass==null)
            return str + "I teach No Class.";
        else
            return  str + "I teach " +klass.getDisplayName() +".";
    }

    public String introduceWith(Student student){
        String str =  super.introduce() + " I am a Teacher. ";//使用super调用父类方法
        if (klass.getNumber().equals(student.getKlass().getNumber())) {
            return str + "I teach " + student.getName() +".";
        }else
            return str + "I don't teach " + student.getName() +".";
    }
}
