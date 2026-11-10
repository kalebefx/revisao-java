package Classes_Objetos;

public class Main {

    public static void main(String[] args) {
        Endereco endp1 = new Endereco("Cocalzinho", "GO");
        Pessoa p1 = new Pessoa("Carlos", 30, endp1);
        System.out.println(p1.apresentar());

    }

}
