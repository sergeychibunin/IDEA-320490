package org.example;

import org.example.bar.Bar;
import org.example.foo.Foo;

public class Main {
    public static void main(String[] args) {
        if (Foo.get() + Bar.get() == 3) {
            System.out.println("Hello world!");
        }
    }
}