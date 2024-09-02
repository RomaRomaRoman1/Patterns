package org.example;

import org.example.patterns.Adapter.Clothes;
import org.example.patterns.Adapter.Human;
import org.example.patterns.Iterator.Episodewatched;
import org.example.patterns.Iterator.NumberIterator;
import org.example.patterns.Singleton.Database;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Application example Singleton
        Database db = Database.getInstance();
        Database dbTryCreateAgain = Database.getInstance();

        //Application example Adapter
        Human human = new Human();
        Clothes clothesForWalk = new Clothes(human);
        clothesForWalk.walk();

        //Application example Iterator
        Episodewatched episodewatched = new Episodewatched();
        episodewatched.addNumberEpisode(1);
        episodewatched.addNumberEpisode(2);
        episodewatched.addNumberEpisode(3);
        NumberIterator numberIterator = new NumberIterator(episodewatched);
        System.out.println(numberIterator.next());
        System.out.println(numberIterator.next());
        System.out.println(numberIterator.hasNext());
        numberIterator.next();
        System.out.println(numberIterator.hasNext());
    }
}
