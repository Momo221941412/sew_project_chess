package com.example.chess_project;

public abstract class Pieces {
    public int x, y;

    public Pieces(int x,int y){
        this.x=x;
        this.y=y;
    }
    public abstract Type getType();
}
