package Day3;

public class Overloading {
	public void sum(int a,int b) {
		int sum=a+b;
		System.out.println("sum value:"+sum);
				
		
	}
    public void sum(double a,double b) {
		double sum=a*b;
		System.out.println("sum value:"+sum);
	}
    public static void main(String[] args) {
    	Overloading od=new Overloading();
    	 od.sum(400, 500);
    	 od.sum(260,50);
	}
}
