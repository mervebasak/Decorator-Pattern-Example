package waffle_decorator.fruits;

import waffle_dough.BaseWaffle;

public class Kiwi extends BaseFruit {

    public Kiwi(BaseWaffle waffleToDecorate) {
        super(waffleToDecorate);
        this.price = 0.5;
    }

    public String getDescription() {
        return baseWaffle.getDescription() + " , Kiwi ";
    }
}
