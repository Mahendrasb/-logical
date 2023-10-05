package test;

import java.util.Scanner;

public class Armstrong {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter a number: ");
				int number=sc.nextInt();
				int temp, remainder, result = 0, n = 0 ;
				temp = number;



				while (temp != 0)
				{
				temp /= 10;
				++n;
				}

				temp = number;



				while (temp != 0)
				{
				remainder = temp%10;
				result += Math.pow(remainder, n);
				temp /= 10;
				}

				if(result == number)
				System.out.print(number + " is an Armstrong number");
				else
				System.out.print(number + " is not an Armstrong number");
		}
}
