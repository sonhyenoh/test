
public class Car implements Valuable {
		private String name;
		private double price;
		public Car(String name, double price){
			this.name = name;
			this.price= price;
		}
		public String toString(){
			return "Car name" + name +"\n"+ "initial price :" + price;
		}
		@Override
		public double EstimateValue(int month){
		 price -= price*0.2;
		 int i=0;
		 while(i<month){
		 price = price - 0.01*price;
		 i++;
		 }
		 return price;
		}
}
