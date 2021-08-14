package com.kava.designpattern.builder;

import lombok.AllArgsConstructor;
import lombok.Data;

public class BuilderDemo {

    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilder());
        Product product = director.build("1", "2", "3");
    }

    @Data
    public static class Product{

        private String field1;
        private String field2;
        private String field3;

    }

    public interface Builder{
        void field1(String val);
        void field2(String val);
        void field3(String val);
        Product create();
    }

    public static class ConcreteBuilder implements Builder{

        private Product product = new Product();

        @Override
        public void field1(String val) {
            System.out.println("field1校验");
            product.setField1(val);
        }

        @Override
        public void field2(String val) {
            System.out.println("field2转换");
            product.setField1(val);
        }

        @Override
        public void field3(String val) {
            System.out.println("field3数据关联");
            product.setField1(val);
        }

        @Override
        public Product create() {
            return product;
        }
    }

    @AllArgsConstructor
    public static class Director{

        private Builder builder;

        public Product build(String field1,String field2,String field3){
            builder.field1(field1);
            builder.field2(field2);
            builder.field3(field3);
            return builder.create();
        }

    }
}
