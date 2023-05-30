package org.example;

public class GroupFactory {
    private static Group group;

    static {
        group = new Group();
    }

    public static Group getInstance() {
        return group;
    }
}
