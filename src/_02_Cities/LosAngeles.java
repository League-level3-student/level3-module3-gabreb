package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		double moneyget = getPopulation()*(getGrowthRate())*(0.5*getGrowthRate());
		return moneyget;
	}
	
}
