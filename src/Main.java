import java.util.Arrays;

public class Main {
    static Transport[] transports = new Transport[0];

    public static void main(String[] args) {
        // CRUD
        // C - > CREATE // TUZUU JE BOLBOSO SAKTOO
        // R - > READ   // OKUU JE BOLBOSO ALUU
        // U - > UPDATE // OZGORTUU JE BOLBOSO JANYLOO
        // D - > DELETE // OCHURUU JE BOLSO JOKKO CHYGARUU

        System.out.println(Arrays.toString(getAll()));

        addNewTransport( new Car("toyota camry", "black", 380, 100));


        System.out.println(Arrays.toString(getAll()));

        addNewTransport(new Track("Track 2", "red", 100, 500));

        System.out.println(Arrays.toString(getAll()));


    }

    public static void addNewTransport(Transport transport){
      transports =  Arrays.copyOf(transports, transports.length + 1);
      transports[transports.length - 1] = transport;
    }

    public static Transport[] getAll(){
        return transports;
    }


    public static Transport[] getTransports() {
        return new Transport[]{
                new Car("toyota camry", "black", 380, 100),
                new Car("BMW X7", "white", 420, 250),
                new Track("Track 1", "red", 90, 450),
                new Track("Track 2", "red", 100, 500)
        };
    }


}
