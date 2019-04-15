package com.nivemaham.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ErasureExample {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("String", "another");
//        boolean b = strings instanceof List<String>
        // this does not compile, since under the hood, the JVM does not understand generics
        // but can do this
        boolean b = strings instanceof List;
    }
}
