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

    int ambos = 1;

    public void RegistrarAmbos(){

        ambos = 0;

        // Coleta dados
        RegistrarPlayer();
        System.out.println("");
        RegistrarEnemy();

        output.MostrarPlayer(player);
        output.MostrarEnemy(enemy);

    }

    public Player RegistrarPlayer(){

        // Coleta dados

        System.out.println("---------- Cadastro Jogador ----------");

        System.out.print("Qual é o seu nome: ");
        player.name = keyboard.nextLine();
        System.out.print("Selecione sua Skin [Red - Blue - Green]: ");
        player.skin = keyboard.nextLine();

        System.out.println("--- Jogador cadastrado com sucesso ---");
        System.out.println("");

        if(ambos == 1){
            output.MostrarPlayer(player);
        }

        return player;

    }
    public Enemy RegistrarEnemy(){

        // Coleta dados

        System.out.println("----------- Cadastro Inimigo -----------");

        System.out.print("Qual é o seu nome: ");
        enemy.name = keyboard.nextLine();
        System.out.print("Selecione sua Skin [Red - Blue - Green]: ");
        enemy.skin = keyboard.nextLine();

        System.out.println("--- Inimigo cadastrado com sucesso ---");
        System.out.println("");

        if(ambos == 1){
            output.MostrarEnemy(enemy);
        }

        return enemy;

    }

    public void Decision(){

        System.out.println("------------------------------------");
        System.out.print("Você deseja cadastrar um Jogador, Inimigo ou Ambos?: ");
        String resposta = keyboard.nextLine();

        System.out.println("");


        switch (resposta.toLowerCase()){

            case "jogador":
                RegistrarPlayer();
                break;

            case "inimigo":
                RegistrarEnemy();
                break;

            case "ambos":
                RegistrarAmbos();
                break;
        }

        System.out.println("");
        System.out.println("Deseja retornar ao cadastro? (Sim/Não)");
        String respostaCadastro = keyboard.nextLine();

        System.out.println("");

        switch(respostaCadastro.toLowerCase()){

            case "sim":
                Decision();
                break;

        }


    }

}
