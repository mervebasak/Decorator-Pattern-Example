package waffle_decorator.chocolate;

import waffle_dough.BaseWaffle;

public class MilkyChocolate extends BaseChocolate {

    public MilkyChocolate(BaseWaffle waffleToDecorate) {
        super(waffleToDecorate);
        this.price = 2.0;
    }

    public String getDescription() {

        return baseWaffle.getDescription() + " , Milky Chocolate ";
    }
}
