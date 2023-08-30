package br.senai.sp.jandira.game.Model;

public class Player {
    public String name;
    public String skin;
    private int life;
    public Player(){
        life = 100;
    }
    public int GetLife(){
        return life;
    }
    public void SubtrairVida(int danoInimigo){

        life -= danoInimigo;

        if (life < 0){
            life = 0;
        }

    }

}
