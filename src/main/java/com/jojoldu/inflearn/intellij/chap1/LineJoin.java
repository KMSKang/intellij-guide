package com.jojoldu.inflearn.intellij.chap1;

public class LineJoin {


    public String joinString() {
        System.out.println("dd");
        String profile = "안녕하세요.IntelliJ 강의에 오신것을환영합니다.";
        return profile;
    }

    public String createQuery() {

        String query = "SELECT * " +
                "FROM member " +
                "WHERE member.name = 'jojoldu'";

        return query;
    }

}
