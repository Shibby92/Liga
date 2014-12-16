
public class LeagueTest {

	public static void main(String[] args) {
		League first = new League(16);
		Skills second = new Skills(85,72,66,90);
		System.out.println(second);
		Player one = new Player ("Haris","Arifovic",10,second);
		System.out.println(one);
		Staff coach = new Staff ("Musa","Dembele","musa@hotmail.com","Coach");
		System.out.println(coach);
		Team arsenal=new Team("Arsenal","London",coach);
		arsenal.addPlayer(one);
		arsenal.addPlayer(one);
		arsenal.addPlayer(one);
		arsenal.addPlayer(one);
		arsenal.addPlayer(one);
		arsenal.addPlayer(one);
		arsenal.addPlayer(one);
		arsenal.addPlayer(one);
		arsenal.addPlayer(one);
		arsenal.addPlayer(one);
		arsenal.addPlayer(one);
		System.out.println(arsenal.toString());
		Skills amateur = new Skills (45,55,33,49);
		Player two= new Player ("Alexis","Sanchez",17,amateur);
		Team sarajevo= new Team("F.K. Sarajevo","Sarajevo",coach);
		sarajevo.addPlayer(two);
		sarajevo.addPlayer(two);
		sarajevo.addPlayer(one);
		sarajevo.addPlayer(two);
		sarajevo.addPlayer(one);
		sarajevo.addPlayer(two);
		sarajevo.addPlayer(one);
		sarajevo.addPlayer(two);
		sarajevo.addPlayer(two);
		sarajevo.addPlayer(one);
		sarajevo.addPlayer(two);
		System.out.println(sarajevo.toString());
		first.addTeam(arsenal);
		first.addTeam(sarajevo);
		Team loser=(first.loser(arsenal, sarajevo));
		System.out.println(loser.getName());
		

	}

}
