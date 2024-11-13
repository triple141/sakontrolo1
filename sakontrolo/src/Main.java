import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //1
        //a (3)

        //2
        //c int[] array = new int[5][5]

        //3
        //d (4)

        //4
        //c (String)

        //5
        //a (A)

        //6
        //c (byte,short,int,long)

        //7
        //a (Hello)

        //8
        //a (break)

        //9
        //a

        //10
        //c (24)

        //11
        //c

        //12
        //c (git log)

        //13
        //a

        //14
        //a (0)

        //15
        //b

        //16

        Scanner sc = new Scanner(System.in);
//        int n,max = 0,min,maxi=0,mini=0;
//        n = sc.nextInt();
//        int[] array = new int[n];
//
//        for (int i=0; i<n; i++)
//        {
//            array[i] = sc.nextInt();
//        }
//        min = array[0];
//
//        for (int i=0; i<n; i++)
//        {
//            if(max < array[i])
//            {
//                max = array[i];
//            }
//            if(min > array[i])
//            {
//                min = array[i];
//            }
//        }
//
//        for (int i=0; i<n; i++)
//        {
//            if(max < array[i])
//            {
//                max = array[i];
//            }
//            if(min > array[i])
//            {
//                min = array[i];
//            }
//        }
//
//        for (int i=0; i<n; i++)
//        {
//            if(max == array[i])
//            {
//                maxi = i;
//            }
//            if(min == array[i])
//            {
//                mini = i;
//            }
//        }
//
//        System.out.println(mini + " მაღაზიაში ყველაზე იაფია და ღირს " + min + " ლარი. " + maxi + " მაღაზიაში ყველაზე ძვირია და ღირს " + max + " ლარი");

        //17

//        for (int i=0; i<100; i++)
//        {
//            if (i%5 == 0 && i%7!=0)
//            {
//                System.out.println("HEY");
//            }
//            else if (i%5 != 0 && i%7==0)
//            {
//                System.out.println("HOW");
//            }
//            else if (i%5 == 0 && i%7==0)
//            {
//                System.out.println("HEYHOW");
//            }
//            else
//            {
//                continue;
//            }
//        }

        //18

//        int x,y,min,max,minx=0,miny=0,maxx=0,maxy=0;
//        x = sc.nextInt();
//        y = sc.nextInt();
//        int[][] array = new int[x][y];
//
//        for (int i=0; i<x; i++)
//        {
//            for (int j=0; j<y; j++)
//            {
//                array[i][j] = (int)(Math.random() * 100);
//            }
//        }
//        min = array[0][0];
//        max = array[0][0];
//
//        for (int i=0; i<x; i++)
//        {
//            for (int j=0; j<y; j++)
//            {
//                if (array[i][j] < min)
//                {
//                    min = array[i][j];
//                }
//                System.out.print(array[i][j] + " ");
//                if (array[i][j] > max)
//                {
//                    max = array[i][j];
//                }
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        for (int i=0; i<x; i++)
//        {
//            for (int j=0; j<y; j++)
//            {
//                if (array[i][j] == min)
//                {
//                    miny = j;
//                    minx = i;
//                }
//                if (array[i][j] == max)
//                {
//                    maxy = j;
//                    maxx = i;
//                }
//            }
//        }
//        System.out.println("[" + maxx + "]" + "[" + maxy + "]" + " max-" + max);
//        System.out.println("[" + minx + "]" + "[" + miny + "]" + " min-" + min);

        //19
//        int x,count=0;
//        x = sc.nextInt();
//        int[][] array = new int[x][x];
//
//        for (int i=0; i<x; i++)
//        {
//            for (int j=0; j<x; j++)
//            {
//                array[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i=0; i<x; i++)
//        {
//            for (int j=0; j<x; j++)
//            {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        for (int i=0; i<x; i++)
//        {
//            count+=array[i][i];
//        }
//        for (int i=0; i<x; i++)
//        {
//            count+=array[i][x-1-i];
//        }
//
//        if(x%2!=0)
//        {
//            count = count - array[(int)(x/2)][(int)(x/2)];
//        }
//        System.out.println(count);


        //20
//        int x,count=0;
//        x = sc.nextInt();
//        int[][] array = new int[x][x];
//        int[][] arraylast = new int[x][x];
//
//        for (int i=0; i<x; i++)
//        {
//            for (int j=0; j<x; j++)
//            {
//                array[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i=0; i<x; i++)
//        {
//            for (int j=0; j<x; j++)
//            {
//                arraylast[j][x-i-1]=array[i][j];
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println();
//
//        for (int i=0; i<x; i++)
//        {
//            for (int j=0; j<x; j++)
//            {
//                System.out.print(arraylast[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}