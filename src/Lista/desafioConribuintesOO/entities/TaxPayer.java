package Lista.desafioConribuintesOO.entities;

public class TaxPayer {
	private double salaryIncome;
	private double serviceIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;

	public TaxPayer(double salaryIncome, double serviceIncome, double capitalIncome, double healthSpending,
			double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.serviceIncome = serviceIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServiceIncome() {
		return serviceIncome;
	}

	public void setServiceIncome(double serviceIncome) {
		this.serviceIncome = serviceIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	public double salaryTax() {
		double salaryMonthly = this.salaryIncome / 12;
		
		if(salaryMonthly > 5000) {
			return this.salaryIncome * 0.2;
		} else if(salaryMonthly > 3000 && salaryMonthly < 5000) {
			return this.salaryIncome * 0.1;
		} else {
			return 0.0;
		}
	}
	
	public double serviceTax() {
		if(this.serviceIncome > 0) {
			return this.serviceIncome * 0.15;
		} else {
			return 0.0;
		}
	}
	
	public double capitalTax() {
		if(this.capitalIncome > 0) {
			return this.capitalIncome * 0.20;
		} else {
			return 0.0;
		}
	}
	
	public double grossTax() {
		return salaryTax() + serviceTax() + capitalTax();
	}
	
	public double taxRebate() {
		if((grossTax() * 0.3) < (this.educationSpending + this.healthSpending)) {
			return grossTax() * 0.3;
		} else {
			return this.educationSpending + this.healthSpending;
		}
	}
	
	public double netTax() {
		return grossTax() - taxRebate();
	}

}
