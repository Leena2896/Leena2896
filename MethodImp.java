
public class MethodImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sum();
int a= multiplication();
System.out.println("Product is "+a);
	}
	public static void sum(){
        int x= 5;
        int y=6;
        int z= x + y;
        System.out.println("Sum is "+z);
    }
	
	public static int multiplication() {
		
		int a=3;
		int b=6;
		int c= a*b;
		return c;
	}
}
