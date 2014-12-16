public class League {
	private Team[] teams;
	private static int numTeams = 0;

	public League(int number) {
		this.teams = new Team[number];
	}

	public void addTeam(Team other) {
		teams[numTeams] = new Team(other);
		numTeams++;
	}

	public void startCup() {
		int size = numTeams;
		for (int i = 0; i < size / 2; i++) {
			removeTeam(loser(teams[i], teams[size]));
			size--;
		}
	}

	public void removeTeam(Team loser) {
		loser = null;
		numTeams--;
	}

	public Team loser(Team team, Team team2) {
		if (team.getRating() < team2.getRating())
			return team;
		else
			return team2;
	}
	public void prepareForNextStage(){
		Team [] tmp= new Team[teams.length/2];
		int counter=0;
		for(int i =0 ;i<teams.length;i++){
			if (teams[i]!=null){
				tmp[counter]= new Team(teams[i]);
			counter++;
			}
		}
		this.teams=tmp;
	}

}
