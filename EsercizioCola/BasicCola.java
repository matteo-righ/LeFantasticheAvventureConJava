public class BasicCola {

    private double water = 300.0;
    private double sugar = 0;
    private double caffeine = 0;
  


    public BasicCola(double sugar, double caffeine){

        this.sugar = sugar;
        this.caffeine = caffeine;

    }

    public double getWater(){
        return water;
    }
    public double getSugar(){
        return sugar;
    }
    public double getCaffeine(){
        return caffeine;
    }
    public double weight(){
        return water+sugar+caffeine;
    }
    public double weight(int anni){
        return water+sugar+caffeine;
    }
    
} 
