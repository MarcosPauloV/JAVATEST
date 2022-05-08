package Animais;

public class Reptil extends Animais{

    public Reptil() {
        this.qntPatas = qntPatas;
        this.anfibio = anfibio;
    }
    
    private int qntPatas;
    
    private boolean anfibio;

    public int getQntPatas() {
        return qntPatas;
    }

    public void setQntPatas(int qntPatas) {
        this.qntPatas = qntPatas;
    }

    public boolean isAnfibio() {
        return anfibio;
    }

    public void setAnfibio(boolean anfibio) {
        this.anfibio = anfibio;
    }
    
    
}

