package com.jspyder.java;
import java.util.Objects;
public class contact {
    String name;
    long cno;
    public contact (String name,long cno)
    {
        this.name = name;
        this.cno = cno;
    }
    @Override
    public String toString()
    {
        return name +" "+cno;
    }
    @Override
    public boolean equals(Object o) {
        contact c = (contact) o;
        if(this.name == name && this.cno == cno)
        {
            return true;
        }
            else
        {
            return false;
        }
    }
}
