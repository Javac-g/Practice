package hw;

public class Student extends Employee {


    private String name, sname, place, position;

    public Student(){
        this.name = "Max";
        this.sname = "Denysov";
        this.place = "Alfred Nobel Univercity";
        this.position = "Computer Science" ;
    }

    public Student(String name, String sname, String place, String position)
    {
        super(name, sname, place, position);
    }

    @Override
    public String getName() {
        return "Max";
    }

    @Override
    public String getSname() {
        return "Denysov";
    }

    @Override
    public String getPlace() {
        return "Alfred Nobel Univercity";
    }

    @Override
    public String getPosition() {
        return "Computer Science";
    }
}

