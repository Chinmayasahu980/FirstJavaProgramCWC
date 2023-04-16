package polymorphism;

class c2 implements noteped,msword1 {
    @Override
    public void text(){
        System.out.println("enter text");
    }
    @Override
    public void size()
    {
        System.out.println("size of document");
    }
    @Override
    public void type()
    {
        System.out.println("word type");
    }
}
