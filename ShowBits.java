package com.company;

import java.io.PrintStream;

public class ShowBits {

    private int numbits; // кількість бітів для виявлення

    public ShowBits(int numbits) {
        this.numbits = numbits;
    }

    public String getBinariForm(long val) {
        long mask = 1;
        String form = "";
        mask <<= numbits - 1;

        int spacer = 0;
        for(; mask != 0; mask >>>= 1) {

            if ((val & mask) != 0) {
                form += "1"; // біт включений
            }
            else
            {
                form += "0"; // біт виключений
            }

            // розділення бітів на групи по 8
            spacer++;
            if ((spacer % 8) == 0) {
                form += "";
                spacer = 0;
            }
        } // for

        return form;
    } // getBinaryForm(long) method

    public void show(long val, PrintStream out) {
        String binaryForm = getBinariForm(val);
        out.println(binaryForm);
    } // show()
} // ShowBits class
