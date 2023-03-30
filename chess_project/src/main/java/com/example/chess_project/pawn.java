package com.example.chess_project;

public class pawn extends Pieces {
    Type type;
    public pawn(int x, int y) {
        super(x, y);
        type=Type.pawn;
    }

    @Override
    public Type getType() {
        return this.type;
    }
}
