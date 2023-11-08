package com.mfrdev.bangladate;

import com.mfrdev.bangladate.converter.BanglaDateUtils;
import com.mfrdev.bangladate.converter.BanglaMonth;
import com.mfrdev.bangladate.converter.Date;
import com.mfrdev.bangladate.converter.EnglishMonth;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test-Program");
        System.out.println("-----------------------------");
        Date<BanglaMonth> banglaDate = BanglaDateUtils.getBanglaDate(2022, 2, 4);
        System.out.println(banglaDate);
        BanglaMonth month = banglaDate.getMonth();
        System.out.println(month.getBanglaName());

        Date<EnglishMonth> englishDate = BanglaDateUtils.getEnglishDate(1428, 10, 21);
        System.out.println(englishDate);
    }
}