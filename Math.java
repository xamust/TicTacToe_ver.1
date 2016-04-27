package com.mytest.NewCross;

/**
 * Created by xamus_000 on 11.10.2015.
 */
public class Math
{
    Poligon poligon;
    boolean status = false;
    int[][] drawMatrix = {{0,0,0},{0,0,0},{0,0,0}};
    int sumMatrix = 0;
    int[] memoryR = {0,0};

    public Math(Poligon poligon)
    {
        this.poligon = poligon;
    }

    public boolean mathCross()
    {
        int countY = 0, countX =0, count_draw = 0;

        int counterX1 =  poligon.getmatrixINT()[0][0] + poligon.getmatrixINT()[1][1] + poligon.getmatrixINT()[2][2];
        int counterX2 =  poligon.getmatrixINT()[0][2] + poligon.getmatrixINT()[1][1] + poligon.getmatrixINT()[2][0];

        if(counterX1 == 9 || counterX1 == 15 || counterX1 == 8)
        {
            drawMatrix[0][0] = 1;
            drawMatrix[1][1] = 1;
            drawMatrix[2][2] = 1;
        }
        else if(counterX2 == 9 || counterX2 == 15 || counterX2 == 8)
        {
            drawMatrix[0][2] = 1;
            drawMatrix[1][1] = 1;
            drawMatrix[2][0] = 1;
        }

        for (int i = 0; i<=2;i++)
        {
            countY = 0;
            countX = 0;

            if (status)break;
            for (int j = 0; j <= 2; j++)
            {
                countY = countY + poligon.getmatrixINT()[i][j];
                countX = countX + poligon.getmatrixINT()[j][i];
                if (status)break;
                if(countY == 3 || countX == 3 || counterX1 == 3 || counterX2 == 3)
                {
                    if(Thread.currentThread().getStackTrace()[2].getClassName().endsWith("NewGameWithComputer"))System.out.println("Human player is win!");
                    else System.out.println("Player X is win!");
                    status = true;
                    break;
                }

                else if(countY == 21 || countX == 21 || counterX1 == 21 || counterX2 == 21)
                {
                    if(Thread.currentThread().getStackTrace()[2].getClassName().endsWith("NewGameWithComputer"))System.out.println("PC player is win!");
                    else System.out.println("Player O is win!");
                    status = true;
                    break;
                }

                else if(countY == 9 || countY == 15 || countY == 8)
                {
                    drawMatrix[i][0] = 1;
                    drawMatrix[i][1] = 1;
                    drawMatrix[i][2] = 1;
                }
                else if(countX == 9 || countX == 15 || countX == 8)
                {
                    drawMatrix[0][i] = 1;
                    drawMatrix[1][i] = 1;
                    drawMatrix[2][i] = 1;
                }
            }
        }

        for(int i = 0; i <= 2; i++)
        {
            for(int j = 0; j <= 2; j++)
            {
                sumMatrix = sumMatrix + drawMatrix[i][j];
            }
        }
        if(sumMatrix == 9)
        {
            System.out.println("Draw!");
            status = true;
        }
        return status;
    }


    public int[] getMemoryR()
    {
        return memoryR;
    }
}
