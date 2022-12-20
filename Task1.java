// Задача 1: Пусть дан LinkedList с несколькими элементами. 
//Реализуйте метод, который вернет “перевернутый” список.

//import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> my_list = new LinkedList<String>();
        my_list.add("4");
        my_list.add("m");
        my_list.add("i");
        my_list.add("r");
        my_list.add("22");
        my_list.add("A");
        my_list.add("1");
        System.out.println(my_list);

        //Collections.reverse(my_list);
        //System.out.println("'Перевернутый' список: " + my_list);
       
        addStack(my_list);
    }
    public static Stack<String> st = new Stack<>();

    
    public static void addStack(LinkedList<String> my_list) {
        for (String elem : my_list) {
            st.push(elem);
        }
        while (!st.empty()){
            System.out.print(st.pop() + " ");
        }     
    }
}


    
