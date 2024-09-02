package org.example.patterns.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Episodewatched implements Iteratorscreator{
    private List<Integer> episodes = new ArrayList<Integer>();
    @Override
    public Iterator<Integer> createIterator() {
        return new NumberIterator(this);
    }
    public void addNumberEpisode(int number) {
        episodes.add(number);
    }
    public List<Integer> getEpisodes() {
        return episodes;
    }
}
