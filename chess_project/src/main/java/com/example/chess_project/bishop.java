package com.example.chess_project;

public class bishop extends Pieces {
    Type type;

    public bishop(int x, int y) {
        super(x, y);
        this.type=Type.bishop;
    }

    @Override
    public Type getType() {
        return this.type;
    }
}
