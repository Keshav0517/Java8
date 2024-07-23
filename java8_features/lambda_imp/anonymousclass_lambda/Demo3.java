package java8_features.lambda_imp.anonymousclass_lambda;

interface Employee{
    int getSalary();
    String getName();
    String getDesignation();
}

public class Demo3 implements Employee{
    private int salary;
    private final String name;
    private final String designation;

    Demo3(int salary,String name,String designation){
        this.salary=salary;
        this.name=name;
        this.designation=designation;
    }
    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public String getDesignation(){
        return designation;
    }

    public static void main(String[] args) {
        Employee employee=new Employee() {
            @Override
            public int getSalary() {
                return 10000;
            }

            @Override
            public String getName() {
                return "Keshav";
            }

            @Override
            public String getDesignation() {
                return "Java Developer";
            }
        };

        String n=employee.getName();
        System.out.println("Name:"+n);


    }
}
