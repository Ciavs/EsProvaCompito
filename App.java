public class App extends Thread{

    public static void main(String[] args) throws InterruptedException {
        
        Semaforo s1 = new Semaforo(1);
        Semaforo s2 = new Semaforo(1);
    
        Bagno BagnoMaschi = new Bagno("m", s1);
        Bagno BagnoFemmine = new Bagno("f", s2);
        Persona p1 = new Persona("ciava", BagnoMaschi);
        Persona p2 = new Persona("anto", BagnoMaschi);
        Persona p3 = new Persona("irene", BagnoFemmine);
        Persona p4 = new Persona("giulia", BagnoFemmine);

        p1.start();
        p2.start();
        p3.start();
        p4.start();

        p1.join();
        p2.join();
        p3.join();
        p4.join();
    }

}

    

