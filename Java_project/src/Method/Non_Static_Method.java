package Method;

public class Non_Static_Method {

	public static void main(String[] args) {
		
		Non_Static_Method MY_Object = new Non_Static_Method();
		MY_Object.Information();
		MY_Object.Number();

	}
	
	public void Information() {
		
		System.out.println("Customer Name is Vimal");
	}
	
	private void Number() {
		System.out.println("Customer Phone Number is 8870626506");
	}
}
