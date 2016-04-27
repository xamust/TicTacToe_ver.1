package com.mytest.NewCross;

/**
 * Created by xamus_000 on 05.10.2015.
 */
public class ErrorsCall
{
    public void ErrorsCall()
    {
        System.out.println("Wrong select. Error. Exit.");
        System.exit(0);
    }

    public void repeatError(int counters, String player, String anotherPlayer)
    {
       if(counters>0) System.out.println("This coordinates is already use. Select other. Attempts remaining " + counters + ".");
        else if (counters == 0)
       {
           System.out.println("Player " + player.toUpperCase() + " is lose. Player " + anotherPlayer.toUpperCase() + " is win.");
           System.exit(0);
       }
    }

    public void Exit()
    {
        System.out.println("Exit.");
        System.exit(0);
    }
}
