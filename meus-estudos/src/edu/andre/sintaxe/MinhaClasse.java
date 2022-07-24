package edu.andre.sintaxe;
public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");

        String primeiroNome ="André";
        String segundoNome ="Martins";

        String meuNome = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(meuNome);

    }
    
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
        
    }


    
}
