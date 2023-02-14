package practice;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */



    public static void main(String[] args) {

        ArrayList myList = new ArrayList();
        CoolNumbers num = new CoolNumbers();

        for (String number:num.generateCoolNumbers()) {

           myList.add(number);

        }

        Collections.sort(myList);

        System.out.println(num.binarySearchInList(myList, "Х999ХТ09"));

    }
}
