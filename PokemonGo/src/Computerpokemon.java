
public class Computerpokemon extends Pokemon {
	
	private int hp=0;
	private int jinhas=0;
	
	Computerpokemon(){
		
		jinhas = jinha;
		hp=100;
	}
	public String name(int i,int j){
		String test[][] = new String[5][2];
		test[0][0]="잉어킹";
		test[0][1]="물";
		test[1][0]="불장군";
		test[1][1]="블";
		test[2][0]="얼음장군";
		test[2][1]="얼음";
		test[3][0]="돌장군";
		test[3][1]="돌";
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
