package util;

import model.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class EscreverObjetos {

    private String nomeArquivo;

    public EscreverObjetos(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    // Método para escrever objetos em arquivo
    public void escrever(List<Carta> lista) {
        try (FileOutputStream arq = new FileOutputStream(nomeArquivo); 
             ObjectOutputStream out = new ObjectOutputStream(arq)) { // Auto-fechamento com try-with-resources
             
            for (Carta carta : lista) {
                out.writeObject(carta); // Escreve o objeto Carta no arquivo
            }
            
            System.out.println("Objetos foram escritos no arquivo com sucesso.");
            
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}

