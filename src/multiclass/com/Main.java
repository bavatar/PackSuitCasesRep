package multiclass.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {
    static Random rnd = new Random();
    static private HashMap<String, String> shoeMap;
    static private HashMap<String, String> pantsMap;

    public static void main(String[] args) {
        ArrayListE sportSuitcase = new ArrayListE();
        sportSuitcase.tag = "Sporty";
        ArrayListE vacationSuitcase = new ArrayListE();
        vacationSuitcase.tag = "Vacation";

        // Add Test Data
        addData();

        // Pack Suit cases and display the results of each suitcase
        packSuitCase(sportSuitcase);
        printSuitCase(sportSuitcase);
        packSuitCase(vacationSuitcase);
        printSuitCase(vacationSuitcase);
    }

    private static void printSuitCase(ArrayListE arryS){
        System.out.println("Your " + arryS.tag + " suitcase contains: ");
        String outStr = "";
        for (String s: arryS.arrList){
            outStr += s + ", ";
        }
        System.out.println(outStr);
        System.out.println("");
    }

    private static void packSuitCase(ArrayListE arryL){
        String typeSuitCase = arryL.tag.toLowerCase();
        switch (typeSuitCase){
            case ("sporty"):
                System.out.println("You are packing a sporty suitcase");
                break;
            case ("vacation"):
                System.out.println("You are packing a vacation suitcase");
                break;
            default:
                System.out.println("Cannot Determine which kind of suitcase you wish to pack");
        }

        String value = "";
        // add 1 pair of shoes of appropriate type
        for (String key : shoeMap.keySet()) {
            value = shoeMap.get(key);
            if (value.toLowerCase().contains(typeSuitCase)){
                arryL.arrList.add(key);
                break;
            }
        }

        // add 1 pair of pants of appropriate type
        for (String key : pantsMap.keySet()) {
            value = pantsMap.get(key);
            if (value.toLowerCase().contains(typeSuitCase)){
                arryL.arrList.add(key);
                break;
            }
        }
    }

    private static void addData(){
        // Shoe HashMap
        shoeMap = new HashMap<String, String>();
        shoeMap.put("Open Toe Sandals", "Vacation");
        shoeMap.put("Loafers", "Vacation");
        shoeMap.put("Tennis Shoes", "Sporty");
        shoeMap.put("Cross Country Track Shoes", "Vacation, Sporty");
        shoeMap.put("Spiked Running Shoes", "Sporty");

        // Pants HashMap
        pantsMap = new HashMap<String, String>();
        pantsMap.put("Gym Pants", "Sporty");
        pantsMap.put("Shorts", "Vacation");
        pantsMap.put("Sweat Pants", "Sporty, Vacation");
        pantsMap.put("Blue Jeans", "Vacation");
        pantsMap.put("Swim Suit", "Sporty, Vacation");
        pantsMap.put("Formal Long Pants", "Vacation");
    }
}
