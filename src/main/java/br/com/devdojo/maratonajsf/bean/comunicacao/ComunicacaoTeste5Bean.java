package br.com.devdojo.maratonajsf.bean.comunicacao;

import br.com.devdojo.maratonajsf.model.Estudante;

import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class ComunicacaoTeste5Bean implements Serializable {
    private String nome;
    private String sobreNome;
    private Estudante estudante = new Estudante();
    private Estudante estudante2;


    public void execute() {
        System.out.println("Dentro do execute "+nome);
        System.out.println("Dentro do execute "+sobreNome);
        System.out.println("Dentro do execute "+estudante2.getNome());
        System.out.println("Dentro do execute "+estudante2.getNota1());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        System.out.println("veio do setPropertieActionListener " +nome);
        this.nome = nome ;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        System.out.println("veio do setPropertieActionListener  " +sobreNome);
        this.sobreNome = sobreNome;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public Estudante getEstudante2() {
        return estudante2;
    }

    public void setEstudante2(Estudante estudante2) {
        this.estudante2 = estudante2;
    }
}