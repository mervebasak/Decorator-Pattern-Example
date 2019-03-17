package waffle_decorator.chocolate;

import waffle_dough.BaseWaffle;

public class DarkChocolate extends BaseChocolate {

    public DarkChocolate(BaseWaffle waffleToDecorate) {
        super(waffleToDecorate);
        this.price = 2.0;
    }
    public String getDescription() {
        return baseWaffle.getDescription() + " , Dark Chocolate ";
    }
}
