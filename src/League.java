public class League {
	private Team[] teams ;
	private static int numTeams = 0;
	

	public League() {
		this.teams = new Team[16];
	}


	public void addTeam(Team other) {
		teams[numTeams] = new Team(other);
		numTeams++;
	}

}
