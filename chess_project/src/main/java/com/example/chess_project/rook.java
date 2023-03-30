package com.example.chess_project;

public class rook extends Pieces {
    Type type;

    public rook(int x, int y) {
        super(x, y);
        this.type = Type.rook;
    }

    @Override
    public Type getType() {
        return this.type;
    }
}
