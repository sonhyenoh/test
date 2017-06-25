
public class Pokemon {
	private String name;
	private int jinha;
	private static String attribute;
	
  Pokemon(String name,String attribute,int jinha){
	  this.name= name;
	  this.jinha =jinha;
	  this.attribute =attribute;
	 
  }


  public void Pokemonwatch(){
		System.out.println(name + "의  속성은"+ attribute +"이고  진화 단계는 " +
				jinha +"이다.");
	}
	

}
