package Inheritance;

class child {

	public int addition(int a, int b) {
		return a +b;
		sys
	}
	
	public int substraction(int a, int b) {
		return a-b;
	}
}
	
	public class Methodoverriding extends child{
		public int addition(int a, int b) {
			return a +b;
		}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methodoverriding obj = new Methodoverriding();
		obj.addition(10,20);
	}

	}
	}
	}
