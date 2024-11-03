public class Employee {


    private String name;
    private String id;
    private int salary;


    Employee() {

    }

    public void Employee(String id, String name, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }


    public int raisedSalary(int percent){
return salary + (salary*percent/100);
    }

    public String toString() {
        return "the name is: "+name+" the id is: "+id+" the salary is: "+salary;
    }
}
