package com.arrya;

public class product {
    String name ;
    int id;
    int price;
    public product(String name ,int id,int price)
    {
        this.name =  name;
        this.id = id;
        this.price = price;
    }
    public String toString()
    {
        return name;
    }
}
