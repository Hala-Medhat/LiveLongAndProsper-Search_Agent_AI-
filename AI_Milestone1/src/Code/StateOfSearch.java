package Code;

public class StateOfSearch {
	int prosperity;
	int food;
	int materials;
	int energy;
	int unitPriceFood;
	int unitPriceMaterials;
	int unitPriceEnergy;
	int delay;
	TypeOfRequest typeDelay;
	int resourceIncreaseDelay;
	int moneySpent ;
	Build build1;
	Build build2;
	Request requestFood;
	Request requestMaterials;
	Request requestEnergy;
	boolean onDelivery;
	
	
	public StateOfSearch(int prosperity, int food, int materials, int energy, int unitPriceFood, int unitPriceMaterials,
			int unitPriceEnergy,Build build1,Build build2,Request requestFood,Request requestMaterials,
	Request requestEnergy) {
		this.prosperity = prosperity;
		this.food = food;
		this.materials = materials;
		this.energy = energy;
		this.unitPriceFood = unitPriceFood;
		this.unitPriceMaterials = unitPriceMaterials;
		this.unitPriceEnergy = unitPriceEnergy;
		this.delay = 0;
		this.typeDelay = null;
		this.resourceIncreaseDelay = 0;
		this.moneySpent = 0;
		this.build1 = build1;
		this.build2=build2;
		this.requestEnergy=requestEnergy;
		this.requestMaterials=requestMaterials;
		this.requestFood=requestFood;
		this.onDelivery  =false;
	}
	public int getProsperity() {
		return prosperity;
	}
	
	public int getFood() {
		return food;
	}
	public void setFood(int food) {
		this.food = food;
	}
	public int getMaterials() {
		return materials;
	}
	public void setMaterials(int materials) {
		this.materials = materials;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public int getUnitPriceFood() {
		return unitPriceFood;
	}
	public int getUnitPriceMaterials() {
		return unitPriceMaterials;
	}

	public int getUnitPriceEnergy() {
		return unitPriceEnergy;
	}
	
	public int getDelay() {
		return delay;
	}

	public TypeOfRequest getTypeDelay() {
		return typeDelay;
	}
	public void setTypeDelay(TypeOfRequest typeDelay) {
		this.typeDelay = typeDelay;
	}
	public int getMoneySpent() {
		return moneySpent;
	}
	
	
	
	public void IncreaseMoneySpent(int moneySpent) {
		
	     this.moneySpent+=moneySpent;
	}
	public void IncreaseProsperity(int prosperity) {
		
		this.prosperity += prosperity;
		if(prosperity>100) {
			prosperity  = 100;
		}
	}
	
	public void setRequestDelivery(int delay,TypeOfRequest type, int increase) {
		this.delay = delay + 1;
		this.typeDelay = type;
		this.resourceIncreaseDelay = increase;
		onDelivery = true;
	}
	
	public void adjustDelay () {
		if (delay>0) {
			delay--;
			if(delay==0) {
				if(typeDelay.equals(TypeOfRequest.FOOD)) {
					this.food +=resourceIncreaseDelay;
					if(this.food >50) {
						food=50;
					}

				}
				else if(typeDelay.equals(TypeOfRequest.ENERGY)) {
					this.energy +=resourceIncreaseDelay;
					if(this.energy >50) {
						energy=50;
					}

				}
				else if(typeDelay.equals(TypeOfRequest.MATERIALS)) {
					this.materials +=resourceIncreaseDelay;
					if(this.materials >50) {
						materials=50;
					}

				}
				
				this.resourceIncreaseDelay = 0;
				this.typeDelay = null;
				onDelivery=false;
				
			}
		}
	}
	
	
	public void DecreaseResource(int food,int materials,int energy,int prosperity,int price) {
		
		
		this.food -= food;
		this.materials-=materials;
		this.energy-=energy;
		IncreaseProsperity(prosperity);
		IncreaseMoneySpent(price);
	}
	
	public boolean canBuild1() {
		if(food - build1.getFoodUse() <0 || materials - build1.getMaterialsUse()<0 ||
				energy - build1.getEnergyUse()<0 ||
				this.unitPriceEnergy+this.unitPriceFood+this.unitPriceMaterials+build1.getPrice()+this.moneySpent > 100000) {
			return false;
		}
		return true;
		
	}
	
    public boolean canBuild2() {
    	if(food - build2.getFoodUse() <0 || materials - build2.getMaterialsUse()<0 ||
				energy - build2.getEnergyUse()<0 ||
				this.unitPriceEnergy+this.unitPriceFood+this.unitPriceMaterials+build2.getPrice()+this.moneySpent > 100000) {
			return false;
		}
		return true;
	}

    public boolean request() {
    	if(food - 1 <0 || materials - 1<0 ||
				energy - 1<0 ||
				this.unitPriceEnergy+this.unitPriceFood+this.unitPriceMaterials+this.moneySpent > 100000) {
			return false;
		}
		return true;
	
    }
    
    public boolean canWait () {
    	if(onDelivery) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

	

	
	
}
