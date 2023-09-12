package herenciaejerciciosdeaprendizaje01;

class Animal {
    protected String nombre, alimento, raza;
    protected int edad;

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    
    public void alimentarse() {
        System.out.println(nombre + " se alimenta de " + alimento + ".");
    }
}

class Perro extends Animal {
    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        super.alimentarse();
    }
}

class Gato extends Animal {
    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        super.alimentarse();
    }
}

class Conejo extends Animal {
    public Conejo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        super.alimentarse();
    }
}