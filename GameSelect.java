package com.mytest.NewCross;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by xamus_000 on 11.10.2015.
 */
public class GameSelect
{
    public GameSelect() throws IOException, InterruptedException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("New game? (y - yes, another key - no)");
        if(reader.readLine().toLowerCase().equals("y"))new NewGame();
        else new ErrorsCall().Exit();
    }
}
