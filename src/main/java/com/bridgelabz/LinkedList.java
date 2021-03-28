package com.bridgelabz;

public class LinkedList<K> {
    public K getNext() {
    }

    public class LinkedList<K> implements INode<K>{

        private LinkedList next;
        private LinkedList<K> next;
        private K  key;


        //Constructor Declaration
        public LinkedList(K key){
            this.key = null;
            this.key = key;
            this.next = null;
        }

        //to get key
        @Override
        public K getKey() {
            return key;
        }

        //set key
        @Override
        public void setKey(K key){
            this.key = key;
        }

        //to get Next
        @Override
        public LinkedList getNext() {
            return next;
        }

        //To set Next
        public void setNext(LinkedList next) {
            this.next = next;
            @Override
            public void setNext(INode next) {
                this.next = (LinkedList<K>) next;

            }
}
