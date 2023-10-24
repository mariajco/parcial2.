public class Prueba {
    public static void main(String[] args) {
        Animal[] animales = new Animal[4];
        animales[0] = new Perro();
        animales[1] = new Lobo();
        animales[2] = new Leon();
        animales[3] = new Gato();

        for (Animal animal : animales) {
            System.out.println("Nombre científico: " + animal.getNombreCientifico());
            System.out.println("Sonido: " + animal.getSonido());
            System.out.println("Alimentos: " + animal.getAlimentos());
            System.out.println("Habitat: " + animal.getHabitat());
            
        }
    }
}
