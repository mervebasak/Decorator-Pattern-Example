package waffle_decorator.fruits;

import waffle_decorator.BaseDecorator;
import waffle_dough.BaseWaffle;

public abstract class BaseFruit extends BaseDecorator {

    public BaseWaffle baseWaffle;

    public BaseFruit(BaseWaffle waffleToDecorate){
        this.baseWaffle = waffleToDecorate;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double getPrice() {
        return (this.baseWaffle.getPrice() + this.price);
    }
}
