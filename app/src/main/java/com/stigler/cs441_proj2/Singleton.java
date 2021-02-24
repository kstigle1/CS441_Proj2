package com.stigler.cs441_proj2;

public class Singleton
{
    private static Singleton single = null;
    String name;
    String league;

    private Singleton()
    {
        //
    }

    public static Singleton getInstance()
    {
        if (Singleton.single == null)
        {
            Singleton.single = new Singleton();
        }
        return Singleton.single;
    }
}
