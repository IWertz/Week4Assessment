package model;

/**
 * @author Snipe - iwertz
 * CIS175 - Spring 2021
 * Feb 19, 2021
 */
public class USD {
	private double currency;
	private double yen;
	private double peso;
	private final double YEN_CONVERSION = 105.42;
	private final double PESO_CONVERSION = 20.30;

	public USD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public USD(double currency) {
		super();
		this.currency = currency;
	}

	public double getCurrency() {
		return currency;
	}

	public void setCurrency(double currency) {
		this.currency = currency;
	}
	
	
	
	public double getYen() {
		return yen;
	}

	public void setYen(double yen) {
		this.yen = yen;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void convertToYen() {
		yen = currency * YEN_CONVERSION;
	}
	
	public void convertToPeso() {
		peso = currency * PESO_CONVERSION;
	}

	@Override
	public String toString() {
		return "USD [currency=" + currency + ", YEN_CONVERSION=" + YEN_CONVERSION + ", PESO_CONVERSION="
				+ PESO_CONVERSION + "]";
	}
}
