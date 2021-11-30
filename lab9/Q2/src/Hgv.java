public class Hgv extends RoadVehicle implements ImportDuty{
	private int cargo;

	public Hgv(){ 	
		this(0,0,0,0);	
	}

	public Hgv(int c, int w, int p, float price){ 
		super(w, p, price);
		setCargo(c);
	}

	public void setCargo(int size){
		cargo = size;
		}

	public int getCargo(){
		return cargo;
		}

	public double calculateDuty() {
		return HGVTAXRATE * getPrice();
	}	
}
