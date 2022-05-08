package Animais;

public class Mamifero extends Animais{

    public Mamifero() {
        this.velocidade = velocidade;
        this.tipoAlimentacao = tipoAlimentacao;
    }
    
   
    private int velocidade;
    
    private String tipoAlimentacao;

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(String tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }
    
}
