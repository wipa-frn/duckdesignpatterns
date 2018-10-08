package CompositePattern;

import Duck.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{
    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        int leader = 0; //sergeant not quack 3 times
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackable quacker = (Quackable) iterator.next();
            if (leader == 0){
                System.out.print("Leader : ");
                quacker.quack();
                System.out.print("Leader : ");
                quacker.quack();
                System.out.print("Leader : ");
                quacker.quack();
                leader = 1; // sergeant quacked
            }
            else
                quacker.quack();
        }
    }
}
