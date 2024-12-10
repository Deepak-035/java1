package pkg2;



class DivByZeroException extends Exception{
	public DivByZeroException(String message) {
		super(message);
	}
}
public class K146_Exception {

	public static void main(String[] args) {
		System.out.println("Exception");
		int nr=10;
		int dr=10;
		
		try {
			if(dr==0) {
				throw new DivByZeroException("division by zero not allowed");
			}
			
			int result=nr/dr;
                        System.out.println("Result="+result);
		}
		
		catch(DivByZeroException e1) {
			System.out.println(e1.getMessage());
		}
		catch(ArithmeticException e2) {
			System.out.println(e2.getMessage());
		}
		finally {
			System.out.println("Finally block executed");
		}

	}

}