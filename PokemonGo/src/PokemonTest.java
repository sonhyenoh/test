import java.util.Random;
import java.util.Scanner;

public class PokemonTest {
	private static int i=0;
	private static int j=0;
	public static void main(String[] args ){
		String a = "��ī��";
		String b= "����";

		PokemonGostartpart.start();
		Pokemon pikachu= new Pokemon(a,b,1);
		Computerpokemon computer = new Computerpokemon();
		while(true){
		System.out.println("1. ��ī���� �Ӽ����� , 2. ���");
		Scanner input = new Scanner(System.in);
		int c = input.nextInt();
		
		if(c==1){
			pikachu.Pokemonwatch();
		
			
		}else if(c==2){
			System.out.println("�ε��� ....");
			PokemonGostartpart.sleep(2);
			Random random = new Random(); //���� Ŭ������ ��ü�� �����մϴ�.
			int t =random.nextInt(4);
			System.out.println("������ ���ϸ��� " + computer.name(t, 0)+"�̰�" + computer.name(t, 1)
			+"�Ӽ��Դϴ�");
			
			while(true){
				if(pikachu.getPokemonhp()<1){
					System.out.println("��ī��� �׾���");
					pikachu.reset();
					computer.reset();
					break;
				}else if(computer.getPokemonhps()<1){
					System.out.println("��ǻ�ʹ�  �׾���");
					pikachu.reset();
					computer.reset();
					j++;
					if(j>2){
						System.out.println("��ȭ");
						pikachu.getjinha();
					}
					break;
				}
				i++;
			System.out.println(i+"��° ���Դϴ�. ");
			System.out.println("������ �����ϰڽ��ϱ�?");		
			System.out.println("1. ����  2. ���");
			Scanner input2 = new Scanner(System.in);
			int e = input2.nextInt();
			while(true){
				if(e==1){
					int d =  random.nextInt(1);
					d=d+1;
					if(d==1){
						System.out.println("���浵 ������ �����߽��ϴ�.");
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
						System.out.println("������ �� �����߽��ϴ�.");
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
						System.out.println("������ ������ �����߽��ϴ�.");
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
						System.out.println("���浵 �� �����߽��ϴ�.");
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
					System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��� �ּ���.");
					System.out.println("1. ��ī���� �Ӽ����� , 2. ���");
					e = input.nextInt();
				}
				}//�ι�° while�� ���������� 
		}//while�� ����������
		
		}else if(c>2 || c<1){
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��� �ּ���.");
			System.out.println("1. ��ī���� �Ӽ����� , 2. ���");
			c = input.nextInt();
		}
		}//while ������ �κ�
		
		
	}
	
		
	
}
