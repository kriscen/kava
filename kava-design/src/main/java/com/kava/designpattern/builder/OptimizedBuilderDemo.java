package com.kava.designpattern.builder;

import lombok.Data;

public class OptimizedBuilderDemo {

    public static void main(String[] args) {
        Product product = new ConcreteBuilder().field1("1")
                .field2("2")
                .field3("3")
                .create();
        System.out.println(product);
    }

    @Data
    public static class Product{

        private String field1;
        private String field2;
        private String field3;

    }

    public interface Builder{
        Builder field1(String val);
        Builder field2(String val);
        Builder field3(String val);
        Product create();
    }

    public static class ConcreteBuilder implements Builder {

        private Product product = new Product();

        @Override
        public Builder field1(String val) {
            System.out.println("field1校验");
            product.setField1(val);
            return this;
        }

        @Override
        public Builder field2(String val) {
            System.out.println("field2转换");
            product.setField1(val);
            return this;
        }

        @Override
        public Builder field3(String val) {
            System.out.println("field3数据关联");
            product.setField1(val);
            return this;
        }

        @Override
        public Product create() {
            return product;
        }
    }
}
