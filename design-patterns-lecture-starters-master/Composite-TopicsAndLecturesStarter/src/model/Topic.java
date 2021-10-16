package model;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.util.ArrayList;
import java.util.List;

public class Topic extends Module {
//
//    List<Lecture> lectures = new ArrayList<>();
//    List<Topic> topics = new ArrayList<>();
//    List<Video> videos = new ArrayList<>();
    List<Module> modules;

    private String name;

    public Topic (String name) {
        this.name = name;
        modules = new ArrayList<>();
    }

//    public void addTopic(Topic t) {
//
//    }
//
//    public void addLecture(Lecture lecture) {
//
//    }
//
//    public void addVideo(Video video) {
//
//    }

    public void addModule(Module m){
        modules.add(m);
    }

    @Override
    public void display(String indentLevel) {
        System.out.println(indentLevel + name);
//        for (Lecture lecture : lectures){
//            lecture.display(indentLevel + indentLevel);
//        }
//
//        for (Topic topic : topics){
//            topic.display(indentLevel + indentLevel);
//        }
//
//        for (Video video : videos) {
//            video.display(indentLevel + indentLevel);
//        }

        for (Module module : modules){
            module.display(indentLevel + indentLevel);
        }
    }



}
