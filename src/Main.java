package Lab3;

import cwiczenie2.Task;
import cwiczenie2.CATEGORY;


public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Studia", "Zrobic projekt", CATEGORY.IN_PROGRESS );
        Task task2 = new Task("Trening", "Bieganie 3km", CATEGORY.DONE );
        Subtask task3 = (Subtask) new Object();
    }

    public void getDetailInfo(Object o);
}