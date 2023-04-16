package com.jspyder_opps.java;

public class facebook {
        String id;
        String password;
        public void profile()
    {
        System.out.println(id);
        System.out.println(password);
    }
        public static void main(String[]args)
        {
            facebook f1 = new facebook();
            f1.id = "anjel priya";
            f1.password = "fake id" ;
            facebook f2 = new facebook();
            f2.id  = "mom";
            f2.password = "dad";

            f1.profile();
            f2.profile();
        }
    }

