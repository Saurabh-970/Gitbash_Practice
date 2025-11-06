
import java.io.*;

class Program76
{
    // Not a good programming IOException---------
    public static void main(String A[]) throws IOException
    {
        int iNo = 0;
        int iCnt = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number");
        
        iNo = Integer.parseInt(bobj.readLine());
        
        for(iCnt = 1; iCnt<= (iNo/2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}