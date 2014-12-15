public class Team {
	private Player[] squad = new Player[11];
	private String city;
	private Staff employee;
	private static int NumberOfPLayers = 0;

	public Player[] getSquad() {
		return squad;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Staff getEmployee() {
		return employee;
	}

	public Team(String city, Staff employee) {
		this.city = city;
		this.employee = new Staff(employee);
	}

	public void addPlayer(Player other) {
		squad[NumberOfPLayers] = new Player(other);
		NumberOfPLayers++;
	}

	public Team() {
		setCity("NULL");
		this.employee = new Staff();
	}

	public Team(Team other) {
		for (int i = 0; i < NumberOfPLayers; i++) {
			this.squad[i] = new Player(other.squad[i]);
		}
		setCity(other.city);
		this.employee = new Staff(other.employee);

	}

}
