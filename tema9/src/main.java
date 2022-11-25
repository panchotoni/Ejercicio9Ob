public class main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Francisco",25, 1231235, 12000);
        Trabajador trabajador1 = new Trabajador("Sebastian", 25, 123123, 20000);

        System.out.println(trabajador1.salario);
        System.out.println(cliente1.credito);

    }
}

class Persona {
    String nombre;
    int edad;
    int tel;

    public Persona(String nombre, int edad, int tel) {
        this.nombre = nombre;
        this.edad = edad;
        this.tel = tel;
    }
}

class Cliente extends Persona {
    int credito;

    public Cliente(String nombre, int edad, int tel, int credito) {
        super(nombre, edad, tel);
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    int salario;

    public Trabajador(String nombre, int edad, int tel, int salario) {
        super(nombre, edad, tel);
        this.salario = salario;
    }
}