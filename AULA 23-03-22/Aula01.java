public class Aula01{

    public static void main(String [] args) {

        //primeiro jogador

        Game1 game = new Game1("Valorant", "FPS", 153, "Platina 2");

        //atribuindo valores aos itens das classes
        
        game.precoGame = 0;

        game.rankMaximoAlcancado = "Platina 3";
        game.valorGastoSkins = 2800;
        game.skinFavorita = "Sublime";

        game.empresa = "Riot Games";
        game.timeFavorito = "Loud";
        game.jogadorMvp = "Aspas";
        game.timeCampeao = "Acend";

        //chamando métodos

        game.escreverCaracteristicas();
        System.out.println("-------------------------------------------");

        game.dadosConta();
        System.out.println("-------------------------------------------");

        game.dadosGame();
        System.out.println("-------------------------------------------");

        //Adicionando caracacteristicas

        game.games.anoAtual = 2022;
        game.games.somaGasto2021 = 1500;
        game.games.level2021 = 62;

        //Chamando funções

        game.games.anoAtivo(2020);
        System.out.println("Valorant tem atualmente " + game.games.anoAtual + " anos.");
        System.out.println("-------------------------------------------");

        game.games.gastoSkins(1300);
        System.out.println("O valor gasto até 2022 foi de " + game.games.somaGasto2021);
        System.out.println("-------------------------------------------");

        game.games.contagemLevel(91);
        System.out.println("Atualmente seu level é o " + game.games.level2021);
        System.out.println("-------------------------------------------");

        //Segundo Jogador

        Game1 game2 = new Game1("Valorant", "FPS", 498, "Imortal 2");

        //atribuindo valores aos itens das classes
        
        game2.precoGame = 0;

        game2.rankMaximoAlcancado = "Radiante";
        game2.valorGastoSkins = 5500;
        game2.skinFavorita = "Ancifogo";

        game2.empresa = "Riot Games";
        game2.timeFavorito = "Vivo Keyd";
        game2.jogadorMvp = "Heat";
        game2.timeCampeao = "Acend";

        //chamando métodos

        game2.escreverCaracteristicas();
        System.out.println("-------------------------------------------");

        game2.dadosConta();
        System.out.println("-------------------------------------------");

        game2.dadosGame();
        System.out.println("-------------------------------------------");

        //Adicionando caracacteristicas

        game2.games.anoAtual = 2022;
        game2.games.somaGasto2021 = 3000;
        game2.games.level2021 = 243;

        //Chamando funções

        game2.games.anoAtivo(2020);
        System.out.println("Valorant tem atualmente " + game2.games.anoAtual + " anos.");
        System.out.println("-------------------------------------------");

        game2.games.gastoSkins(2500);
        System.out.println("O valor gasto até 2022 foi de " + game2.games.somaGasto2021);
        System.out.println("-------------------------------------------");

        game2.games.contagemLevel(255);
        System.out.println("Atualmente seu level é o " + game2.games.level2021);
        System.out.println("-------------------------------------------");
    }
}