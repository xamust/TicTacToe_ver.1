package com.mytest.NewCross;

/**
 * Created by xamus_000 on 11.10.2015.
 */
public class Robot
{
    Poligon poligon = null;


    public void aNalyze()
    {
        //логика неверна
        Math math = new Math(poligon);
        int count = 0;

    }

    public Robot(Poligon poligon)
    {
        this.poligon = poligon;
    }
}
