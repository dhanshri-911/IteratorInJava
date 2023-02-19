import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");

        // simple for loop
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("For Loop");
            System.out.println(myList.get(i));
        }

        // Enhanced For Loop

        for (String i : myList) {
            System.out.println("Enhanced For Loop");
            System.out.println(i);
        }

        //while loop

        int i = 0;
        while (i < myList.size()) {
            System.out.println("in While loop");
            System.out.println(myList.get(i));
            i++;
        }


        //using Iterator

        Iterator<String> itr = myList.iterator();
        while(itr.hasNext()){
            System.out.println("in iterator");
            System.out.println(itr.next());
        }

        ListIterator<String> itrList = myList.listIterator();
        while(itr.hasNext()){
            System.out.println("in ListIterator");
            System.out.println(itrList.next());
        }
        //using Lmbda Expression

        myList.forEach(
                (temp) -> {
                    System.out.println("in Lamda for ech");
                    System.out.println(temp);
                }
        );

        //stream api

        myList.stream().forEach(

                (temp) -> System.out.println(temp)
        );
    }
}