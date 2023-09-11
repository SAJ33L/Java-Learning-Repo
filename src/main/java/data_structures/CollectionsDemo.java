package data_structures;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

//        setDemo();
        listDemo();
//        queueDemo();
//        mapDemo();

    }

    public static void setDemo() {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");

        System.out.println(fruits);
        fruits.remove("lemon");
        System.out.println("contains lemon? " + fruits.contains("lemon"));
        System.out.println("size " + fruits.size());

        var i = fruits.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        Set moreFruit = Set.of("pear", "raisin", "cherry");
        System.out.println(moreFruit);
    }

    public static void listDemo() {
//      List fruits = new ArrayList();
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        fruits.set(2, "grape");
        fruits.add("lemon");
        fruits.remove("lemon");
        fruits.remove(3);

        for (String fruit : fruits){
            System.out.println(fruit);
        }

        fruits.forEach(fruit -> {
            fruit = "fruit: " + fruit;
            System.out.println(fruit);
        });

        System.out.println("index 2: " + fruits.get(2));
        System.out.println("index of grape: " + fruits.indexOf("grape"));
        System.out.println("last index of lemon:" + fruits.lastIndexOf("lemon"));

        System.out.println(fruits);

        List moreFruits = List.of("cherry", "plum");

    }

    public static void queueDemo() {

        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        var removed = fruits.remove();
        System.out.println("removed: " + removed);

        System.out.println("head of queue: " + fruits.peek());

        System.out.println(fruits);
    }

    public static void mapDemo() {

//        Map fruitCalories = new HashMap();
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 100);
        fruitCalories.put("orange", 45);
        fruitCalories.putIfAbsent("lemon", 17);
        fruitCalories.remove("lemon");

        Set mapEntries = fruitCalories.entrySet();
        var i = mapEntries.iterator();

        while (i.hasNext()){
            Map.Entry entry = (Map.Entry)i.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        for (Map.Entry calorieInfo : fruitCalories.entrySet()){
            System.out.println(calorieInfo.getKey() + " : " + calorieInfo.getValue());
        }

        fruitCalories.forEach( (key, value) -> System.out.println(key + " : " + value));

        System.out.println(fruitCalories);
        System.out.println("banana calorie: " + fruitCalories.get("banana"));
        System.out.println("contain orange? " + fruitCalories.containsKey("orange"));

        Map immutableFruitCalories = Map.of(
                "apple", 95,
                "lemon", 20
        );
    }

}
