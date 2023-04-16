package com.arrya;

public class certificate {
   String name;
   double percentage;
   String course;
   public certificate(String name,double percentage,String course)
   {
       this.name = name;
       this.percentage = percentage;
       this.course = course;
   }
   @Override
    public String toString()
   {
       return name+" "+percentage+" "+course;
   }
}
