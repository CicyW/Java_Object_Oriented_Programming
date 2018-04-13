package practice10;

public class Student extends Person{

    Klass klass;

    public Student(Integer id,String name, Integer age, Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce(){

        if (klass.getLeader()!=null&&this.id==(klass.getLeader().getId()))
            return super.introduce() + " I am a Student. I am Leader of " +klass.getDisplayName()+".";
        else
        if(klass!=null)
            return super.introduce() + " I am a Student. I am at " +klass.getDisplayName()+".";
        else
            return super.introduce() + " I am a Student.";
    }
}
