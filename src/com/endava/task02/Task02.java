package com.endava.task02;

import java.util.*;

public class Task02 {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Dog("Dog1"));
        animals.add(new Dog("Dog2"));
        animals.add(new Cat("Cat1"));
        animals.add(new Cat("Cat2"));
        animals.add(new Bird("Bird1"));
        animals.add(new Bird("Bird2"));

        System.out.println("\n--- Initial List ---");
        System.out.println(animals);

        System.out.println("\n-- filter only dogs ---");
        System.out.println(filterDogs(animals));

        System.out.println("\n-- filter dogs and cats---");
        System.out.println(filterDogsAndCats(animals));

        Set<Animal> animalSet = new LinkedHashSet<>(animals);
        System.out.println("\n--- set from list ---");
        System.out.println(animalSet);

        List<Animal> animalList = new ArrayList<>(animalSet);
        System.out.println("\n--- list from set ---");
        System.out.println(animalList);

        System.out.println("\n--- is initial list equal to list from set? ---");
        System.out.println(animals.equals(animalList));

        Map<String, Collection> animalMap = new LinkedHashMap<>();
        populateMap(animalList, animalMap);

        System.out.println("\n--- initial Map ---");
        System.out.println(animalMap);

        System.out.println("\n--- select by criteria Cat ---");
        Map<String, Collection> filteredMap;
        filteredMap = filterMap(animalMap, "Cat");
        for (String key : filteredMap.keySet()) {
            System.out.println(key + "=" + filteredMap.get(key));
        }
    }

    public static List filterDogs(List animals) {
        List result = new ArrayList();
        for (Object animal : animals) {
            if (animal instanceof Dog) {
                result.add(animal);
            }
        }
        return result;
    }

    public static List filterDogsAndCats(List animals) {
        List result = new ArrayList();
        for (Object animal : animals) {
            if (animal instanceof Dog || animal instanceof Cat) {
                result.add(animal);
            }
        }
        return result;
    }

    public static void populateMap(final List animals, Map animalMap) {
        for (int i = 0; i < animals.size(); i++) {
            for (int j = i; j < animals.size(); j++) {
                if (i != j) {
                    String key = animals.get(i).getClass().getSimpleName() + "+" + animals.get(j).getClass().getSimpleName();
                    List value;
                    if (animalMap.containsKey(key)) {
                        value = (List) animalMap.get(key);
                        value.add(Arrays.asList(animals.get(i), animals.get(j)));
                    } else {
                        value = new ArrayList<>(Arrays.asList(animals.get(i), animals.get(j)));
                    }
                    animalMap.put(key, value);
                }
            }
        }
    }

    public static Map filterMap(Map<String, Collection> initialMap, String searchCriteria) {
        Map<String, Collection> resultMap = new HashMap<>();
        for (String key : initialMap.keySet()) {
            if (key.contains(searchCriteria)) {
                resultMap.put(key, initialMap.get(key));
            }
        }
        return resultMap;
    }
}
