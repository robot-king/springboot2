package com.lx.auth;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {

    public static void main(String[] args) {

//        System.out.println(new BCryptPasswordEncoder().encode("secrect"));


        String password = "123456";
//        String passwordSaltt = "$2a$10$6rBVLy/aEVLvPDKTgrcuqOTo8mFKnnixqNbTJ6E7qKPWlB4I4Q7E6";
        String passwordSaltt = "$2a$10$wkWUD6MmrX17f37atLUOM.64Xfeo9vLNNb29Gp802sLws3Ljyp1UK";

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        boolean result = bCryptPasswordEncoder.matches(password,passwordSaltt);
        System.out.println(result);

        System.out.println(new BCryptPasswordEncoder().encode(password));


    }
}
