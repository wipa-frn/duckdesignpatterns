package DecoratorPattern;

import Duck.DuckCall;
import Duck.MallardDuck;
import Duck.Quackable;
import Duck.RedheadDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }
    void simulate(){
        /*Adapter เหมือนเป็นการสร้างตัวกลางมาเพื่อให้คลาสของทั้งสองคลาสทำงานด้วยกันได้
         decorator เหมือนเป็นการเพิ่มการทำงานเพิ่มเติมให้กับคลาสที่มีอยู่*/

        //นับจำนวนการ quack ของ Echo เป็น 1 ครั้งด้วย
        Quackable mallardDuck = new QuackEcho(new QuackCounter(new MallardDuck()));
        Quackable redheadDuck = new QuackEcho(new QuackCounter(new RedheadDuck()));
        Quackable duckCall = new QuackEcho(new QuackCounter(new DuckCall()));
        Quackable rubberDuck = new QuackEcho(new QuackCounter(new RedheadDuck()));

        //ไม่นับจำนวนการ quack ของ Echo
//        Quackable mallardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
//        Quackable redheadDuck = new QuackCounter(new QuackEcho(new RedheadDuck()));
//        Quackable duckCall = new QuackCounter(new QuackEcho(new DuckCall()));
//        Quackable rubberDuck = new QuackCounter(new QuackEcho(new RedheadDuck()));


        System.out.println("\nDuck Simulator: With Decorator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuack() + " times");

    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
