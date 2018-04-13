package practice10;

import java.util.Set;

public class Teacher extends Person{

    Set<Klass> classes;

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }
    public Teacher(Integer id, String name, Integer age,Set<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Set<Klass> getClasses() {
        return classes;
    }

    public void setClasses(Set<Klass> classes) {
        this.classes = classes;
    }

    public String introduce(){
        String str;
        if (classes==null||classes.size()==0)
            return super.introduce() + " I am a Teacher. I teach No Class.";
        else {
            String classnumbers = "";
            for(Klass klass:classes){
                classnumbers = classnumbers + klass.getNumber().toString() + ", ";
            }
            System.out.println(classnumbers);
            return super.introduce() + " I am a Teacher. I teach Class " + classnumbers.substring(0,classnumbers.length()-2) + ".";
        }
    }

    public boolean isTeaching(Student student){
        boolean flag = false;
        if(student.getKlass()!=null){
            for(Klass klass:classes){
                if (klass.equals(student.getKlass())){
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    public String introduceWith(Student student){
        if(isTeaching(student)){
            return super.introduce() + " I am a Teacher. I teach " + student.getName() +".";
        }else{
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() +".";
        }

    }
}
