package com.solvd.lab1.lecture5;

import com.solvd.lab1.lecture2And3.vehicles.Car;
import com.solvd.lab1.lecture2And3.vehicles.Motorbike;
import com.solvd.lab1.lecture2And3.vehicles.Vehicle;
import com.solvd.lab1.lecture4.consoleInputs.ConsoleInputs;
import com.solvd.lab1.lecture4.exceptions.InvalidCharacter;

import java.util.*;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CollectionsMain {
    public final static Logger LOGGER = Logger.getLogger(ConsoleInputs.class.getName());

    public static void main(String[] args) {

//        Collection<String> c = new ArrayList<>();
//        c.add("Argentina");
//        c.add("Belarus");
//        c.add("USA");
//        c.add("Germany");
//
//
//        System.out.println("Iterator");
//        Iterator i = c.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
//
//        System.out.println("For-each");
//        for(String element : c){
//            System.out.println(element);
//        }

//        Set<String> hs = new HashSet<>();
//        hs.add("Argentina");
//        hs.add("Belarus");
//        hs.add("USA");
//        hs.add("Germany");
//        hs.add("Germany");
//        System.out.println("For-each");
//        for(String element : hs)
//            System.out.println(element);



        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(5,"USA");
        map.put(2,"Argentina");
        map.put(4,"Belarus");

        map.put(2,"Belarus");



        for(Integer key: map.keySet()){
            System.out.println(key + ": " +map.get(key));
        }
        Vehicle v1 = null;
        Motorbike v2 = null;
        Car v3 = null;
        Vehicle v4 = null;
        try {
            v1 = new Car("AA123AA","Ford",180,"Diesel");
            v2 = new Motorbike("BB456BB","Honda",160,"Cross");
            v3 = new Car("CC789CC","Toyota",230,"Diesel");
            v4 = v1;
        } catch (InvalidCharacter e) {
            LOGGER.log(Level.INFO, e.getMessage());
        }


        //Set collection: Cannot contain duplicate elements
//        Set<Vehicle> vehicleSet = new HashSet<>();
//        vehicleSet.add(v1);
//        vehicleSet.add(v2);
//        vehicleSet.add(v3);
//        vehicleSet.add(v4);
//        for (Vehicle v: vehicleSet){
//            LOGGER.log(Level.INFO, v.toString());
//        }

        //List collection: an ordered collection, may contain duplicate elements.
//        List<Vehicle> vehicleList = new ArrayList<>();
//        vehicleList.add(v1);
//        vehicleList.add(v2);
//        vehicleList.add(v3);
//        vehicleList.add(v4);
//        for (Vehicle v: vehicleList){
//            LOGGER.log(Level.INFO, v.toString());
//        }

        //Queue collection: typically order elements in a FIFO (first-in-first-out)
//        Queue<Vehicle> vehicleQueue = new LinkedList<>();
//        vehicleQueue.offer(v1);
//        vehicleQueue.offer(v2);
//        vehicleQueue.offer(v3);
//        //vehicleQueue.offer(v4);
//        //First in first out, vehicle v1 will be removed.
//        vehicleQueue.poll();
//        //Peek return the first element of the queue
//        LOGGER.log(Level.INFO, vehicleQueue.peek().toString());
//        for (Vehicle v: vehicleQueue){
//            LOGGER.log(Level.INFO, v.toString());
//        }

        //Map collection: Map cannot contain duplicate keys, but it can contains duplicate values
//        Map<Integer, Vehicle> vehicleMap = new HashMap<>();
//        vehicleMap.put(1,v1);
//        vehicleMap.put(2,v1);
//        vehicleMap.put(3,v3);
//        for (Map.Entry<Integer, Vehicle> e : vehicleMap.entrySet()) {
//            LOGGER.log(Level.INFO, "Key: " + e.getKey() + ": Value:  " + e.getValue());
//        }


        //Generic linked list
        GenericLinkedList<Vehicle> vehicleGenericLinkedList = new GenericLinkedList<>();
        vehicleGenericLinkedList.insert(v1);
        vehicleGenericLinkedList.insert(v2);
        //Insert on a specific index.
        vehicleGenericLinkedList.insertAt(1,v3);
        vehicleGenericLinkedList.show();


    }
}
