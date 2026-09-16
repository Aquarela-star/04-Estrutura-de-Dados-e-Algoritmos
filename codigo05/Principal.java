package codigo05;

public class Principal{
    public static void main(String[] args) {
        ListaDupla<String> lista = new ListaDupla<String>("Alunos");

        lista.addInicio("Rafael");
        lista.addInicio("Cecilia");
        /* 
        NoDuplo<String> no1 = new NoDuplo<String>("Rafael");
        NoDuplo<String> no2 = new NoDuplo<String>("Cecília");
        NoDuplo<String> no3 = new NoDuplo<String>("Joaquim");
        NoDuplo<String> no4 = new NoDuplo<String>("Lara");

        no1.setProximoNo(no2);
        no2.setAnteriorNo(no1);
        no1.getProximoNo().getDado();
        */
    }
}
