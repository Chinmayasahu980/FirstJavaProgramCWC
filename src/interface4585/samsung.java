package interface4585;

public class samsung implements smartphone{
    @Override
    public void call()
    {
        System.out.println("you can call");
    }

    @Override
    public void music()
    {
        System.out.println("song");
    }
    @Override
    public void internet() {
        System.out.println("5g");
    }
}
