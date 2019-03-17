package waffle_decorator.fruits;

import waffle_decorator.BaseDecorator;
import waffle_dough.BaseWaffle;

public class Pineapple extends BaseFruit {

    public Pineapple(BaseWaffle waffleToDecorate) {
        super(waffleToDecorate);
        this.price = 0.5;
    }

    public String getDescription() {
        return baseWaffle.getDescription() + " , Pineapple ";
    }
}
