import java.io.*;
class Trianglesum
{
    public static void main(String args[])throws IOException
    {
        int sum,num1,num2,num3;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.print("Enter the 1 angle:");
        num1=Integer.parseInt(br.readLine());
        System.out.print("Enter the 2 angle:");
        num2=Integer.parseInt(br.readLine());
        System.out.print("Enter the 3 angle:");
        num3=Integer.parseInt(br.readLine());
        sum=num1+num2+num3;
        if(sum==180)
        System.out.print(sum+"is Triangle");
        else
        System.out.print(sum+"is not a Triangle");
    }
}