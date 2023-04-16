package prepare_1;
import java.util.Objects;
public class contact {
    String name;
    int cno;

    public contact(String name, int cno) {
        this.name = name;
        this.cno = cno;
    }

    @Override
    public String toString() {
        return name + " " + cno;
    }

    @Override
    public boolean equals(Object o) {
        contact c = (contact) o;
        if (this.name == c.name && this.cno == c.cno) {
            return true;
        } else {
            return false;
        }
    }
    public int hashcode() {
        int h;
        h = Objects.hash(name, cno);
        return h;

    }
}
