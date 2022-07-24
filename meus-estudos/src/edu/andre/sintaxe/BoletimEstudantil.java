package edu.andre.sintaxe;
public class BoletimEstudantil {
    
    public static void main(String[] args) {
        int notaCorte = 7;
        int mediaFinal = 7;

        if (mediaFinal < notaCorte) 
            System.out.println("Aluno REPROVADO");
            
        else if (mediaFinal == notaCorte) 
            System.out.println("Aluno deve fazer PROVA MINERVA");
                        
        else 
            System.out.println("Aluno APROVADO");
            
         
    }
}
