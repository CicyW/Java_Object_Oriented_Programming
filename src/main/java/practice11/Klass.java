package practice11;

public class Klass {

    Integer number;
    Student leader;

    public Klass(Integer number){
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public String getDisplayName(){
        if (number!=null)
            return "Class " + number;
        else
            return "no Class";
    }

    public void assignLeader(Student student){
        Klass klass = student.getKlass();
        if(student.getKlass()!=null&&this.number==student.getKlass().getNumber())
            klass.setLeader(student);
        else
            System.out.print("It is not one of us.\n");
    }

    public void appendMember(Student student){
        student.setKlass(this);
    }

    @Override
    public int hashCode() {
        int result = number.hashCode();
        result = 31 * result + number;
        return result;
    }

}
