package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Batlle {

    String scenarioBattle;

    // Instancia Scanner
    Scanner teclado = new Scanner(System.in);

    //Instancia Scenario
    Scenario scenario = new Scenario();

    //Instancia Register
    Register register = new Register();

    int chanceDefesa;

    public void ChoiceScenario(){
        System.out.println("------------------------------------");
        System.out.println("         Escolha um Cenário");
        System.out.println("------------------------------------");
        System.out.println("");
        System.out.println("[1 - Londres]");
        System.out.println("[2 - Grécia]");
        System.out.println("[3 - Los Angeles]");
        System.out.println("[4 - Rio de Janeiro]");
        System.out.println("[5 - Tóquio]");
        System.out.println("[6 - Berlim]");


        int userScenario = teclado.nextInt();

         scenarioBattle = scenario.Scenario(userScenario);

        System.out.println("");
        System.out.println("Cenário escolhido: " + scenarioBattle);

    }
    public void Battle (Player player, Enemy enemy) {

        while (true) {

            int vidaJogador = player.GetLife();
            int vidaInimigo = enemy.getLife();

            if (vidaJogador == 0) {
                System.out.println("O vencedor é o Inimigo " + enemy.name);
                System.out.println("");
                vidaJogador = 100;
                break;
            } else if (vidaInimigo == 0) {
                System.out.println("O vencedor é o Jogador " + player.name);
                System.out.println("");
                vidaInimigo = 100;
                break;
            }

            System.out.println("");
            System.out.println("------------------------------------");
            System.out.println("              Batalha");
            System.out.println("------------------------------------");
            System.out.println("");
            System.out.println("Ataque Jogador [ R ] - " + player.name + " - Vida: " + vidaJogador);
            System.out.println("Ataque Inimigo [ Q ] - " + enemy.name + " - Vida: " + vidaInimigo);

            String ataque = teclado.next();

            System.out.println("");

            if (ataque.equalsIgnoreCase("R")) {

                System.out.println("------------------------------------");
                System.out.println("          O Jogador atacou");
                System.out.println("------------------------------------");
                System.out.println("");
                System.out.print("Defesa Inimigo [ 1 a 5 ]: ");
                int defesa = teclado.nextInt();

                int danoPlayer = (int) (Math.random() * 20) + 1;
                int defesaInimigo = (int) (Math.random() * 20) + 1;
                chanceDefesa = (int) (Math.random() * 5) + 1;
                int danoReal = danoPlayer;

                if (defesa == chanceDefesa){

                    if (defesaInimigo > danoPlayer){
                        break;
                    }else if (defesaInimigo < danoPlayer){
                        danoReal = danoPlayer - defesaInimigo;
                        System.out.println("O inimigo defendeu " + defesaInimigo + " de dano");
                    }

                }else {
                    System.out.println("O inimigo falhou na defesa!");
                }

                enemy.SubtrairVida(danoReal);
                System.out.println("O ataque foi de: " + danoReal);

            } else if (ataque.equalsIgnoreCase("Q")) {

                System.out.println("------------------------------------");
                System.out.println("          O Inimigo atacou");
                System.out.println("------------------------------------");
                System.out.println("");
                System.out.print("Defesa Jogador [ 1 a 5 ]: ");
                int defesa = teclado.nextInt();

                int danoEnemy = (int) (Math.random() * 20) + 1;
                int defesaJogador = (int) (Math.random() * 20) + 1;
                chanceDefesa = (int) (Math.random() * 5) + 1;
                int danoReal = danoEnemy;

                if (defesa == chanceDefesa){

                    if (defesaJogador > danoEnemy){
                        break;
                    }else if (defesaJogador < danoEnemy){
                        danoReal = danoEnemy - defesaJogador;
                        System.out.println("O Jogador defendeu " + defesaJogador + " de dano");
                    }

                }else {
                    System.out.println("O inimigo falhou na defesa!");
                }

                enemy.SubtrairVida(danoReal);
                System.out.println("O ataque foi de: " + danoReal);

            } else {
                System.out.println("Tecla Inválida");
            }

        }

    }

}
