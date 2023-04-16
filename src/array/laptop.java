package array;

import org.w3c.dom.ls.LSOutput;

public class laptop {
    String name;
    int ram;

    public laptop(String name, int ram) {
        this.name = name;
        this.ram = ram;
    }

    public static void main(String[] args) {


    laptop[] l = new laptop[3];
    l[0] = new laptop("hp",16);
    l[1] = new laptop("lenovo",8);
    l[2] = new laptop("dell",12);
        System.out.println(l[1].ram);
        System.out.println(l[2].name);
        System.out.println(l[0].ram);

}
}