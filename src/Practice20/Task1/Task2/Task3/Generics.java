package Practice20.Task1.Task2.Task3;

import java.io.Serializable;

public class Generics <T extends Comparable,V extends Animal&Serializable,K> {
    private T t;
    private V v;
    private K k;

    public Generics(T t, V v,K k)
    {
        this.t=t;
        this.v=v;
        this.k=k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void showTypes(){
        System.out.println("t: "+t.getClass().getName());
        System.out.println("v: "+v.getClass().getName());
        System.out.println("k: "+k.getClass().getName());
    }
}
