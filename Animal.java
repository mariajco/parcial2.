public abstract class Animal {
    private String sonidos;
    private String alimentos;
    private String habitat;
    private String nombreCientifico;

    public Animal(String sonidos, String alimentos, String habitat, String nombreCientifico) {
        this.sonidos = sonidos;
        this.alimentos = alimentos;
        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
    }

    public abstract String getNombreCientifico();
    public abstract String getSonido();
    public abstract String getAlimentos();
    public abstract String getHabitat();
}
