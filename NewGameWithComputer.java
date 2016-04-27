package com.mytest.NewCross;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by xamus_000 on 11.10.2015.
 */
public class NewGameWithComputer
{
    private String[] players = {null,null};
    boolean status = false;
    int count = 1;
    String player = null;

    public NewGameWithComputer() throws IOException, InterruptedException
    {
        players = new SelectedPlayers().getPlayers();
        Poligon poligon = new Poligon();
        poligon.printPoligon();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));





        while (!status)
        {
            if(count%2 != 0) player = players[0];
            else player = players[1];
            count++;

            if(player.equals("o"))
            {
                System.out.println("PC player input coordinates...");
                String anotherPlayer = "x";
                Thread.sleep(1000);

                new Robot(poligon).aNalyze();

                status = new Math(poligon).mathCross();
            }
            else if(player.equals("x"))
            {
                int counter = 3;
                while(true)
                {
                    String anotherPlayer = "o";
                    System.out.println("Human player input coordinates...(x,y)" + '\n');
                    Thread.sleep(1000);
                    String strInput[] = reader.readLine().split(",");
                    if(poligon.setKey(Integer.parseInt(strInput[0]) - 1, Integer.parseInt(strInput[1]) - 1, player)) break;
                    else
                    {
                        new ErrorsCall().repeatError(counter, player, anotherPlayer);
                        counter--;
                    }
                }
                poligon.printPoligon();
                status = new Math(poligon).mathCross();
            }
         //   status = true;
        }
        new GameSelect();
    }


}
