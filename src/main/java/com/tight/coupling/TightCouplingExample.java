package com.tight.coupling;

public class TightCouplingExample {

    public static void main(String[] args) {

        UserManager userInfo = new UserManager();

        System.out.println(userInfo.getUserInfo());
    }
}
