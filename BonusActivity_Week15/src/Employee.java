
public class Employee {
	
	private String name;
	private double hours;
	private double totalPay;
	
	public Employee(String n, double h) {
		name=n;
		hours=h;
		setTotalPay();
	}
	
	public Employee() {
		
		name="Arun";
		hours=45;
		setTotalPay();
	}

	public void setTotalPay() {
		int hourlyRate = 15;
		if (hours>40) {
			double overtimePay = 16.5;
			this.totalPay =(40*hourlyRate)+((hours-40)*overtimePay);
		}
		
		else {
			 this.totalPay = hours*hourlyRate;
		}
	}

	public double getTotalPay() {
		return totalPay;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public String getName() {
		return name;
	}

	public double getHours() {
		return hours;
	}

}