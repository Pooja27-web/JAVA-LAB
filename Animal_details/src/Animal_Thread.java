class Animals extends Thread { // child or thread class
    public void animal1() {
        String animal_name = "Dog";
        String animal_color = "Black";
        Double animal_age = 3.5;
        String animal_price = "50$";
        System.out.println("Animals details: ");
        System.out.println("--------------");
        System.out.println("Animals name: " + animal_name);
        System.out.println("Animals color: " + animal_color);
        System.out.println("Animals age: " + animal_age);
        System.out.println("Animals price: " + animal_price);
    }
}

public class Animal_Thread {
    public static void main(String[]args){
        Animals animals = new Animals();
        animals.animal1();
    }
}
