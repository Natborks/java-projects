package model;

import model.media.AbstractMedia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iPod implements Iterable<AbstractMedia>{

    private String name;

    // TODO: add fields here which represent this iPod's Movies, Photos, and Songs, they should be of the Collection type
    private List<AbstractMedia> mediaList;

    public iPod(String name) {
        this.name = name;
        mediaList = new ArrayList<>();
    }

    // getters
    public String getName() { return name; }

    public void addMedium (AbstractMedia m){
        mediaList.add(m);
    }


    @Override
    public Iterator<AbstractMedia> iterator() {
        return mediaList.iterator();
    }
}
