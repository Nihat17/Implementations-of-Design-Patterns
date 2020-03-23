public class TurkeyAdapter implements Duck{

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        turkey.gobble();
    }

    @Override
    public void quack() {
        for(int i = 0; i < 5; i++)
            turkey.fly();
    }
}
