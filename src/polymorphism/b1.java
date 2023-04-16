package polymorphism;

class b1 implements bank{
    @Override
    public void deposite() {
        System.out.println("enter amount for deposite");
    }
    @Override
    public void withdraw(){
        System.out.println("enter amount for withdraw");
    }
}
