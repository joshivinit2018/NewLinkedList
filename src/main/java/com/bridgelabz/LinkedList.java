package com.bridgelabz;
public class LinkedList<K> implements INode<K>{
    public class LinkedList<K> implements INode<K> {

        private LinkedList<K> next;
        private K  key;

        private LinkedList<K> next;

        //Constructor Declaration
        public LinkedList(K key){
            @@ -23,7 +22,7 @@ public void setKey(K key){
            }

            @Override
            public LinkedList getNext() {
                public INode<K> getNext() {
                    return next;
                }

                @Override
                public void setNext(INode next) {
                    this.next = (LinkedList<K>) next;
                }
            }