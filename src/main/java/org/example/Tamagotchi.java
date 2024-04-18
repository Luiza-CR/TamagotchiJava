package org.example;

public class Tamagotchi {


    // Atributos que definem o estado do Tamagotchi

    private String name;
    private int saude;
    private int energia;
    private int felicidade;
    private int fome;
    private int higiene;

    // Construtor para inicializar os atributos
    public Tamagotchi(String name) {
        this.name = name;
        saude = 100;
        energia = 100;
        felicidade = 100;
        fome = 100;
        higiene = 100;
    }

    // Métodos para gerenciar os atributos
    public void comer() {
        // Aumenta a fome e diminui a saúde se comer demais
        fome += 20;
        if (fome > 100) {
            saude -= 10;
        }
    }

    public void brincar() {
        // Aumenta a felicidade e diminui a energia
        felicidade += 20;
        energia -= 15;
    }

    public void dormir() {
        // Restaura a energia e diminui a felicidade
        energia += 30;
        felicidade -= 10;
    }

    public void limpar() {
        // Aumenta a higiene e diminui a saúde se sujar demais
        higiene += 20;
        if (higiene > 100) {
            saude -= 10;
        }
    }

    // Métodos para verificar o estado do Tamagotchi
    public boolean estaVivo() {
        return saude > 0;
    }

    // Atualiza o estado do Tamagotchi ao longo do tempo
    public void atualizar() {
        // Simula a passagem do tempo e seus efeitos
        saude -= 1;
        energia -= 2;
        felicidade -= 1;
        fome += 1;
        higiene -= 2;
    }

    public int getFome () {
        return fome;
    }

    public int getSaude () {
        return saude;
    }

    public int getFelicidade () {
        return felicidade;
    }

    public int getEnergia () {
        return energia;
    }

    public int getHigiene () {
        return higiene;
    }


    public String getName () {
        return name;
    }

    public void passear () {
    }
}
