public class Game2{

    int anoAtual;
    float somaGasto2021;
    int level2021;

    //criando funções

    void anoAtivo(int anoAtual){
        this.anoAtual = this.anoAtual - anoAtual;
    }

    void gastoSkins(float somaGasto2021){
        System.out.println("O valor gasto em 2021 foi de " + somaGasto2021);
        this.somaGasto2021 = this.somaGasto2021 + somaGasto2021;
    }

    void contagemLevel(int level2021){
        System.out.println("Seu level em 2021 era " + level2021);
        this.level2021 = this.level2021 + level2021;

    }

    
}