import java.util.*;

class Number
{
    public boolean CheckPerfect(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
                                      
        // Reverse loop

        for(iCnt = iNo/2; (iCnt >= 1) && (iSum < iNo); iCnt--)
        {
            if((iNo % iCnt) == 0)
            {
                iSum =iSum + iCnt;
            }
            
            if(iSum > iNo)
            {
                break;
            }
                        
        }
        return (iSum == iNo); 
      
        
    }
}// End of Number class

class Program85
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;
   
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        iValue = sobj.nextInt();

        Number nobj = new Number();
        bRet =nobj.CheckPerfect(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is perfect number");
        }
        else
        {
            System.out.println(iValue+" is not perfect number");

        }

        // important
        
        sobj = null;
        nobj = null;

        System.gc();

       
    }
}