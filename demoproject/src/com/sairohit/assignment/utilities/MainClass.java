package com.sairohit.assignment.utilities;

import com.sairohit.assignment.employee.*;

public class MainClass {
    public static void main(String[] args) {
        manager m1 = new manager("Alice", 101, 80000, "IT");
        developer d1 = new developer("Bob", 102, 60000, "Java");

        m1.displayInfo();
        System.out.println();
        d1.displayInfo();
    }
}
