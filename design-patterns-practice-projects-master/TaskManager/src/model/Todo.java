package model;

import java.util.LinkedList;
import java.util.List;


public class Todo extends Doable{

    private List<Doable> doables;

    private boolean complete;


    public Todo(String description) {
        super(description);
        doables = new LinkedList<>();
        complete = false;
    }

    @Override
    public void display(String indentSpace) {
        System.out.println(getDescription());

        for (Doable doable : doables){
            System.out.print(indentSpace);
            doable.display(indentSpace);
        }
    }

    public List<Doable> getDoables() {
        return doables;
    }
    public boolean getStatus() { return complete; }

    @Override
    String getDescription() {
        return description;
    }

    /**
     *
     * @param d the doable we want to add to our doables
     * @return true if we are able to add the item to our subtasks, else false
     */
    public boolean addDoable(Doable d){
        if(!doables.contains(d)) {
            doables.add(d);
            return true;
        }
        return false;
    }

    /**
     *
     * @return true if the this doables are complete
     */
    private boolean refactoredComplete(){
        boolean areDoablesComplete = true;

        for (Doable doable : doables){
            if(!doable.getStatus()){
                areDoablesComplete = false;
            }
        }

        complete = areDoablesComplete;
        return complete;
    }

    /**
     *
     * @return true if THIS subtask is complete
     */
    public boolean isThisTodoComplete() {
        return refactoredComplete();
    }

}
