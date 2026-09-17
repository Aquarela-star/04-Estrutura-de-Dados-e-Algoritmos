public class Principal{
    public static void main(String[] args){
        Fila<String> fila = new Fila<String>("Nomes alunos");

        fila.enfileirar("Rayssa");
        fila.enfileirar("Lucas");
        fila.enfileirar("Sabrina");
        System.out.println("Dado" + fila.desenfileirar() + "Removido");
        fila.enfileirar("Diego");
        fila.enfileirar("Marta");
        fila.imprimeFila();
        


    }
}