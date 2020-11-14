//package com.interview.base.初始化;
//
//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.stereotype.Component;
//
//@Component
//public class GiraffeService implements InitializingBean, DisposableBean {
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("执行InitializingBean接口的afterPropertiesSet方法");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("执行DisposableBean接口的destroy方法");
//    }
//
//    public static void main(String[] args) {
//        System.out.println(new GiraffeService());
//    }
//}
