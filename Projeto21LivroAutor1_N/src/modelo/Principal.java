/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yuril
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Livro livro01 = new Livro();
        livro01.setTitulo("Vinte Mil Léguas Submarinas");
        livro01.setEditora("ABC");
        livro01.setAno(2019);
        
        Livro livro02 = new Livro();
        livro02.setTitulo("Anjos e Demônios");
        livro02.setEditora("DEF");
        livro02.setAno(2015);
        
        Autor autor01 = new Autor("Julio Verne", 1910, "jv@email.com",livro01);
        Autor autor02 = new Autor("Dan Brown", 1910, "db@email.com",livro02);
        Autor autor03 = new Autor("Dan B", 1970, "db@email.com",new Livro("O Código Davinci", "ABC", 2019, autor02));
        
        livro01.setEscritor(autor01);
        livro01.addEscritores(autor01);
        
        livro02.setEscritor(autor02);
        livro01.addEscritores(autor02);
        livro01.addEscritores(autor03);
        
        System.out.println("Livro: " + livro01.getTitulo() + "\n" + livro01.getEditora() + "\n" +
                                        livro01.getAno() + "\n" + livro01.getEscritor().getNome());
        
        System.out.println("\nAutor: " + autor01.getNome() + "\n" + autor01.getAnoNasc() + "\n" +
                                        autor01.getEmail() + "\n" + autor01.getObra().getTitulo());
        
        livro01.listarAutores();
    }
    
}
