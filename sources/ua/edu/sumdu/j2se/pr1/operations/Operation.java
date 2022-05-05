package ua.edu.sumdu.j2se.pr1.operations;
/**
* Operation on two arguments.

*/
public class Operation {


	public Operation (int x, int y) {
	this.x = x;
	this.y = y;
	}
	public int getResult () {
	return x * y;
	}
private int x;
private int y;														
}
