package AssignmentFile1.Question3;

//formula: C = F-32 / 1.8

public class Calculation {
	
	private Celcius celcius ;
	private Fahrenheit fahrenheit;
		
	public Celcius getCelcius() {
		return celcius;
	}

	public void setCelcius(Celcius celcius) {
		this.celcius = celcius;
	}

	public Fahrenheit getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(Fahrenheit fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	public Calculation(Celcius celcius, Fahrenheit fahrenheit) {
		this.celcius = celcius;
		this.fahrenheit = fahrenheit;
		
		
	}
	
	public Celcius ans(Celcius celcius, Fahrenheit fahrenheit)
	{
		
		
		Celcius ans = (Celcius)((fahrenheit-3.2)/1.8);
	}
}
