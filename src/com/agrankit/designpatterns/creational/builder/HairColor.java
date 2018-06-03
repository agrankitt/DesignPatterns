package com.agrankit.designpatterns.creational.builder;

public enum HairColor {

    WHITE, BLOND, RED, BROWN, BLACK;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}