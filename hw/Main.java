package hw;

public class Main extends Employee {


    public static void main(String...args){

        Employee employee = new Employee();
        Student student = new Student();


        System.out.println("***************Сотрудник без параметров***************\n ");

        System.out.println("Фамилия: " + employee.getSname() + "\nМесто работы: " + employee.getPlace()+"\nДолжность: " + employee.getPosition()+"\n");


        System.out.println("***************Студент без параметров***************\n");

        System.out.println("Фамилия: " + student.getSname() + "\nМесто учебы: " + student.getPlace()+"\nСпециальность: " + student.getPosition()+"\n");


        Employee employeeP = new Employee("Ivan","Ivanov","Oracle","Senior developer");
        Student studentP = new Student("Petr","Petrov","Alfred Nobel Univercity","Computer Science");

        System.out.println("***************Сотрудник c параметрами***************\n");

        System.out.println("Фамилия: " + employeeP.getSname() + "\nМесто работы: " + employeeP.getPlace()+"\nДолжность: " + employeeP.getPosition()+"\n");

        System.out.println("***************Студент c параметрами***************\n");

        System.out.println("Фамилия: " + studentP.getSname() + "\nМесто учебы: " + studentP.getPlace()+"\nСпециальность: " + studentP.getPosition()+"\n");


    }
}
