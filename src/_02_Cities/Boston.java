package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double moneyget = (getPopulation()*getGrowthRate()) + 0.5*(getPopulation());
		return moneyget;
	}

}
