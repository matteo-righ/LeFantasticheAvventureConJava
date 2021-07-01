public class NukaCola extends BasicCola{
    
    private double cesium;
   
    public NukaCola(double cesium){
        super(10.0, 12.0);
        this.cesium = cesium; 
    }

    public double getCesium(){
        return cesium;
    }

    public double cesiumLeft(int anni){
        return cesium*Math.pow(0.97716, anni);
    }

    @Override // -
    //Serve per capire che la funzione seguente fa qualcosa di  diverso 
    //rispetto all'originale (quindi si utilizza l'ereditarietá)
    public double weight(){
        return super.weight() + cesium; 
    }

    @Override
    public double weight(int anni){
        return super.weight(anni) + cesiumLeft(anni);
    }

    @Override
    public double getWater(){
        return super.getWater();
    }

    @Override
    public double getSugar(){
        return super.getSugar();
    }

    @Override
    public double getCaffeine(){
        return super.getCaffeine();
    }

}
