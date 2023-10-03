package org.example.n1exercici1;
import java.util.ArrayList;


public class Year {
    private ArrayList<String> monthList;
    public Year() {
        monthList = new ArrayList<>();
        monthList.add("January");
        monthList.add("February");
        monthList.add("March");
        monthList.add("April");
        monthList.add("May");
        monthList.add("June");
        monthList.add("July");
        monthList.add("August");
        monthList.add("September");
        monthList.add("October");
        monthList.add("November");
        monthList.add("December");
    }

    public ArrayList<String> getMonthList() {
        return monthList;
    }
}
