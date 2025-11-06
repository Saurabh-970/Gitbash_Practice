import java.util.*;

class Program73
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        iNo = sobj.nextInt();

        for(iCnt = 1; iCnt<= (iNo/2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}