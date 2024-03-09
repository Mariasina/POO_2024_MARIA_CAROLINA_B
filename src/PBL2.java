import java.util.Scanner;
import java.util.Random;
public class PBL2 {
    static String[] players = new String[4];
    static int[][] score = new int[3][4];
    static int[][] coins = new int[3][4];
    static int[] coins_level = {5,10,20};

    public static void addPlayer(String player, int playerNum) {
        players[playerNum] = player;
    }

    public static void addScore(int playerNum, int total_score, int level){
        score[level][playerNum] = total_score;
    }

    public static void addCoins(int playerNum, int player_coins, int level){
        coins[level][playerNum] = player_coins;
    }

    public static int showScore(int playerNum, int level){
        return score[level][playerNum];
    }
    public static int showCoins(int playerNum, int level){
        return coins[level][playerNum];
    }

    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Bem vindo ao jogo!\n Digite seu nome para começar: ");
            String player = scan.nextLine();
            addPlayer(player, i);

            System.out.println("Escolha uma opção para realizar: \n 1 - Jogar\n2 - Mostrar pontuação atual\n3 - Mostrar jogador com maior pontuação");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    Random coins = new Random();
                    System.out.println("Vamos jogar!");

                    for (int j = 0; j < 3; j++) {
                        System.out.println("\n\nLevel " + j);
                        System.out.println("\n-- Cada moeda vale " + coins_level[j] + " pontos --\nPontuação mínima para passar pro próximo level: " + (coins_level[j] * 2) / 2);

                        int player_coins = coins.nextInt(0, coins_level[j]);

                        if (player_coins < (coins_level[j] * 2) / 2) {
                            System.out.println("Sua pontuação: " + player_coins + " Você não conseguiu a pontuação necessária\n Tentar novamente?\n1 - Tentar novamente\n2 - Desistir(Isso irá passar o jogo para o próximo jogador.");
                            int fail = scan.nextInt();
                            if (fail == 1) {
                                System.out.println("Tentando novamente...");
                                j--;
                            } else {
                                System.out.println("O jogador" + players[i] + "desistiu");
                                j = 3;
                            }
                        } else {
                            System.out.println("Sua pontuação: " + player_coins + "\nVocê venceu!\nPassando para o próximo nível");
                            int total_score = player_coins * coins_level[j];
                            addScore(i, total_score, j);
                            addCoins(i, player_coins, j);

                        }
                    }
                case 2:
                    for (int j = 0; j < 3; j++) {
                        System.out.printf("Pontuação feita no level %d: %d", j, showScore(i, j));
                        System.out.printf("Pontuação feita no level %d: %d", j, showCoins(i, j));
                    }
                case 3:



            }

        }

    }
}
