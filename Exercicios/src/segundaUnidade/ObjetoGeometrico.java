package segundaUnidade;

public class ObjetoGeometrico {

	  protected double x;
	  private double y;
	    
	  ObjetoGeometrico (double a, double b){
		  x = a;
		  y = b;
	  }
	    public double getX(){
	        return x;
	    }
	    public double getY(){
	        return y;
	    }
	    public void  setX(double a){
	        x=a;
	    }
	    public void  setY(double b){
	        y=b;
	    }
		@Override
		public String toString() {
			return "ObjetoGeometrico [x=" + x + ", y=" + y + "]";
		}
	  
}
