package prepare_1;

import java.util.Objects;

public class facebook {
    String username;
    String password;
    public facebook(String username,String password)
    {
        this.username = username;
        this.password = password;
    }
    @Override
    public String toString()
    {
        return username+" "+ password;

    }
    @Override
    public boolean equals(Object o)
    {
        facebook f = (facebook)o;
        if(this.username == f.username && this.password ==f.password)
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
        int h = Objects.hash(username,password);
        return h;
    }
}

