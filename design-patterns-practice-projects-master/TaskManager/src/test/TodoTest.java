package test;

import model.Task;
import model.Todo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TodoTest {

    public Todo todo;
    public Task ignitionTask;

    @Before
    public void setup(){
        todo = new Todo("Todo for space launch");
        Todo lSam = new Todo("Prep LSAM");
        Task task = new Task("prep LEM", "20/20/99","Florida");
        ignitionTask = new Task("Check ignition", "22/33/10", "Florida");
        Task task1 = new Task("Prep LSAM", "15/20/99", "Florida");

        todo.addDoable(task);
        todo.addDoable(ignitionTask);
        lSam.addDoable(task1);
        todo.addDoable(lSam);
    }

    @Test
    public void testAddDoable(){
        Task task = ignitionTask;
        Todo todo = new Todo("Todo for ignition task");
        Todo newTodo = new Todo("To be filled later");

        newTodo.addDoable(task);
        newTodo.addDoable(todo);

        boolean containsTask =  newTodo.getDoables().contains(task);
        Assert.assertTrue(containsTask);

        boolean containsTodo = newTodo.getDoables().contains(todo);
        Assert.assertTrue(containsTodo);
    }

    @Test
    public void isTodoComplete(){
        Todo completeTodo = new Todo("to be cleaned");

        ignitionTask.complete();
        completeTodo.addDoable(ignitionTask);

        boolean complete = completeTodo.isThisTodoComplete();

        Assert.assertTrue(complete);

    }

}
