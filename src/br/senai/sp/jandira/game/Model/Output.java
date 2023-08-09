package br.senai.sp.jandira.game.Model;
public class Output {
    public void mostrarPlayer(Player player){
        System.out.println("------ Jogador -------");
        System.out.println("Nome: " + player.name);
        System.out.println("Skin: " + player.skin);
    }

    public void mostrarEnemy(Enemy enemy){
        System.out.println("------ Inimigo -------");
        System.out.println("Nome: " + enemy.name);
        System.out.println("Skin: " + enemy.skin);
    }

}
