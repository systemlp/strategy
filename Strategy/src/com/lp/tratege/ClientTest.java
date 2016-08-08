package com.lp.tratege;

public class ClientTest {

    public static void main(String[] args) {
        Vehicle car=new Car();
        car.introduce();
        car.running();
        Vehicle carModal=new CarModal();
        carModal.introduce();
        carModal.running();
    }

}
