package Code;

public class LLAPSearch extends GenericSearch {
	
	static StateOfSearch stateOfSearch;
	
	
	public static void parseInitialState(String initialState) {
		String [] states = initialState.split(";");
		int initialProsperity = Integer.parseInt(states[0]);
		String [] initial = states[1].split(",");
		int initialFood = Integer.parseInt(initial[0]);
		int initialMaterials=Integer.parseInt(initial[1]); 
		int initialEnergy = Integer.parseInt(initial[2]);
		String [] unitPrices = states[2].split(",");
		int unitPriceFood = Integer.parseInt(unitPrices[0]);
		int unitPriceMaterials=Integer.parseInt(unitPrices[1]);
		int unitPriceEnergy=Integer.parseInt(unitPrices[2]);
		
		String [] requestFood = states[3].split(",");
		String [] requestMaterials = states[4].split(",");
		String [] requestEnergy = states[5].split(",");
		String [] build1Var = states[6].split(",");
		String [] build2Var = states[7].split(",");
		
		Request food = new Request(Integer.parseInt(requestFood[0]),
				Integer.parseInt(requestFood[1]), TypeOfRequest.FOOD);
		
		Request materials = new Request(Integer.parseInt(requestMaterials[0]),
				Integer.parseInt(requestMaterials[1]), TypeOfRequest.MATERIALS);
		
		Request energy = new Request(Integer.parseInt(requestEnergy[0]),
				Integer.parseInt(requestEnergy[1]), TypeOfRequest.ENERGY);
		
		Build build1 = new Build(Integer.parseInt(build1Var[0]),Integer.parseInt(build1Var[1]),
				Integer.parseInt(build1Var[2]),Integer.parseInt(build1Var[3]),Integer.parseInt(build1Var[4]));
		
		Build build2 = new Build(Integer.parseInt(build2Var[0]),Integer.parseInt(build2Var[1]),
				Integer.parseInt(build2Var[2]),Integer.parseInt(build2Var[3]),Integer.parseInt(build2Var[4]));
		
		stateOfSearch = new StateOfSearch (initialProsperity, initialFood, initialMaterials, initialEnergy,
				unitPriceFood, unitPriceMaterials,unitPriceEnergy,
				build1,build2,food,materials,energy);
	}
	
	
	
	public static String solve (String initialState,String strategy, boolean visualize) {
		parseInitialState(initialState);
		
	
		return "";
	}

}
