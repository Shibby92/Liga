
public class LeagueTest {

	public static void main(String[] args) {
		League first = new League(16);
		Skills second = new Skills(85,72,66,90);
		System.out.println(second);
		Player one = new Player ("Haris","Arifovic",10,second);
		System.out.println(one);
		Staff two = new Staff ("Musa","Dembele","musa@hotmail.com","Coach");
		System.out.println(two);
		Team Arsenal=new Team("Arsenal","London",two);
		Arsenal.addPlayer(one);
		Arsenal.addPlayer(one);
		Arsenal.addPlayer(one);
		Arsenal.addPlayer(one);
		Arsenal.addPlayer(one);
		Arsenal.addPlayer(one);
		Arsenal.addPlayer(one);
		Arsenal.addPlayer(one);
		Arsenal.addPlayer(one);
		Arsenal.addPlayer(one);
		Arsenal.addPlayer(one);
		System.out.println(Arsenal.toString());

	}

}
