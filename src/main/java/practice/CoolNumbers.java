package practice;

import java.text.DecimalFormat;
import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {

        ArrayList<String> gosNumber = new ArrayList<>();

        DecimalFormat dF = new DecimalFormat("00");



        String[] symbol = new String[]{"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};

        for (String firstLetter : symbol) {

            for (int number = 1; number <= 9; number++) {

                for (String secondaryLetter : symbol) {

                    for (String thirdletter : symbol) {

                        for (int region = 1; region <= 197; region++) {
                            String coolNumber;
                            coolNumber = firstLetter + number + number + number + secondaryLetter + thirdletter + dF.format(region);

                            gosNumber.add(coolNumber);

                        }

                    }

                }

            }

        }


        return gosNumber;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {


        for (String correctNumber : list) {

            if (correctNumber.equals(number)){

                return true;

            }
        }
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {

        int index = Collections.binarySearch(sortedList,number);

        if(index >= 0){

            return  true;
        }

        return false;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {

        if(hashSet.contains(number)){
            return true;
        }


        return false;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {

        if(treeSet.contains(number)){
            return true;
        }

        return false;
    }

}
