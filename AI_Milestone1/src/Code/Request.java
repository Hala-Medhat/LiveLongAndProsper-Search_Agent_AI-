package Code;

public class Request extends Action {
	int amountRequested;
	int delay;
	TypeOfRequest type;
	
	public Request(int amountRequested, int delay, TypeOfRequest type) {
		this.amountRequested = amountRequested;
		this.delay = delay;
		this.type = type;
	}

	public int getAmountRequested() {
		return amountRequested;
	}

	public int getDelay() {
		return delay;
	}

	public TypeOfRequest getType() {
		return type;
	}


}
