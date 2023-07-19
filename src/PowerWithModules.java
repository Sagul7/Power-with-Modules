import java.util.Scanner;

public class PowerWithModules {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println(caculatePower(A,B,C));
    }
    public static int caculatePower(int A,int B,int C)
    {
        int result=1;
        for(int i=1;i<=B;i++)
        {
            A=A%C;
            result=(result*A)%C;
        }
        return result;
    }
}
/*
Power with Modules
You are given A, B and C .
Calculate the value of (A ^ B) % C

Example Input

Input 1:
A = 2 B = 3 C = 3
Input 2:
A = 5 B = 2 C = 4
Example Output
Output 1: 2
Output 2: 1
 */