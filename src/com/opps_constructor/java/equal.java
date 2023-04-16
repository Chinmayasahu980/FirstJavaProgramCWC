package com.opps_constructor.java;

public class equal {
    String name;
    int id;

    public equal(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name + " " + id;
    }

    @Override
    public boolean equals(Object o) {
        equal q = (equal) o;
        if (this.name == q.name && this.id == q.id) {
            return true;
        } else {
            return false;
        }
    }
}

