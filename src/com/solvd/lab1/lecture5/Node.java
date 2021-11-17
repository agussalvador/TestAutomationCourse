package com.solvd.lab1.lecture5;

public class Node<T> {
    T data; //Data in the current node
    Node next; //Reference for the next node

    Node(T data){
        this.data = data;
    }
}
