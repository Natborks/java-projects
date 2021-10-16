package Observer;

import model.LectureModule;
import model.Student;

import java.util.ArrayList;
import java.util.List;


public class Subject {
    List<LectureObserver> observers = new ArrayList<>();

    public List<LectureObserver> getObservers() {
        return observers;
    }

    public void addObserver(LectureObserver observer){
        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }

    public void notifyObservers(LectureModule lectureModule){
        for (LectureObserver lectureObserver : observers){
            lectureObserver.update(lectureModule);
        }
    }
}
