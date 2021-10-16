package ui;

import model.Task;
import model.Todo;

public class TodoUser {
    public static void main(String[] args) {
        Todo todo = new Todo("Todo for space launch");
        Todo lSam = new Todo("Prep LSAM");
        Task task = new Task("prep LEM", "20/20/99","Florida");
        Task ignitionTask = new Task("Check ignition", "22/33/10", "Florida");
        Task task1 = new Task("Prep LSAM", "15/20/99", "Florida");

        todo.addDoable(task);
        todo.addDoable(ignitionTask);
        lSam.addDoable(task1);
        todo.addDoable(lSam);

        todo.display("  ");
    }
}
