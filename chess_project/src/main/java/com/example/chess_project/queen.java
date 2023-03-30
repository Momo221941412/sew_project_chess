package com.example.chess_project;

public class queen extends Pieces{
    Type type;

    public queen(int x, int y) {
        super(x, y);
        this.type=Type.queen;
    }

    @Override
    public Type getType() {
        return this.type;
    }
}
