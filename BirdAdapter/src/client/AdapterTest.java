package client;

import adapter.impl.DuckAdapter;
import adapter.impl.TurkeyAdapter;
import bird.Duck;
import bird.Turkey;
import bird.impl.MallardDuck;
import bird.impl.WildTurkey;

public class AdapterTest {

    public static void main(String[] args) {

        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("Duck behaviors");
        duck.quack();
        duck.fly();
        System.out.println();

        System.out.println("Turkey behaviors");
        turkey.gobble();
        turkey.fly();
        System.out.println();

        System.out.println("Adapted turkey behaviors");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
        System.out.println();

        System.out.println("Adapted duck behaviors");
        duckAdapter.gobble();
        duckAdapter.fly();
        System.out.println();

        testAssertion(12);
    }

    private static void testAssertion(int i) {
        assert (i > 100);
        System.out.println(1);
    }
}
