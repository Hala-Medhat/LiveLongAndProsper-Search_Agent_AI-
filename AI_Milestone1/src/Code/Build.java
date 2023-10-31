package Code;

public class Build extends Action{
	int price;
	int foodUse;
	int materialsUse;
	int energyUse;
	int prosperity;
	public Build(int price, int foodUse, int materialsUse, int energyUse, int prosperity) {
		this.price = price;
		this.foodUse = foodUse;
		this.materialsUse = materialsUse;
		this.energyUse = energyUse;
		this.prosperity = prosperity;
	}
	public int getPrice() {
		return price;
	}
	
	public int getFoodUse() {
		return foodUse;
	}
	
	public int getMaterialsUse() {
		return materialsUse;
	}
	
	public int getEnergyUse() {
		return energyUse;
	}

	public int getProsperity() {
		return prosperity;
	}



}
