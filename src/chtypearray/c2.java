package chtypearray;

public class c2 {
    public static void main(String[]args){
        String fruit;
        String fruit1 = new String ("banana");
        String fruit2 = "water melon";
        String fruit3 = new String ("banana");
        System.out.println(fruit1 == fruit2);
        System.out.println(fruit1 == fruit3);
        System.out.println(fruit1.equals(fruit3));

    }
}
