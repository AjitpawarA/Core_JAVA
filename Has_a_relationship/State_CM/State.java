package State_CM;

public class State {
	private String stateName;
	private int stateincome;
	
	private Cm cm;

	public State(String stateName, int stateincome, Cm cm) {
		super();
		this.stateName = stateName;
		this.stateincome = stateincome;
		this.cm = cm;
	}

	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", stateincome=" + stateincome + ", cm=" + cm + "]";
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public int getStateincome() {
		return stateincome;
	}

	public void setStateincome(int stateincome) {
		this.stateincome = stateincome;
	}

	public Cm getCm() {
		return cm;
	}

	public void setCm(Cm cm) {
		this.cm = cm;
	}
	
	
}
