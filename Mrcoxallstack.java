/****************************************************************************
 *
 * Created by: Younes Elfeitori
 * Created on: Oct 2018
 * This is a program about stack class that can import to other class
 *
 ****************************************************************************/

import java.util.ArrayList;

public class Mrcoxallstack {
	
	ArrayList<Integer> list = new ArrayList<Integer> ();
	
	public void push(int userInput) {
		list.add(userInput);
	}
	
	public void print() {
		System.out.print(list);
	}
}
