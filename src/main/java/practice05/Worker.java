package practice05;

public class Worker extends Person{

    public Worker(String name, Integer age) {
        super(name, age);
    }

    public String introduce(){
        return super.introduce() + " I am a Worker. I have a job.";//使用super调用父类方法
    }
}