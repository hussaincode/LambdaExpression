package work;

public class Main {
    public static void main(String[] args) {
        System.out.println("mai starts...");
//        MyInter myInter = new MyInterImpl();
//        myInter.sayHello();

       /* MyInter i=new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("This is our first anonymous class");
            }
        };
        i.sayHello();
        MyInter i2=new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("This is our 2nd anonymous class");
            }
        };
        i2.sayHello();*/
       /* MyInter i=()-> System.out.println("This is first time i am using lambda");
        MyInter i2=()-> System.out.println("This is 2nd time i am using lambda");

        i.sayHello();
        i2.sayHello();*/

        SumInter sumInter=(a,b)->  a+b;

        System.out.println(sumInter.sum(2,7));
        System.out.println(sumInter.sum(9,7));

        LengthInter l=str -> str.length();
        System.out.println(l.getLength("hussain"));
    }
}
