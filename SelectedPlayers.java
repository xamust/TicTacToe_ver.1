package com.mytest.NewCross;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by xamus_000 on 11.10.2015.
 */
public class SelectedPlayers
{
    private String[] players = {"",""};

    public SelectedPlayers() throws IOException, InterruptedException
    {

    if(Thread.currentThread().getStackTrace()[2].getClassName().endsWith("NewGameWithHuman"))
    {
        System.out.println("Selected new game with human..." + '\n');
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please select key for 1st player..." + '\n' +
                " \"x\" - player X" + '\n' +
                " \"o\" - player O" + '\n' +
                "any key - exit.\"");
        while (true)
        {
            String var1 = reader1.readLine().toLowerCase();
            if (var1.equals("x"))
            {
                players[0] = var1;
                players[1] = "o";
                break;
            } else if (var1.equals("o"))
            {
                players[0] = var1;
                players[1] = "x";
                break;
            } else
            {
                new ErrorsCall().ErrorsCall();
            }
        }

        System.out.println("1st player - " + players[0].toUpperCase() + " : 2th player - " + players[1].toUpperCase());
        Thread.sleep(1000);
        System.out.println("New game!!!");
    }
        else if(Thread.currentThread().getStackTrace()[2].getClassName().endsWith("NewGameWithComputer"))
    {
        System.out.println("Selected new game with PC..." + '\n');
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please select move for human player..." + '\n' +
                " \"first\" - human player X (move first)" + '\n' +
                " \"second\" - human player X (move second)" + '\n' +
                "any key - exit.\"");
        while (true)
        {
            String var1 = reader2.readLine().toLowerCase();
            if (var1.equals("first"))
            {
                players[0] = "x";
                players[1] = "o";
                break;
            } else if (var1.equals("second"))
            {
                players[0] = "o";
                players[1] = "x";
                break;
            } else
            {
                new ErrorsCall().ErrorsCall();
            }
        }
    }
    }

    public String[] getPlayers()
    {
        return players;
    }
}
