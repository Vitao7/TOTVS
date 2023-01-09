package piscina;

public class Piscina {
    double largura;
    double comprimento;
    double profundidade;


    //Contrutor

    public Piscina(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.profundidade = profundidade;

        //O this signifca que a largura é do objeto
    }

    public Piscina() {

    }

    double calcularVolume(){
        return largura * comprimento * profundidade;
    }
}
