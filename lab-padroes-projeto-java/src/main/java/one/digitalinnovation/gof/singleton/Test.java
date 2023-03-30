package singleton;

import one.digitalinnovation.gof.singleton.SingletonEager;



public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy =  SingletonLazy.getInstancia();
        System.out.println(lazy);
        
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager =  SingletonEager.getInstancia();
        System.out.println(eager);
        
        SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);
        lazyholder =  SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);
    }
}
