package cl.talentodigital.tuturno;

public class Main {
    public static void main(String[] args) {

        Persona juan = new Persona("Juan", "1-9");
        Persona felipe = new Persona("Felipe", "2-7");

        Turno turno = new Turno();
        Turno turno2 = new Turno();
        turno.setHora("20:29");
        turno.setId(1);
        turno.setNumero("A02");
        turno2.setNumero("A03");
        System.out.println("Turno: " + turno2.toString());
        System.out.println("Turno: " + turno.toString());


    }
}
