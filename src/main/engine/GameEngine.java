package main.engine;

import main.entity.Entity;
import main.entity.Table;

public class GameEngine {
    public void startGame(Entity entity1, Entity entity2) {
        Table table = new Table();
        while(true){
            System.out.println(entity1.getName() + " is playing");
            entity1.step(table);
            table.showTable();
            if(table.checkWins(table, entity1)){
                System.out.println(entity1.getName() + " WIN!!");
                break;
            }
            if(table.tableFull()){
                break;
            }
            System.out.println(entity2.getName() + " is playing");
            entity2.step(table);
            table.showTable();
            if(table.checkWins(table, entity2)){
                System.out.println(entity2.getName() + " WIN!!!");
                break;
            }
            if(table.tableFull()){
                break;
            }
        }
    }
}
