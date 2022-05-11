public class App {

    public static void main(String[] args) {
        
    
        Bagno BagnoMaschi = new Bagno();
        Bagno BagnoFemmine = new Bagno();
        Persona p1 = new Persona("ciava", BagnoMaschi);
        Persona p2 = new Persona("anto", BagnoMaschi);
        Persona p3 = new Persona("irene", BagnoFemmine);
        Persona p4 = new Persona("giulia", BagnoFemmine);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }

}

    

