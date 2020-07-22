package application;

import entities.TrabalhadorComissao;
import entities.TrabalhadorHora;
import entities.TrabalhadorPeca;

public class MainVencimentos {

    public static void main(String[] args) {

        TrabalhadorPeca  tp = new TrabalhadorPeca("Jorge Silva", 53,62);
        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira", 650.00f, 2731.50f, 4.25f);
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel", 168, 4.50f);

       Object [] trabs = new Object[10];

       trabs[0] = tp;
       trabs[1] = tc;
       trabs[2] = th;
       

    }
}
