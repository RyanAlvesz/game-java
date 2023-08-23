package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Menu {

    // Instancia o Scanner

    Scanner teclado = new Scanner(System.in);

    // Instancia Register
    Register register = new Register();

    // Instancia Battle
    Batlle battle = new Batlle();
    public void Menu(){

        boolean continuar = true;

        while (continuar){

            System.out.println("------------------------------------");
            System.out.println("             Bem Vindo!");
            System.out.println("------------------------------------");
            System.out.println("");
            System.out.println("Escolha uma opção: ");
            System.out.println("[1 - Registrar]");
            System.out.println("[2 - Batalhar]");
            System.out.println("[3 - Sair]");
            System.out.println("");

            int userOption = teclado.nextInt();

            switch (userOption){

                case 1:
                    register.Decision();
                    break;

                case 2:
                    battle.ChoiceScenario();
                    battle.Battle();
                    break;

                case 3:
                    continuar = false;
                    break;

            }

        }




    }

}
