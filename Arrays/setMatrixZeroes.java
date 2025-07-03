import java.util.*;
class setMatrixZeroes
{
    public static void main (String [] args)
    {
        //input
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter number of rows");
        int r=sc.nextInt ();
        System.out.println ("Enter number of columns");
        int c=sc.nextInt ();
        int arr[][]=new int [r][c];
        System.out.println("Enter array elements row-wise (enter each elem individually): ");
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        //
        //brute force 
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (arr[i][j]==0){
                    markRow(arr,i,c); //replace row with -1
                    markCol(arr,j,r); //replace column with -1
                }
            }
        }

        //changes -1 to 0 and display
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (arr[i][j]==-1){
                    arr[i][j]=0;
                }
                System.out.print (arr[i][j]);
            }
            System.out.println();
        }
        //
        //
    }
    //
    public static void markRow(int a[][], int x,int col)
    {
        for (int i=0;i<col;i++)
        {
            if (a[x][i]!=0)
            {
                a[x][i]=-1;
            }
        }
    }
    //
    public static void markCol (int a[][], int x,int row)
    {
        for (int i=0;i<row;i++)
        {
            if (a[i][x]!=0)
            {
                a[i][x]=-1;
            }
        }
    }
    //
}