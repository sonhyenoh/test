
public class Pokemon {
	private String name;
	protected static int jinha;
	private static String attribute;
	private static int hp=0;
	Pokemon(){
		
	}
  Pokemon(String name,String attribute,int jinha){
	  this.name= name;
	  this.jinha =jinha;
	  this.attribute =attribute;
	  hp = 100;
  }	
  public void getjinha(){
	  jinha++;
  }
  public void setPokemonhp(int a){
	  hp-=a;
	  System.out.println("hp : "+hp);
  }
  public int getPokemonhp(){
	  return hp;
  }

  public void Pokemonwatch(){
		System.out.println(name + "��  �Ӽ��� "+ attribute +"�̰�  ��ȭ �ܰ�� " +
				jinha +"�ܰ��̴�.");
	}
  public void reset(){
	  hp=100;
  }
	

}
