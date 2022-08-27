import java.util.Random;
import java.util.Scanner;


public class MatrixArray1 {

    private static int x;

    public static int[][] generateArray(int num)
    {
        int[][] matrix = new int[num][num];
        Random ran = new Random();
        for ( int i = 0; i < num; i++)
            for (int x = 0; x < num; x++)
                matrix[i][x] = ran.nextInt(10) + 1;
        return matrix;
    }
    
    public static void Print(int array[][])
    {
        for (int i = 0; i < array.length; i++)
        {
            for(x = 0; x < array[i].length; x++)
            {
                System.out.printf("%d\t", array[i][x]);
            }
            System.out.printf("\n");
        }
    }

    public static int[][] Add(int a1[][], int a2[][])
    {
        int newArray[][] = a1;
        for (int i = 0; i < a1.length; i++)
            for (int x = 0; x < a1[i].length; x++)
            newArray[i][x] = a1[i][x] + a2[i][x];
        return newArray;
    }

    public static int[][] Subtract(int a1[][], int a2[][])
    {
        int newArray[][] = a1;
        for (int i = 0; i < a1.length; i++)
            for(int x = 0; x < a1[i].length; x++)
                newArray[i][x] = a1[i][x] - a2[i][x];
        return newArray;
    }
    public static int[][] Multiply(int a1[][], int a2[][])
    {
        int[][] newArray = new int[a1.length][a1.length];
            for(int i = 0; i < a1.length; i++)
        {
                for (int x = 0; x < a1[i].length; x++)
            {
                    newArray[i][x] = 0;
                 for(int y = 0; y < a1[i].length; y++)
                 {
                    newArray[i][x] += a1[i][y] * a2[y][x];
        
                 }
            }
         }
         return newArray;
    }

    public static int[][] multiplyConstant(int a1[][], int num)
    {
        int newArray[][] = a1;
        for(int i = 0; i < a1.length; i++)
            for(int x = 0; x < a1[i].length; x++)
                newArray[i][x] = a1[i][x] * num;
        return newArray;
    }
   
    public static int[][] Transpose(int a1[][])
    {
        int newArray[][] = a1;
        for (int i = 0; i < a1.length; i++)
            for(int x = 0; x < a1[i].length; x++)
                newArray[i][x] = a1[x][i];
        return newArray;
    }

    public static int Trace(int a[][])
    {
        int matrixTrace = 0;
        for (int i = 0; i < a.length; i++)
        {
            for(int x = 0; x < a[i].length; x++)
            {
                if(i == x)
                {
                    matrixTrace = matrixTrace + a[i][x];
                }
            }
        }
        return matrixTrace;
    }

    public static void menu()
    {
        System.out.println("Your options are: ");
        System.out.println("------------------");
        System.out.println("\t1) Add 2 Matricies");
        System.out.println("\t2) Subtract 2 Matricies");
        System.out.println("\t3) Multiply 2 Matricies");
        System.out.println("\t4) Multiply Matrix by a Constant");
        System.out.println("\t5) Transpose Matrix");
        System.out.println("\t6) Matrix Trace");
        System.out.println("\t0) Exit");
    }

    public static void main(String[] args)
    {
        Scanner src = new Scanner(System.in);
        while(true)
        {
            menu();
            System.out.print("Please enter your option");
            int option = src.nextInt();
            if (option == 0)
                break;
            System.out.println();
            System.out.print("Enter the size of the matrix: ");
            int size = src.nextInt();
            int matrixx[][] = generateArray(size);
            int matrixy[][] = generateArray(size);
            System.out.println("First matrix is: ");
            Print(matrixy);
            switch(option)
            {
                case 1:
                int z[][] = Add(matrixx, matrixy);
                    System.out.println("The matrixis is: ");
                    Print(z);
                    break;
                case 2:
                int z1[][] = Subtract(matrixx, matrixy);
                    System.out.println("The matrix is: ");
                    Print(z1);
                    break;
                case 3:
                int z2[][] = Multiply(matrixx, matrixy);
                    System.out.println("The matrix is: ");
                    Print(z2);
                    break;
                case 4:
                System.out.print("Enter constant: ");
                    int constant = src.nextInt();
                    int z3[][] = multiplyConstant(matrixx, constant);
                    System.out.println("The matrix is: ");
                    Print(z3);
                    break;
                case 5:
                int z4[][] = Transpose(matrixx);
                    System.out.println("The matrix is: ");
                    Print(z4);
                    break;
                case 6:
                int trace = Trace(matrixx);
                System.out.println("The matrix is: " + trace);
                break;
            }
            System.out.println("\t\tCommand number" + option +" is complete");
            
        }
    }
}

