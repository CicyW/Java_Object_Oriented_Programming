package practice04;

public class Worker extends Person{
    public Worker(String name, Integer age) {
        super(name, age);
    }

    public String introduce(){
        return basicintroduce() + " I am a Worker. I have a job.";
    }
}
