package hw;

public class Employee {

    private String name, sname, place, position;

    public Employee() {
        name = " Anton";
        sname = " Semenov";
        place = " Epum ";
        position = " Software engeneer";
    }

    public Employee(String name, String sname, String place,String position) {
        this.name = name;
        this.sname = sname;
        this.place = place;
        this.position = position;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}