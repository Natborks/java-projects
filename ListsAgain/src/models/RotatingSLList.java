package models;

import javax.xml.soap.Node;

public class RotatingSLList<Item> extends SLList<Item>{

    public static void main(String[] args) {
        RotatingSLList<Integer> rotatingSLList = new RotatingSLList<>();

        rotatingSLList.addLast(2);
        rotatingSLList.addLast(3);

        rotatingSLList.rotateRight();
        for(int i = 0; i < rotatingSLList.size(); i++){
            System.out.println(rotatingSLList.get(i));
        }
    }

    private void rotateRight() {
        Item x = removeLast();
        addFirst(x);
    }
}
