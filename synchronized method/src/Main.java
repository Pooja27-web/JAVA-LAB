class Printer {
    synchronized void message(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("]");

    }
}
class MyThread extends Thread { //child or thread class
    Printer print_msg; // parent class name
    String msg;
    MyThread(Printer print_msg,String msg) { // child constructor
        this.print_msg = print_msg;
        this.msg = msg;
    }
    public void run() {
        print_msg.message(msg);
    }
}
 class Synchronization { ///  main class
    public static void main(String[] args) {
        Printer p = new Printer();
        MyThread m1 = new MyThread(p,"Hello");
        MyThread m2= new MyThread(p,"hii");
        MyThread m3 = new MyThread(p,"java");
        MyThread m4 = new MyThread(p,"pooja");
        MyThread m5 = new MyThread(p,"often");

        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();

    }
} // syncronization is required when we are creating multiple threads