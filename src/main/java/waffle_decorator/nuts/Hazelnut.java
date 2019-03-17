package waffle_decorator.nuts;

import waffle_dough.BaseWaffle;

public class Hazelnut extends BaseNuts {

    public Hazelnut(BaseWaffle waffleToDecorate) {
        super(waffleToDecorate);
        this.price = 1.00;
    }

    public String getDescription() {
        return baseWaffle.getDescription() + " , Hazelnut ";
    }
}
