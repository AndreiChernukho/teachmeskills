package com.tms.lesson9;

import java.util.ArrayList;
import java.util.List;

public class Family {

    private String name;
    List<Child> children = new ArrayList<>();

    public Family(String name, List<Child> children) {
        this.name = name;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", children=" + children +
                '}';
    }
}
