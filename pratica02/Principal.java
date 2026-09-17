package pratica02;

public class Principal{
    public static void main(String[] args){
        Pilha<String> pilha = new Pilha<String>("Letras");

        pilha.push("Python");
        pilha.push("Java");
        pilha.push("C++");
        pilha.push("React");
        pilha.push("Javascript");
        pilha.imprimePilha();
        

        
    }
}