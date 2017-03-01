package com.cglib.test;


import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2016/7/21.
 */
public class CglibTest {
    public  static void  main(String args[]){
        BookFacadeProxy proxy=new BookFacadeProxy();
        BookImpl bookImple =(BookImpl) proxy.getProxy(new BookImpl());
        bookImple.addBook();
        bookImple.deleteBook();
    }

}
