public class Bagno {
    
    public synchronized void usa(String s){
        System.out.println( s + " è entrato");
        try{
            Thread.sleep(1000);
        } catch (Exception e) {}
            System.out.println( s + " è  uscito");
        
    }
}
