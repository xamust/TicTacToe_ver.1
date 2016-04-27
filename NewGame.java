package com.mytest.NewCross;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by svk on 08.10.2015.
 */
public class NewGame
{
    public NewGame() throws InterruptedException, IOException
    {
        System.out.println("Select action:" + '\n' +
                " \"human\" - new game with human" + '\n' +
                " \"pc\" - new game with PC" + '\n' +
                " any key - exit."  + '\n');
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String result = reader.readLine().toLowerCase();
            if(result.equals("human"))
            {
                new NewGameWithHuman();
            }
            else if (result.equals("pc"))
            {
                new NewGameWithComputer();
            }
            else new ErrorsCall().ErrorsCall();
        }
    }
}
