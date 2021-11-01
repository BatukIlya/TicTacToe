package main.entity;

public interface Entity {
    char getValue();
    void step(Table table);
    String getName();
}
