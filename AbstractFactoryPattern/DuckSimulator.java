package AbstractFactoryPattern;

import AdapterPattern.GooseAdapter;
import AdapterPattern.PigeonAdapter;
import DecoratorPattern.QuackCounter;
import Duck.Goose;
import Duck.Pigeon;
import Duck.Quackable;

public class DuckSimulator {
    /*Abstract ใช้เพื่อให้ง่ายต่อการสร้างคลาสที่มี Decorator หลายๆอย่าง*/
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        AbstractDuckFactory countingEchoDuckFactory = new EchoAndCountDuckFactory();
        simulator.simulate(countingEchoDuckFactory);
    }
    void simulate(AbstractDuckFactory duckFactory){

        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCll();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());


        System.out.println("\nDuck Simulator: Abstract Factory");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuack() + " times");

    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
