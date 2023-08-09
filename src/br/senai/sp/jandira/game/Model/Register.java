package br.senai.sp.jandira.game.Model;

import java.util.Scanner;
import br.senai.sp.jandira.game.Model.Enemy;
import br.senai.sp.jandira.game.Model.Player;
public class Register {

    Player player = new Player();

    // Instancia Enemy
    Enemy enemy = new Enemy();

    // Instancia Keyboard
    Scanner keyboard = new Scanner(System.in);

    // Instancia Output
    Output output= new Output();

    public void RegistrarAmbos(){

        // Coleta dados
        RegistrarPlayer();
        System.out.println("");
        RegistrarEnemy();

    }

    public void RegistrarPlayer(){

        // Coleta dados

        System.out.println("--------- Cadastro Jogador --------");

        System.out.print("Qual é o seu nome: ");
        player.name = keyboard.nextLine();
        System.out.print("Selecione sua Skin [Red - Blue - Green]: ");
        player.skin = keyboard.nextLine();

        System.out.println("--- Player cadastrado com sucesso ---");
        System.out.println("");

        output.mostrarPlayer(player);

    }
    public void RegistrarEnemy(){

        // Coleta dados

        System.out.println("--------- Cadastro Inimigo ---------");

        System.out.print("Qual é o seu nome: ");
        enemy.name = keyboard.nextLine();
        System.out.print("Selecione sua Skin [Red - Blue - Green]: ");
        enemy.skin = keyboard.nextLine();

        System.out.println("--- Enemy cadastrado com sucesso ---");
        System.out.println("");

        output.mostrarEnemy(enemy);

    }

    public void Decision(){

        System.out.println("------------------------------------");
        System.out.print("Você deseja cadastrar um Jogador, Inimigo ou Ambos?: ");
        String resposta = keyboard.nextLine();

        System.out.println("");


        switch (resposta){

            case "Jogador":
                RegistrarPlayer();
                break;

            case "Inimigo":
                RegistrarEnemy();
                break;

            case "Ambos":
                RegistrarAmbos();
                break;

            default:
                System.out.println("Escolha uma opção válida");
                System.out.println();
                Decision();

        }

    }

}
