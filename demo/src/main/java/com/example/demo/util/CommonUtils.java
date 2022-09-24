package com.example.demo.util;

import javax.persistence.PrePersist;
import java.util.UUID;

public class CommonUtils {

    public static String generateUUID(){
         return UUID.randomUUID().toString();
    }
}
