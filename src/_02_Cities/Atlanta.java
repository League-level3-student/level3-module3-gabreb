package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double moneyget = getPopulation()*(2*getGrowthRate());
		return moneyget;
	}

}
