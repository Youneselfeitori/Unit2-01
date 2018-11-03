/****************************************************************************
 *
 * Created by: Younes Elfeitori
 * Created on: Oct 2018
 * This is a program about stack which import MrCoxallClass
 *
 ****************************************************************************/


import java.util.*;

public class stack {
	
	public static void main(String[] args) {
		System.out.println("Enter an Integer that can put on the stack. ");
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		Mrcoxallstack stack = new Mrcoxallstack();
		
		stack.push(user);
		stack.print();

	}
	
}
