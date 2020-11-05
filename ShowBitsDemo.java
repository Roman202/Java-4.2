package com.company;

import java.io.PrintStream;

public class ShowBitsDemo {

    private static PrintStream out = System.out;

    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        out.print("128 в двойному виді ");
        b.show(128, out);

        out.print("87987 в двойному виді ");
        i.show(87987, out);

        out.print("237658768 в двойному виді ");
        li.show(237658768, out);

        out.print("Молодші 8 біт числа 87987 в двойному виді ");
        b.show(87987, out);
    } // main(String[]) method
} // ShowBitsDemo class
