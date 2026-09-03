public class Principal{
    public static void main(String[] args){
        Pilha<String> pilha = new
        Pilha<String>("Letras");

        pilha.push("A");
        pilha.push("B");
        pilha.imprimePilha();
        System.out.println("topo: " + pilha.peek());

        System.out.println("Dado:" + pilha.pop() + "removido");
    }
}

