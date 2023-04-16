package prepare_1;

import java.util.Objects;

public class laptop {
    String brand;
    int ram;
    double price;
    public laptop(String brand,int ram,double price)
    {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }
    @Override
    public String toString()
    {
        return brand+" "+ram+" "+price;
    }
    @Override
    public boolean equals(Object o) {
        laptop l = (laptop) o;
        if (this.brand == l.brand && this.ram == l.ram && this.price == l.price)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
        public int hashcode()                                                                                 
        {
            int h = Objects.hash(brand,ram,price);
            return h;
        }
    }

