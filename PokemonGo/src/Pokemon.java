
public class Pokemon {
	private String name;
	protected static int jinha;
	private static String attribute;
	private int hp=0;
	Pokemon(){
		
	}
  Pokemon(String name,String attribute,int jinha){
	  this.name= name;
	  this.jinha =jinha;
	  this.attribute =attribute;
	  hp = 100;
  }	
  public void setPokemonhp(int a){
	  hp-=a;
  }

  public void Pokemonwatch(){
		System.out.println(name + "��  �Ӽ��� "+ attribute +"�̰�  ��ȭ �ܰ�� " +
				jinha +"�ܰ��̴�.");
	}
	

}
