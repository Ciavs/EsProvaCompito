public class Persona extends Thread {
    
    String nome;
    Bagno b;

    public Persona(String s, Bagno bagno)
    {
        nome = s;
        b = bagno;
    }

    public void run(){
        b.semaforo.P();
        b.usa(nome);
        b.semaforo.V();
    }
}
