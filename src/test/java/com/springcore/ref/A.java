package com.springcore.ref;

public class A {
    private int x;
    private B ob;

    public A() {
        super();
    }

    @Override
    public String toString() {
        return "A [x=" + x + ", getX()=" + getX() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B getOb() {
        return ob;
    }

    public void setOb(B ob) {
        this.ob = ob;
    }
}
