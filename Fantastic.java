import java.util.*;
class Fantastic
{
   static char ar[];
   public static void main(String args[])
   {
       String n;
       Fantastic obj=new Fantastic();
       Scanner in=new Scanner(System.in);
       System.out.println("Enter any no:");
       while(true)
       {
           n=in.nextLine();
           if(obj.check(n)==1)
           break;
           else
           System.out.println("Invalid Input:");
        }
        int i,l=n.length(),n1=0,n2=0,counter=0,f=0;
        ar=new char[l];
        String large,small;
        System.out.println("OUTPUT:"); 
        while(obj.check(n)==1)
        {
            large="";
            small="";
            for(i=0;i<l;i++)
            ar[i]=n.charAt(i);
            
            obj.ascendsort();
            for(i=0;i<l;i++)
            small=small+ar[i];
           
            for(i=l-1;i>=0;i--)
            large=large+ar[i];
            
            
            n1=Integer.parseInt(large);
            n2=Integer.parseInt(small);
            
            n=Integer.toString(n1-n2);
            if(n1-n2<100)
            n="0"+n;
            System.out.println(n1+"-"+n2+"="+n);
           
            counter=counter+1;
            if(n.equals("495"))
            {
                f++;
                break;
            }
        }
        System.out.println("Hence,");
        System.out.println();
        if(f>0)
        System.out.println("495 obtained after "+counter+" steps");
        else
        System.out.println("495 not  obtained ");
    }
    public int check(String n)
    {
        int f=0,flag=0;
        for(int i='0';i<='9';i++)
        {
            f=0;
            for(int j=0;j<n.length();j++)
            {
                if(n.charAt(j)==(char)i)
                f++;
            }
            if(f>2)
            {
                flag++;
                break;
            }
        }
        if(flag>0)
        return 0;
        else
        return 1;
    }
    public void ascendsort()
    {
        char t;
        int l=ar.length;
        for(int i=0;i<l-1;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(ar[i]>=ar[j])
                {
                    t=ar[i];
                    ar[i]=ar[j];
                    ar[j]=t;
                }
            }
        }
    }
}
                
/* OUTPUT

Enter any no:
121
OUTPUT:
211-112=099
990-99=891
981-189=792
972-279=693
963-369=594
954-459=495
Hence,

495 obtained after 6 steps

 */            
                
            
       