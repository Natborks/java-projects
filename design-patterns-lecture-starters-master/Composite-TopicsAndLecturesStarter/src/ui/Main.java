package ui;

import model.Lecture;
import model.Topic;
import model.Video;

public class Main {

    public static void main(String[] args) {
        Topic designPatterns = new Topic("Design patterns");
        Topic observer = new Topic("Observer");
        Topic composite = new Topic("Composite");
        Lecture patternsIntro = new Lecture("Intro to Patterns");
        Lecture observerIntro = new Lecture("Intro to Observer");
        Lecture compositePattern = new Lecture("Composite Pattern");
        Video video = new Video("Some video");
        designPatterns.addModule(observer);
        designPatterns.addModule(composite);
        designPatterns.addModule(patternsIntro);
        designPatterns.addModule(video);
        observer.addModule(observerIntro);
        composite.addModule(compositePattern);

        designPatterns.display("  ");
    }


}
