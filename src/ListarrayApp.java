import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListarrayApp {

    public static void main(String[] args) {

        //Task 1. Create ListArray with 10 000 000 elements
        printExercise(1);
        List<Integer> myListArray = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            myListArray.add(i);
            int temp = myListArray.get(i);
        }
        System.out.println(" " + myListArray + "\n");

        //Task 2. For-each loop
        printExercise(2);
        long startTimeTwo = System.currentTimeMillis();
        for (Integer elements : myListArray) {
            //
        }
        long finishTimeTwo = System.currentTimeMillis();
        System.out.println("Task 2 took " + (finishTimeTwo - startTimeTwo) + " ms" +
                           "\n===============");

        //Task 3. Classic for + list.size() for each iteration
        printExercise(3);
        long startTimeThree = System.currentTimeMillis();
        for (int i = 0; i < myListArray.size(); i++) {
            myListArray.size();
        }
        long finishTimeThree = System.currentTimeMillis();
        System.out.println("Task 3 took " + (finishTimeThree - startTimeThree) + " ms" +
                           "\n===============");

        //Task 4. Classic for + list.size() into variable
        printExercise(4);
        long startTimeFour = System.currentTimeMillis();
        for (int i = 0; i < myListArray.size(); i++) {
            int temp = myListArray.size();
        }
        long finishTimeFour = System.currentTimeMillis();
        System.out.println("Task 4 took " + (finishTimeFour - startTimeFour) + " ms" +
                "\n===============");

        //Task 5. Classic for + list.size() into variable + starts from the end
        printExercise(5);
        long startTimeFive = System.currentTimeMillis();
        for (int i = myListArray.size()-1; i >=0; i--) {
            int temp = myListArray.size();
        }
        long finishTimeFive = System.currentTimeMillis();
        System.out.println("Task 5 took " + (finishTimeFive - startTimeFive) + " ms" +
                "\n===============");

        //Task 6. Using Iterator
        printExercise(6);
        long startTimeSix = System.currentTimeMillis();
        Iterator<Integer> iterator = myListArray.iterator();
        while (iterator.hasNext()){
            iterator.next();
        }
        long finishTimeSix = System.currentTimeMillis();
        System.out.println("Task 6 took " + (finishTimeSix - startTimeSix) + " ms" +
                           "\n===============");

        //Task 7. Using ListIterator
        printExercise(7);
        long startTimeSeven = System.currentTimeMillis();
        ListIterator<Integer> integerListIterator = myListArray.listIterator();
        while (integerListIterator.hasNext()){
            integerListIterator.next();
        }
        long finishTimeSeven = System.currentTimeMillis();
        System.out.println("Task 7 took " + (finishTimeSix - startTimeSix) + " ms" +
                           "\n===============");


    }

    public static void printExercise(int number) {
        System.out.println("\nTask " + number +
                           "\n_____________");
    }
}

