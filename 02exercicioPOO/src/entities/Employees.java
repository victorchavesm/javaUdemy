package entities;

public class Employees {

	public String name;
	public double grossSalary;
	public double tax; //nesse exercício, a taxa não foi em porcentagem
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage/100;
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f", NetSalary());
	}
}
