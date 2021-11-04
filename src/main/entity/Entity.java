package main.entity;

import main.service.TableService;

public interface Entity {
    char getValue();

    void step(TableService tableService, Table table);

    String getName();

    boolean isPlayer();

}
