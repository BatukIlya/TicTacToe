package TicTacToe.entity;

import TicTacToe.service.TableService;

public interface Entity {

    char getValue();

    void step(TableService tableService);

    String getNAME();

    boolean isPlayer();
}
