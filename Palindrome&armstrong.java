import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        String s=sc.next();

        String reverse="";
        for (int i=s.length()-1;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }

        if (s.equals(reverse))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");

        int n=Integer.parseInt(s);
        System.out.println("Armstrong numbers");
        for (int i=1;i<=n;i++){
            int num=i;
            int sum=0;
            while  (num>0){
                int digit=num%10;
                sum=sum+digit*digit*digit;
                num=num/10;
            }

            if (sum==i)
                System.out.print(i+" ");
        }
        
    }
}