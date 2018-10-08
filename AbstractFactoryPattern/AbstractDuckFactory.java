package AbstractFactoryPattern;

import Duck.Quackable;

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCll();
    public abstract Quackable createRubberDuck();
}
