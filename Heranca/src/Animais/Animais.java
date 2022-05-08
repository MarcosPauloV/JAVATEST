package Animais;

public abstract class  Animais {
    
    private String Nome;
    
    private String Cor;
    
    private String Habitat;

    public Animais() {
        this.Nome = Nome;
        this.Cor = Cor;
        this.Habitat = Habitat;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getHabitat() {
        return Habitat;
    }

    public void setHabitat(String Habitat) {
        this.Habitat = Habitat;
    }
    
    
    
    
}
