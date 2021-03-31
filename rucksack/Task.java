package rucksack;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        InnerThing notebook = new InnerThing(8, 100, "notebook");
        InnerThing jewellery = new InnerThing(1, 80, "jewellery");
        InnerThing stone = new InnerThing(13, 0, "stone");
        InnerThing book = new InnerThing(3, 10, "book");
        InnerThing cd = new InnerThing(1, 23, "cd");
        InnerThing[] items = new InnerThing[]{notebook, jewellery, stone, book, cd};
        Rucksack rucksack = new Rucksack(10, items);
        System.out.println(rucksack.recFindBestSum(items.length - 1, rucksack.getCapacity()));
    }
}

//        ArrayList<InnerThing> things = selectItems(array, rucksack);
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < things.size(); i++) {
//            sb.append(things.get(i).getName() + " ");
//        }
//        System.out.println(sb.toString());


    //max item

//    private static double avg(InnerThing[] array, Rucksack rucksack) {
//        double average = 0;
//        for (int i = 0; i < array.length; i++) {
//            average += (array[i].getPrice() + array[i].getWeight());
//            average = average / array.length;
//        }
//        return average;
//    }
//
//
//    private static ArrayList<InnerThing> selectItems(InnerThing [] array, Rucksack rucksack){
//        double avg = avg(array, rucksack);
//        ArrayList<InnerThing> things = new ArrayList<>();
//        for (int i = 0; i < array.length; i++) {
//            if( (double) (array[i].getWeight()+array[i].getPrice())/2  >= avg && rucksack.getCapacity() >= array[i].getWeight()){
//                things.add(array[i]);
//                rucksack.setCapacity(rucksack.getCapacity()-array[i].getWeight());
//            }
//        }
//        return things;
//    }
//}
    //рюказк -10
    //ноут 8 - 10
    //камень 3 - 1
    //ювелирка 1 -8
    //книга 3 - 2
    //avg(capacity - w + cost);



