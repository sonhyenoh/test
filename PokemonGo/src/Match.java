import java.util.Scanner;
import java.util.Random;
public class Match {
	private int i=0;
	Match(){
		match();
	}
	public void match(){
		System.out.println("로딩중 ....");
		PokemonGostartpart.sleep(2);
		//System.out.println("상대방의 포켓몬은 " + +이고 + +"속성입니다");
		Random random = new Random(); //랜덤 클래스의 객체를 생성합니다.
		while(true){
			i++;
		System.out.println(i+"번째 턴입니다. ");
		System.out.println("무엇을 선택하겠습니까?");		
		System.out.println("1. 공격  2. 방어");
		Scanner input = new Scanner(System.in);
		int c = input.nextInt();
		while(true){
			if(c==1){
				int d =  random.nextInt(1);
				d=d+1;
				if(d==1){
					System.out.println("상대방도 공격을 선택했습니다.");
					
				}else if(d==2){
					System.out.println("상대방은 방어를 선택했습니다.");
				}
				break;
			}else if(c==2){
				int d =  random.nextInt(1);
				d=d+1;
				if(d==1){
					System.out.println("상대방도 공격을 선택했습니다.");
				}else if(d==2){
					System.out.println("상대방은 방어를 선택했습니다.");
				}
				break;
			}else if(c>2 || c<1){
				System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
				System.out.println("1. 피카츄의 속성보기 , 2. 대결");
				c = input.nextInt();
			}
			}//두번째 while문 끝나는지점 
	}//while문 끝나는지점
	}
}
