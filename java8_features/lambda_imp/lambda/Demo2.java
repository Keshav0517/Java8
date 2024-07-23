package java8_features.lambda_imp.lambda;

@FunctionalInterface
interface Employee{
    public String getName(String name);

    default void projectDetail(){
        System.out.println("Project:->Travel Application");
    }
}

//class SoftwareEngineers implements Employee{
//    public String getName(String name){
//        return name;
//    }
//}

public class Demo2 implements Employee{
    public static void main(String[] args) {
        //Functional Interface holds lambda expression
        //lambda->Provide usability
        Employee developer=name ->name;
        System.out.println("Developer name:"+developer.getName("Keshav"));

        Employee client=name -> name;
        System.out.println("Client name:"+client.getName("John"));

        Employee manager=name -> name;
        System.out.println("Manager name:"+manager.getName("Manoj"));

        Employee hr=name -> name;
        System.out.println("Hr name:"+hr.getName("Rani Gupta"));

        System.out.println("Project Detail....");
        Employee obj=new Demo2();
        obj.projectDetail();


        /*
        Demo2 demo2=new Demo2();
        String res=demo2.getName("Keshav");
        System.out.println("Name:"+res);
         */
    }

    @Override
    public String getName(String name) {
        return null;
    }

    @Override
    public void projectDetail() {
        Employee.super.projectDetail();
    }

}
