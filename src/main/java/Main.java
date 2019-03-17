import waffle_decorator.chocolate.DarkChocolate;
import waffle_decorator.chocolate.MilkyChocolate;
import waffle_decorator.chocolate.Nutella;
import waffle_decorator.chocolate.WhiteChocolate;
import waffle_decorator.fruits.Banana;
import waffle_decorator.fruits.Kiwi;
import waffle_decorator.fruits.Pineapple;
import waffle_decorator.fruits.Strawberry;
import waffle_decorator.nuts.Almond;
import waffle_decorator.nuts.Coconut;
import waffle_decorator.nuts.Walnut;
import waffle_decorator.sauce.CaramelSauce;
import waffle_decorator.sauce.ChocolateSauce;
import waffle_decorator.sauce.RaspberrySauce;
import waffle_dough.BaseWaffle;
import waffle_dough.BelgianWaffle;
import waffle_dough.FreeGlutenWaffle;
import waffle_dough.WrapWaffle;


public class Main {


    public static void main(String[] args) {

        // Create first waffle

        BaseWaffle waffle1 = new BelgianWaffle();
        System.out.println( waffle1.getDescription() + " $" + waffle1.getPrice());

        // Now we add some condiment
        waffle1 = new Nutella(waffle1);
        System.out.println( waffle1.getDescription() + " $ " + waffle1.getPrice());

        waffle1 = new ChocolateSauce(waffle1);
        System.out.println( waffle1.getDescription() + " $ " +  waffle1.getPrice());

        waffle1 = new Kiwi(waffle1);
        System.out.println( waffle1.getDescription() + " $ " +  waffle1.getPrice());


        // Create second waffle

        BaseWaffle waffle2 = new WrapWaffle();
        System.out.println( waffle2.getDescription() + " $ " + waffle2.getPrice());

        waffle2 = new WhiteChocolate(waffle2);
        System.out.println( waffle2.getDescription() + " $ " + waffle2.getPrice());

        waffle2 = new CaramelSauce(waffle2);
        System.out.println( waffle2.getDescription() + " $ " + waffle2.getPrice());

        waffle2 = new Strawberry(waffle2);
        System.out.println( waffle2.getDescription() + " $ " + waffle2.getPrice());

        waffle2 = new Banana(waffle2);
        System.out.println( waffle2.getDescription() + " $ " + waffle2.getPrice());

        waffle2 = new Almond(waffle2);
        System.out.println( waffle2.getDescription() + " $ " + waffle2.getPrice());

        // create third waffle

        BaseWaffle waffle3 = new FreeGlutenWaffle();
        System.out.println( waffle3.getDescription() + " $ " + waffle3.getPrice());

        waffle3 = new DarkChocolate(waffle3);
        System.out.println( waffle3.getDescription() + " $ " + waffle3.getPrice());

        waffle3 = new MilkyChocolate(waffle3);
        System.out.println( waffle3.getDescription() + " $ " + waffle3.getPrice());

        waffle3 = new RaspberrySauce(waffle3);
        System.out.println( waffle3.getDescription() + " $ " + waffle3.getPrice());

        waffle3 = new Strawberry(waffle3);
        System.out.println( waffle3.getDescription() + " $ " + waffle3.getPrice());

        waffle3 = new Pineapple(waffle3);
        System.out.println( waffle3.getDescription() + " $ " + waffle3.getPrice());

        waffle3 = new Kiwi(waffle3);
        System.out.println( waffle3.getDescription() + " $ " + waffle3.getPrice());

        waffle3 = new Coconut(waffle3);
        System.out.println( waffle3.getDescription() + " $ " + waffle3.getPrice());

        waffle3 = new Walnut(waffle3);
        System.out.println( waffle3.getDescription() + " $ " + waffle3.getPrice());

    }
}
