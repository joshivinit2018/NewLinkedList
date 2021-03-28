package com.bridgelabz;

public interface INode<K> {
    K getKey();

    void setKey(K key);

    INode getNext();
    INode<K> getNext();


    void setNext(INode next);
    void setNext(INode<K> next);
}