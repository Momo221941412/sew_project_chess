package com.example.chess_project;

public class knight extends Pieces{
    Type type;

    public knight(int x, int y) {
        super(x, y);
        this.type=Type.knight;
    }

    @Override
    public Type getType() {
        return this.type;
    }
}
