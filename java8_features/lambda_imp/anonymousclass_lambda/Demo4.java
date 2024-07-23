package java8_features.lambda_imp.anonymousclass_lambda;

interface Interface{
    int z=10;
    public String getSalary();
}
public class Demo4{
    static int x=2;   //instance var
    public static void doSomething(){
        //int x=2;    //local var
        Interface i=()->{
            x=4;      //cant able to change local var inside lambda but we can change instance var
            return "10000";
        };

        //anonymous class
        Interface i2=new Interface() {
            final int x=3;   //instance var
            @Override
            public String getSalary() {
                int y=4; //local var
                System.out.println(this.x);    //access this keyword
                System.out.println(y);         //local var access directly
                System.out.println(z);         //var z is directly print
                return "100";
            }
        };

    }
    public static void main(String[] args) {
        doSomething();

    }
}
