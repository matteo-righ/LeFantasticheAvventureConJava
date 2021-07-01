class Cola{
    public static void main(String[] args){
        BasicCola cola = new BasicCola(8.0, 22.0);  

        System.out.println("BasicCola:");
        System.out.println("  water weight: " + cola.getWater() + " g"); 
        System.out.println("  sugar weight: " + cola.getSugar() + " g"); 
        System.out.println("  caffeine weight: " + cola.getCaffeine() + " g"); 
        
        System.out.println("  weight today: " + cola.weight() + " g"); 
        System.out.println("  weight after 10 years: " + cola.weight(10) + " g");
        
        System.out.println();
        
        NukaCola nuka = new NukaCola(7.0);  // we only pass cesium, sugar=10.0 and caffeine=12.0 are constants
        
        System.out.println("NukaCola:");
        System.out.println("  water weight: " + nuka.getWater() + " g"); 
        System.out.println("  sugar weight: " + nuka.getSugar() + " g"); 
        System.out.println("  caffeine weight: " + nuka.getCaffeine() + " g"); 
        
        System.out.println("  cesium weight today: " + nuka.getCesium() + " g"); 
        System.out.println("  cesium weight after 10 years: " + nuka.cesiumLeft(10) + " g"); 
        System.out.println("  weight today: " + nuka.weight() + " g"); 
        System.out.println("  weight after 10 years: " + nuka.weight(10) + " g");
    }
}