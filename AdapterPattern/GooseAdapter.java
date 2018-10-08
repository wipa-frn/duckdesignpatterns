package AdapterPattern;

import Duck.Goose;
import Duck.Quackable;

public class GooseAdapter implements Quackable {
    Goose goose;
    public GooseAdapter(Goose goose){
        this.goose = goose;
    }
    @Override
    public void quack() {
        goose.honk();
    }
}
