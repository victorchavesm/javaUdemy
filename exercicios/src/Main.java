//Em um novo programa, inicie as
//seguintes variáveis:
//	String product1 = "Computer";
//	String product2 = "Office desk";	
//	int age = 30;
//	int code = 5290;
//	char gender = 'F';
//	double price1 = 2100.0;
//	double price2 = 650.50;
//	double measure = 53.234567;
//Em seguida, usando os valores das variáveis, produza a
//seguinte saída na tela do console:
//	Products:
//	Computer, which price is $ 2100,00
//	Office desk, which price is $ 650,50
//	Record: 30 years old, code 5290 and gender: F
//	Measure with eight decimal places: 53,23456700
//	Rounded (three decimal places): 53,235
//	US decimal point: 53.235
			
		
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		String gender = "F";
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products: %n%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, wich price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
		System.out.println();
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rounded (trhee decimal places: %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
	}

}
