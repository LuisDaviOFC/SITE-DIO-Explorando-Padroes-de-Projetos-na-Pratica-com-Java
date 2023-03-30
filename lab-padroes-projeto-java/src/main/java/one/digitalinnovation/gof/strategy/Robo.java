package one.digitalinnovation.gof.strategy;

public class Robo {
    public Comportamento comportamento;

    public void setStrategy(Comportamento comportamento) {
        this.comportamento = comportamento;
    }
    
    public void mover(){
        comportamento.mover(); 
    }
}
