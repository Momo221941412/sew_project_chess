package com.example.chess_project;

public class king extends Pieces{
    Type type;

    public king(int x, int y) {
        super(x, y);
        this.type=Type.king;
    }

    @Override
    public Type getType() {
        return this.type;
    }
}
