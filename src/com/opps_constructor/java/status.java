package com.opps_constructor.java;

public class status {
    String msg;
    String uploadtime;
    int viewer;
    public status (String msg)
    {
        this.msg=msg;
    }
    public status(String msg,String uploadtime)
    {
        this.msg= msg;
        this.uploadtime=uploadtime;
    }
    public status(String msg,String uploadtime,int viewer)
    {
        this.msg= msg;
        this.uploadtime=uploadtime;
        this.viewer = viewer;
    }
    public void statusdetails()
    {
        System.out.println(msg);
        System.out.println(uploadtime);
        System.out.println(viewer);
    }

}
