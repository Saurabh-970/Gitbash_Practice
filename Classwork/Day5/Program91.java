
import java.util.*;
class Digits
{
    public int SumDigits(int iNo)
    {
        int iDgit = 0;
        int iSum = 0;

        while(iNo != 0)
        {
            iDgit = iNo % 10;
            iSum = iSum + iDgit;
            iNo = iNo / 10;
        }
        return iSum;
    }
}
class Program91
{
    public static void main(String A[])

    {
        int iValue = 0;
        int iRet = 0;
   
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        iRet =dobj.SumDigits(iValue);

        System.out.println("Addition of digits "+iRet);

        // important
        
        sobj = null;
        dobj = null;

        System.gc();

       
    }
}