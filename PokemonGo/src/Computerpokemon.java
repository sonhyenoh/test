
public class Computerpokemon extends Pokemon {
	
	private int hp=0;
	private int jinhas=0;
	
	Computerpokemon(){
		
		jinhas = jinha;
		hp=100;
	}
	public String name(int i,int j){
		String test[][] = new String[5][2];
		test[0][0]="�׾�ŷ";
		test[0][1]="��";
		test[1][0]="���屺";
		test[1][1]="��";
		test[2][0]="�����屺";
		test[2][1]="����";
		test[3][0]="���屺";
		test[3][1]="��";
		return test[i][j];
	}
	@Override
	public void setPokemonhp(int a){
		  hp-=a;
		  System.out.println("hp : "+hp);
		  
	  }

	  public int getPokemonhps(){
		  return hp;
	  }
	  public void reset(){
		  hp=100;
	  }
}
