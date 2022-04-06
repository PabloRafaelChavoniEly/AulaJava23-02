public class Game1{
    
    String nomeGame;
    String tipoGame;
    float precoGame;
    int levelConta;
    String rankConta;
    String rankMaximoAlcancado;
    float valorGastoSkins;
    String skinFavorita;
    String empresa;
    String timeFavorito;
    String jogadorMvp;
    String timeCampeao;
    Game2 games = new Game2();

    // criando métodos

    void escreverCaracteristicas(){
        System.out.println("O nome do jogo é " + nomeGame + ", é do tipo " + tipoGame + ", e foi comprado no preço de " + precoGame + " reais.");
    }

    void dadosConta(){
        System.out.println("Sua conta está no level " + levelConta + ", seu rank atual é " + rankConta + ", seu rank mais alto alcançado foi " + rankMaximoAlcancado + ", e o valor gasto em skins foi de " + valorGastoSkins + " reais, e sua linha de skins favorita é a " + skinFavorita + "." );
    }

    void dadosGame(){
        System.out.println(nomeGame + " pertence a empresa " + empresa + ", seu time favorito é a " + timeFavorito + ", o melhor jogador em sua opinião é o " + jogadorMvp + " e o time campeão do Valorant Champions Tour foi a " + timeCampeao + "." );
    }

    //sobrecarga de métodos

    Game1(String nomeGame){
        this.nomeGame = nomeGame;
    }

    Game1(String nomeGame, String tipoGame){
        this.nomeGame = nomeGame;
        this.tipoGame = tipoGame;
    }

    Game1(String nomeGame, String tipoGame, int levelConta){
        this.nomeGame = nomeGame;
        this.tipoGame = tipoGame;
        this.levelConta = levelConta;    
    }
    
    Game1(String nomeGame, String tipoGame, int levelConta, String rankConta){
        this.nomeGame = nomeGame;
        this.tipoGame = tipoGame;
        this.levelConta = levelConta; 
        this.rankConta = rankConta;   
    }
}

