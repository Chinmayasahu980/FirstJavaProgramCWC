package com.jspyder.java;

public class File_test_1 {
    public static void main(String[]args){
        file_chaining f1 = new file_chaining("first image","jpg");
        System.out.println(f1.name);
        System.out.println(f1.extension);
        System.out.println(f1.size);

        file_chaining f2 = new file_chaining("first video");
        System.out.println(f2.name);
        System.out.println(f2.extension);
        System.out.println(f2.size);

    }
}
