package inheritenceInJava;

public class Programmer extends Employee{
    int bonus = 400;
    void display(){
        int totalSalary = bonus + salary + pf;
        System.out.println("Total Salary is :"+ totalSalary);
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.display();


    }



}
