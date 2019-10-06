package com.cds.leetcode.backup;

/**
 * Created by cds on 7/10/16.
 */
public class MyObject
{
    public int x;
    public MyObject(int x){this.x = x;}
    public boolean equals(Object o)
    {
        if(this == o) {

            System.out.println("a");
            return true;
        }
        if(!(o instanceof MyObject))return false;
        return ((MyObject)o).x == x;
    }


    public static void main(String[] args) {
        MyObject o1 = new MyObject(1);
        MyObject o3 = o1;
        System.out.println(o3.equals(o1));
        MyObject o2 = new MySubObject(1, "MySubObject's instance");
        System.out.println(o1.equals(o2));
        System.out.println(o2.equals(o1));
    }
}
class MySubObject extends MyObject
{
    public int x;
    public String text;
    public MySubObject(int x, String text)
    {
        super(x);
        this.x = x;
        this.text = text;
    }
    public boolean equals(Object o)
    {
        if(this == o)return true;
        if(!(o instanceof MySubObject))return false;
        MySubObject obj = (MySubObject)o;
        return (x == obj.x && text.equals(obj.text));
    }
}

