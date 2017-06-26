import java.util.Random;
import java.util.Scanner;

public class PokemonTest {
	private static int i=0;
	private static int j=0;
	public static void main(String[] args ){
		String a = "피카츄";
		String b= "전기";

		PokemonGostartpart.start();
		Pokemon pikachu= new Pokemon(a,b,1);
		Computerpokemon computer = new Computerpokemon();
		while(true){
		System.out.println("1. 피카츄의 속성보기 , 2. 대결");
		Scanner input = new Scanner(System.in);
		int c = input.nextInt();
		
		if(c==1){
			pikachu.Pokemonwatch();
		
			
		}else if(c==2){
			System.out.println("로딩중 ....");
			PokemonGostartpart.sleep(2);
			Random random = new Random(); //랜덤 클래스의 객체를 생성합니다.
			int t =random.nextInt(4);
			System.out.println("상대방의 포켓몬은 " + computer.name(t, 0)+"이고" + computer.name(t, 1)
			+"속성입니다");
			
			while(true){
				if(pikachu.getPokemonhp()<1){
					System.out.println("피카츄는 죽었다");
					pikachu.reset();
					computer.reset();
					break;
				}else if(computer.getPokemonhps()<1){
					System.out.println("컴퓨터는  죽었다");
					pikachu.reset();
					computer.reset();
					j++;
					if(j>2){
						System.out.println("진화");
						pikachu.getjinha();
					}
					break;
				}
				i++;
			System.out.println(i+"번째 턴입니다. ");
			System.out.println("무엇을 선택하겠습니까?");		
			System.out.println("1. 공격  2. 방어");
			Scanner input2 = new Scanner(System.in);
			int e = input2.nextInt();
			while(true){
				if(e==1){
					int d =  random.nextInt(1);
					d=d+1;
					if(d==1){
						System.out.println("상대방도 공격을 선택했습니다.");
						if(t==0){
						pikachu.setPokemonhp(10);
						computer.setPokemonhp(30);
						}else if(t==3){
							pikachu.setPokemonhp(30);
							computer.setPokemonhp(10);
						}else {
							pikachu.setPokemonhp(20);
							computer.setPokemonhp(20);
						}
						break;
					}else if(d==2){
						System.out.println("상대방은 방어를 선택했습니다.");
						if(t==0){
							pikachu.setPokemonhp(0);
							computer.setPokemonhp(10);
							}else if(t==3){
								pikachu.setPokemonhp(0);
								computer.setPokemonhp(0);
							}else {
								pikachu.setPokemonhp(0);
								computer.setPokemonhp(5);
							}
						break;
					}
					
				}else if(e==2){
					int d =  random.nextInt(1);
					d=d+1;
					if(d==1){
						System.out.println("상대방은 공격을 선택했습니다.");
						if(t==0){
							pikachu.setPokemonhp(0);
							computer.setPokemonhp(0);
							}else if(t==3){
								pikachu.setPokemonhp(10);
								computer.setPokemonhp(0);
							}else {
								pikachu.setPokemonhp(5);
								computer.setPokemonhp(0);
							}
						break;
					}else if(d==2){
						System.out.println("상대방도 방어를 선택했습니다.");
						if(t==0){
							pikachu.setPokemonhp(0);
							computer.setPokemonhp(0);
							}else {
								pikachu.setPokemonhp(0);
								computer.setPokemonhp(0);
							}
						break;
					}
					
				}else if(e>2 || e<1){
					System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
					System.out.println("1. 피카츄의 속성보기 , 2. 대결");
					e = input.nextInt();
				}
				}//두번째 while문 끝나는지점 
		}//while문 끝나는지점
		
		}else if(c>2 || c<1){
			System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
			System.out.println("1. 피카츄의 속성보기 , 2. 대결");
			c = input.nextInt();
		}
		}//while 끝나는 부분
		
		
	}
	
		
	
}
