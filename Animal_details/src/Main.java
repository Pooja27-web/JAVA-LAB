class Childs1 extends Thread{
    public void run(){
        System.out.println("----Animal_Details1----");
        System.out.println("Animal1_name: Dog");
        System.out.println("Animal1_colour: Brown");
        System.out.println("Animal1_age: 5Years");
        System.out.println("Animal1_Price: 50000");

        System.out.println("----Animal_Details2----");
        System.out.println("Animal2_name: Cat");
        System.out.println("Animal2_colour: Black");
        System.out.println("Animal2_age: 10Years");
        System.out.println("Animal2_Price: 25000");

        System.out.println("----Animal_Details3----");
        System.out.println("Animal3_name: Pig");
        System.out.println("Animal3_colour: Pink");
        System.out.println("Animal3_age: 15Years");
        System.out.println("Animal3_Price: 5000");

        System.out.println("----Animal_Details4----");
        System.out.println("Animal4_name: Cow");
        System.out.println("Animal4_colour: White");
        System.out.println("Animal4_age: 25Years");
        System.out.println("Animal4_Price: 50000");

        System.out.println("----Animal_Details5----");
        System.out.println("Animal5_name: Horse");
        System.out.println("Animal5_colour: Brown");
        System.out.println("Animal5_age: 5Years");
        System.out.println("Animal5_Price: 500000");
    }
}
public class ThreadInJava {
    public static void main(String[]args){
        Childs1 obj=new Childs1();
        //obj.run();
        obj.start();
    }
}