public class Main {
    public static void main(String[] args){
        Duck mallarDuck = new MallarDuck();
        System.out.println("Duck says");
        testDuck(mallarDuck);

        Turkey wildTurkey = new WildTurkey();
        System.out.println("Turkey says");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("Turkey Adapter says");
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);
        testDuck(turkeyAdapter);
    }
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
