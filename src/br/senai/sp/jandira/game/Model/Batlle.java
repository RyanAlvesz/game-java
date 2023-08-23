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

    Player player1 = new Player();
    Enemy enemy1 = new Enemy();

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

        System.out.println(scenarioBattle);

    }
    public void Battle (Player player, Enemy enemy) {

        System.out.println(player.name);
        System.out.println(enemy.name);

    }

}
