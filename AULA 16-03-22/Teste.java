public class Teste {
    
    String jogo;
    String paraComprar;
    float valorGasto;
    String arrependido;

    // Sobrecarga de Metodos 

    Teste(String jogo){
        this.jogo = jogo;
    }
    
    Teste(String jogo, String arrependido){
        this.jogo = jogo;
        this.arrependido = arrependido;
    }

    Teste(String jogo, String arrependido, float valorGasto){
        this.jogo = jogo;
        this.arrependido = arrependido;
        this.valorGasto = valorGasto;
    }

    Teste(String jogo, String arrependido, float valorGasto, String paraComprar){
        this.jogo = jogo;
        this.arrependido = arrependido;
        this.valorGasto = valorGasto;
        this.paraComprar = paraComprar;
    }

    int dia;
    String mes;
    int ano;

    // Procedimento ou método

    // void escreverData(){
       // System.out.println("Hoje é dia " + dia + " do mês de " + mes + " do ano de " + ano + "!");

    // }
    // void escreverDo(){
       // System.out.println("No game " + jogo + " eu gastei um total de " + valorGasto + " e estou " + arrependido);

    // }

    // Define outro nome a variavel ano

    // void somarAno(int varAno){
       // ano = ano + ano;
    // }

    // Define a função this para focar dentro no método

    // void somarAno(int ano){
    //    this.ano = this.ano + ano;
    // }

    // Função

    // String jogoValor(){
       // String namePrice = jogo + " " + valorGasto;
       // return namePrice;

    // }
}
