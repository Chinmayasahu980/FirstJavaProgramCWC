package com.chinmaya;

public class whatsapp {
    String message;
    String time;
    int viewers;
     whatsapp(String message,String time)
    {
        this.message=message;
        this.time=time;
    }
    whatsapp (String message)
    {
        this.message=message;

    }
    whatsapp (String message,String time,int viewers)
    {
        this.message=message;
        this.time=time;
        this.viewers=viewers;
    }
    public void showstatus()
    {
        System.out.println(message);
        System.out.println(time);
        System.out.println(viewers);
    }
    public static void main(String[]args)
    {
        whatsapp wp1=new whatsapp("feeling happy","at 4.45 pm");
        wp1.showstatus();
        whatsapp wp2 =new whatsapp("hey i am here ","5.00pm",456);
        wp2.showstatus();
        whatsapp wp3=new whatsapp("feeling lazy");
        wp3.showstatus();

    }
}
