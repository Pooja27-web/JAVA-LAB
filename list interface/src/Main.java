import java.util.*;
class list {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
       for(Integer my_list : list) {
           System.out.println(my_list);
       }
    }
}