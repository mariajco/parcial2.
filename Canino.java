public class Canino extends Animal {
    public Canino(String sonidos, String alimentos, String habitat, String nombreCientifico) {
        super(sonidos, alimentos, habitat, nombreCientifico);
    }

    @Override
    public String getNombreCientifico() {
        return super.getNombreCientifico();
    }

    @Override
    public String getSonido() {
        return super.getSonido();
    }

    @Override
    public String getAlimentos() {
        return super.getAlimentos();
    }

    @Override
    public String getHabitat() {
        return super.getHabitat();
    }
}
