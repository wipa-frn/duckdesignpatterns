package AbstractFactoryPattern;

import DecoratorPattern.QuackCounter;
import DecoratorPattern.QuackEcho;
import Duck.*;

public class EchoAndCountDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackEcho(new QuackCounter( new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackEcho(new QuackCounter(new RedheadDuck()));
    }

    @Override
    public Quackable createDuckCll() {
        return new QuackEcho(new QuackCounter(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackEcho(new QuackCounter(new RubberDuck()));
    }
}
