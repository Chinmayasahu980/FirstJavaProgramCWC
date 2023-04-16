package polymorphism;

class msword implements msoffice {

    @Override
    public void write()
    {
        System.out.println("can write");
    }
    @Override
    public void save()
    {
        System.out.println("save in c drive");
    }
    @Override
    public void saveas()
    {
        System.out.println("save as word file");
    }
}
