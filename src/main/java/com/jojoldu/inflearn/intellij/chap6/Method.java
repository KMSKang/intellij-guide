package com.jojoldu.inflearn.intellij.chap6;


import java.util.List;

public class Method {

    public void extractMethod(List<Book> books) {

        for (Book book : books) {

            loopAuthors(book);

        }

    }

    private void loopAuthors(Book book) {
        for(String s : book.getAuthors()) {

            print(s);

        }
    }

    private void print(String s) {
        if("jojoldu".equals(s)) {
            System.out.println("담당자가 맞습니다.");
        }
    }


    public static class Book {

        private String title;

        private Long price;

        private List<String> authors;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Long getPrice() {
            return price;
        }

        public void setPrice(Long price) {
            this.price = price;
        }

        public List<String> getAuthors() {
            return authors;
        }

        public void setAuthors(List<String> authors) {
            this.authors = authors;
        }
    }


}
