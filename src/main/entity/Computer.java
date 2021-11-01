package main.entity;

import java.util.Random;

public class Computer implements Entity{
    private final char VALUE;
    private final String name = "Computer";

    public Computer(char value){
        this.VALUE = value;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public char getValue() {
        return VALUE;
    }
    @Override
    public void step(Table table){
        Random random = new Random();
        int x;
        int x1;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        do{
            x = random.nextInt(3);
            x1 = random.nextInt(3);
        }while(!table.isCellOfTableValid(x, x1));
        table.setValueTable(x, x1, this.VALUE);

    }




}
