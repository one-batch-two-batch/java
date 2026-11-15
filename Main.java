import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int n=sc.nextInt();

        long fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }

        int temp=n;
        int sum=0;
        while (temp>0){
            sum=sum+temp%10;
            temp=temp/10;
        }

        String s=""+fact;
        String reverse="";
        for (int i=s.length()-1;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }
        System.out.println("Factorial: "+fact);
        System.out.println("Sum: "+sum);
        System.out.println("Reverse: "+reverse);
    }
}
