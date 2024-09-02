package org.example.patterns.Iterator;

import java.util.Iterator;

public class NumberIterator implements Iterator<Integer> {
    private Episodewatched episodewatched;
    private int index = 0;
    public NumberIterator(Episodewatched episodewatched) {
        this.episodewatched = episodewatched;
    }

    @Override
    public boolean hasNext() {
        return index < episodewatched.getEpisodes().size();
    }

    @Override
    public Integer next() {
        return episodewatched.getEpisodes().get(index++);
    }
}
