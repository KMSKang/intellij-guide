package com.jojoldu.inflearn.intellij.chap6;

public class ReturnType {

    public void print() {

        Integer num = calculate();

        System.out.println();

    }

    private Integer calculate() {
        return 1;
    }

}
