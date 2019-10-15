//package com.jojoldu.inflearn.intellij.chap7;
//
//import lombok.Getter;
//import org.junit.Test;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class ProductServiceTest {
//
//
//
//
//
//    @Test
//    public void 기본디버깅() {
//
//        // given & when
//        Long id = productService.register(1000L, "책");
//
//        // then
//        assertThat(id, is(1L));
//
//    }
//
//    @Test
//    public void Evaluate사용하기() {
//
//        // given
//        productRepository.save(new Product(1000L, "책"));
//        productRepository.save(new Product(2000L, "운동화"));
//        productRepository.save(new Product(3000L, "냉장고"));
//
//        // when
//        Product product = productService.findByName("운동화");
//
//        // then
//        assertThat(product.getAmout(), is(2000L));
//
//    }
//
//    @Test
//    public void 조건으로_Break() {
//
//        List<Book> books = Arrays.asList(
//                new Book("토비의 스프링"),
//                new Book("자바 ORM 표준 JPA 프로그래밍"),
//                new Book("클라우드 네이티브 자바")
//
//        );
//
//        for(Book book : books) {
//            System.out.println(book.title);
//        }
//
//    }
//
//    @Getter
//    public static class Book {
//
//        private String title;
//
//        public Book (String title) {
//            this.title = title;
//        }
//
//    }
//
//}
