package br.senai.sp.jandira.game.Model;
public class Output {
    public void MostrarPlayer(Player player){
        System.out.println("------------- Jogador ------------");
        System.out.println("Nome: " + player.name);
        System.out.println("Skin: " + player.skin);
        System.out.println("Vida: " + player.GetLife());
    }

    public void MostrarEnemy(Enemy enemy){
        System.out.println("------------- Inimigo ------------");
        System.out.println("Nome: " + enemy.name);
        System.out.println("Skin: " + enemy.skin);
        System.out.println("Vida: " + enemy.getLife());
    }

}
