import java.util.Scanner;
import java.util.Random;
public class Match {
	private int i=0;
	Match(){
		match();
	}
	public void match(){
		System.out.println("�ε��� ....");
		PokemonGostartpart.sleep(2);
		//System.out.println("������ ���ϸ��� " + +�̰� + +"�Ӽ��Դϴ�");
		Random random = new Random(); //���� Ŭ������ ��ü�� �����մϴ�.
		while(true){
			i++;
		System.out.println(i+"��° ���Դϴ�. ");
		System.out.println("������ �����ϰڽ��ϱ�?");		
		System.out.println("1. ����  2. ���");
		Scanner input = new Scanner(System.in);
		int c = input.nextInt();
		while(true){
			if(c==1){
				int d =  random.nextInt(1);
				d=d+1;
				if(d==1){
					System.out.println("���浵 ������ �����߽��ϴ�.");
					
				}else if(d==2){
					System.out.println("������ �� �����߽��ϴ�.");
				}
				break;
			}else if(c==2){
				int d =  random.nextInt(1);
				d=d+1;
				if(d==1){
					System.out.println("���浵 ������ �����߽��ϴ�.");
				}else if(d==2){
					System.out.println("������ �� �����߽��ϴ�.");
				}
				break;
			}else if(c>2 || c<1){
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��� �ּ���.");
				System.out.println("1. ��ī���� �Ӽ����� , 2. ���");
				c = input.nextInt();
			}
			}//�ι�° while�� ���������� 
	}//while�� ����������
	}
}
