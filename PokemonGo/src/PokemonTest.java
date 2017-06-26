import java.util.Scanner;
public class PokemonTest {
	public static void main(String[] args ){
		String a = "피카츄";
		String b= "전기";

		PokemonGostartpart.start();
		Pokemon pikachu= new Pokemon(a,b,1);
		
		System.out.println("1. 피카츄의 속성보기 , 2. 대결");
		Scanner input = new Scanner(System.in);
		int c = input.nextInt();
		while(true){
		if(c==1){
			pikachu.Pokemonwatch();
			System.out.println("1. 피카츄의 속성보기 , 2. 대결");
			c = input.nextInt();
			
		}else if(c==2){
			Match match= new Match();
			match.match();
			break;
		}else if(c>2 || c<1){
			System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
			System.out.println("1. 피카츄의 속성보기 , 2. 대결");
			c = input.nextInt();
		}
		}//while 끝나는 부분
		
		
	}
}
