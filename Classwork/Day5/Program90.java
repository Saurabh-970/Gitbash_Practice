
import java.util.*;
class Digits
{
    public void DisplayDigits(int iNo)
    {
        int iDgit = 0;

        while(iNo != 0)
        {
            iDgit = iNo % 10;
            System.out.println(iDgit);
            iNo = iNo / 10;
        }
    }
}
class Program90
{
    public static void main(String A[])

    {
        int iValue = 0;
   
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        dobj.DisplayDigits(iValue);
 

        // important
        
        sobj = null;
        dobj = null;

        System.gc();

       
    }
}