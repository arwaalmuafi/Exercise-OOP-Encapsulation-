public class empolee {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.setName("arwa");
        employee1.setId("8848893");
        employee1.setSalary(20000);
        System.out.println(employee1);
        System.out.println();


        System.out.println(employee1.toString());

        System.out.println("Annual Salary: " + employee1.getAnnualSalary());

        int newSalary = employee1.raisedSalary(10);
        System.out.println("New Salary after 10% raise: " + newSalary);
    }

    }
