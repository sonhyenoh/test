import java.util.Scanner;
public class PokemonTest {
	public static void main(String[] args ){
		String a = "��ī��";
		String b= "����";

		PokemonGostartpart.start();
		Pokemon pikachu= new Pokemon(a,b,1);
		
		System.out.println("1. ��ī���� �Ӽ����� , 2. ���");
		Scanner input = new Scanner(System.in);
		int c = input.nextInt();
		while(true){
		if(c==1){
			pikachu.Pokemonwatch();
			System.out.println("1. ��ī���� �Ӽ����� , 2. ���");
			c = input.nextInt();
			
		}else if(c==2){
			Match match= new Match();
			match.match();
			break;
		}else if(c>2 || c<1){
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��� �ּ���.");
			System.out.println("1. ��ī���� �Ӽ����� , 2. ���");
			c = input.nextInt();
		}
		}//while ������ �κ�
		
		
	}
}
