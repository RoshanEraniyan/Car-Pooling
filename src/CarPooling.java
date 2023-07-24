import java.util.*;

public class CarPooling
{
    public static boolean carPooling(int[][] trips,int capacity)
    {
        int[] passengers = new int[1001];
        for (int[] trip : trips)
        {
            int numPassengers=trip[0];
            int pickupLocation=trip[1];
            int dropOffLocation=trip[2];
            passengers[pickupLocation]+=numPassengers;
            passengers[dropOffLocation]-=numPassengers;
        }
        int current = 0;
        for (int i =0;i< 1001;i++)
        {
            current+= passengers[i];
            if (current>capacity)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int r= scanner.nextInt();
       int c= scanner.nextInt();
       int[][] array=new int[r][c];
       for(int i=0;i<r;i++)
       {
           for (int j = 0; j < c; j++)
           {
               array[i][j] = scanner.nextInt();
           }
       }
       int capacity= scanner.nextInt();
        System.out.println(carPooling(array,capacity));
    }
}
