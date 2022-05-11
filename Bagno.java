public class Bagno {
    
    String targhetta;
    Semaforo semaforo;
    
    public Bagno(String targhetta, Semaforo s){
        this.targhetta = targhetta;
        semaforo = s;
    }

    public synchronized void usa(String s){
        System.out.println( s + " è entrato in " + targhetta);
        try{
            Thread.sleep(1000);
        } catch (Exception e) {}
            System.out.println( s + " è  uscito");
        
    }
}
