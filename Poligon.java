package com.mytest.NewCross;

/**
 * Created by xamus_000 on 07.10.2015.
 */
public class Poligon
{
    private String[][] matrix = {{" "," "," "},{" "," "," "},{" "," "," "}};
    private String key = "";
    private String anotherKey = key.toLowerCase().equals("x") ? "o" : "x";

    public boolean setKey(int x, int y, String key)
    {
        this.key = key;
            if(matrix[y][x].equals(" "))
            {
                matrix[y][x] = key;
                return true;
            }
            else
            {
                return false;
            }
    }

    public void printPoligon()
    {
        System.out.println('\n' +
                "     1:  2:  3:    "+ '\n' +
                "1: | "+matrix[0][0]+" | "+matrix[0][1]+" | "+matrix[0][2]+" |" + '\n' +
                "   -------------" + '\n' +
                "2: | "+matrix[1][0]+" | "+matrix[1][1]+" | "+matrix[1][2]+" |" + '\n' +
                "   -------------" + '\n' +
                "3: | "+matrix[2][0]+" | "+matrix[2][1]+" | "+matrix[2][2]+" |" + '\n');
    }

    public int[][] getmatrixINT()
    {
        int[][] matrixInt = {{0,0,0},{0,0,0},{0,0,0}};

        for(int i = 0; i <=2; i++)
        {
            for(int j = 0; j <=2; j++)
            {
               if(matrix[i][j].toLowerCase().equals("x")) matrixInt[i][j] = 1;
               else if (matrix[i][j].toLowerCase().equals("o")) matrixInt[i][j] = 7;
               else matrixInt[i][j] = 0;
            }
        }
        return matrixInt;
    }

    public String[][] getMatrixST()
    {
        return matrix;
    }

}
