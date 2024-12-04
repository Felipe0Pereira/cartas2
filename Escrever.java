package util;

import model.*;

import java.util.ArrayList;

public class Escrever {
    public static void main (String args[]) {
        ArrayList <Carta> cartas = new ArrayList<>();
        EscreverObjetos writer = new EscreverObjetos("cartas.dat");

        cartas.add (new Carta("Ganhou na loteria", 1000, 0, false, true));
        cartas.add (new Carta("Recebeu herança de um parente distante", 800, 0, false, true));
        cartas.add (new Carta("Imposto de renda devolvido", 200, 0, false, true));
        cartas.add (new Carta("Ganhou no jogo do bixo", 400, 0, false, true));
        cartas.add (new Carta("Investimentos valorizaram", 300, 0, false, true));
        cartas.add (new Carta("Vendeu muitos bolos de pote", 300, 0, false, true));
        cartas.add (new Carta("Investimentos valorizaram", 300, 0, false, true));
        cartas.add (new Carta("Emprestou dinheiro de agiota", 300, 0, false, true));
        cartas.add (new Carta("Ganhou no bingo", 50, 0, false, true));
        cartas.add (new Carta("Investimentos valorizaram", 300, 0, false, true));

        cartas.add (new Carta("Foi multado por excesso de beleza", 50, 0, false, false));
        cartas.add (new Carta("Esqueceu de declar Imposto de Renda", 300, 0, false, false));
        cartas.add (new Carta("Foi assaltado", 100, 0, false, false));
        cartas.add (new Carta("Foi pego sonegando imposto", 200, 0, true, false));
        cartas.add (new Carta("Perdeu apostando no Grêmio", 400, 0, false, false));
        cartas.add (new Carta("Recebeu uma multa de trânsito", 50, 0, false, false));
        cartas.add (new Carta("Preso por estelionato", 100, 0, true, false));
        cartas.add (new Carta("Preso por clonar cartão", 0, 0, true, false));
        cartas.add (new Carta("Perdeu investimentos", 400, 0, false, false));
        cartas.add (new Carta("Pagou o agiota", 700, 0, false, false));

        writer.escrever(cartas);
        Cartas cartas2 = Cartas.getInstance();

        cartas2.leCartas();
        Carta carta = cartas2.sortearCarta();
        System.out.println(carta.getTexto()+ " " + carta.getValor());


    }
}
