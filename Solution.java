import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
              
                    System.out.printf("%-15s%03d%n",s1,x);// '-' means left identation in 15 characters,'0' adds 0 characters in the integer if the field of integer is inferior to 3
              
            }
            System.out.println("================================");

    }
}

