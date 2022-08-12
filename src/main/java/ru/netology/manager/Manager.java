package ru.netology.manager;

public class Manager {
    private String[] posterName = new String[0];

    private int limit;

    public Manager() {
        limit = 10;
    }

    public Manager(int limit) {
        this.limit = limit;
    }

    public void add(String poster) {
        String[] tmp = new String[posterName.length + 1];
        for (int i = 0; i < posterName.length; i++) {
            tmp[i] = posterName[i];
        }
        tmp[tmp.length - 1] = poster;
        posterName = tmp;
    }

    public String[] findAll() {
        return posterName;
    }

    public String[] findLast() {
        int arraySize = limit < posterName.length ? limit : posterName.length;
        String[] reversed = new String[arraySize];
        for (int i = 0; i < arraySize; i++) {
            reversed[i] = posterName[posterName.length - 1 - i];
        }
        return reversed;
    }

}

