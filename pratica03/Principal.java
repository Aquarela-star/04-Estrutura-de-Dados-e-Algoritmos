package pratica03;

import codigo05.ListaDupla;

public class Principal{
    public static void main(String[] args) {


        ListaDupla<Produto> lista = new ListaDupla<>("Produto");

        Produto no1 = new Produto("Feijão", 5.00);
        Produto no2 = new Produto("Frango",9.00);
        Produto no3 = new Produto("Arroz",10.00);
        Produto no4 = new Produto("Farofa",5.00);


    
        
        lista.addInicio(no1);
        lista.addInicio(no2);
        lista.addFinal(no3);
        lista.imprimeLista();

        lista.addMeio(no4, 1);
        lista.imprimeLista();
        
        System.out.println("Dado: " + lista.removeMeio(4) + " removido!");
        lista.imprimeLista();

    
    }
}
