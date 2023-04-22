/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhopaulinho;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author yuriz
 */
public class TrabalhoPaulinho {

    public static void main(String[] args) {
             String opcoes;
        boolean menu = true;
        int quantidade;
        
         quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do vetor"));
                   int[] numeros = new int[quantidade];
                    for(int i = 0; i < numeros.length; i++){
                        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número na posição "));
                        numeros[i] = numero;
                    }
                    
                    int[] arrBubble = Arrays.copyOf(numeros, numeros.length);
                    int[] arrInsertion = Arrays.copyOf(numeros, numeros.length);
                    int[] arrSelection = Arrays.copyOf(numeros, numeros.length);
                    
                       long start, end;
        long timeBubble, timeInsertion, timeSelection;


                    
        
        while(menu){
            
           
            
            opcoes = JOptionPane.showInputDialog("Qual opção deseja escolher:"
                    + "\n B) Metodo Bubble"
                    + "\n S) Metodo Seleção"
                    + "\n I) Metodo Inserção"
                    + "\n T) Comparação de resultados");
            switch(opcoes){
                
                case "B":
                    for(int i = 0; i < arrBubble.length; i++){
                        System.out.println(arrBubble[i]);
                    }
                    
                    start = System.currentTimeMillis();
                    MetodoBubble(arrBubble);
                    end = System.currentTimeMillis();
                    timeBubble = end - start;
                    for(int i = 0; i < arrBubble.length; i++){
                        System.out.println(arrBubble[i]);
                   }
                     System.out.println("Bubble Sort Time: " + timeBubble);
                   break;
                case "S":
                    for(int i = 0; i < arrSelection.length; i++){
                        System.out.println(arrSelection[i]);
                    }
                    
                 start = System.currentTimeMillis();
                 MetodoSelecao(arrSelection);
                 end = System.currentTimeMillis();
                timeSelection = end - start;
                  for(int i = 0; i < arrSelection.length; i++){
                       System.out.println(arrSelection[i]); 
                   }
                  System.out.println("Selection Sort Time: " + timeSelection);
                   break;
                case "I":
                    for(int i = 0; i < arrInsertion.length; i++){
                        System.out.println(arrInsertion[i]);
                    }
                    
                    start = System.currentTimeMillis();
                    MetodoInsercao(arrInsertion);
                    end = System.currentTimeMillis();
                    timeInsertion = end - start;
                    for(int i = 0; i < arrInsertion.length; i++){
                      System.out.println(arrInsertion[i]);
                      
                   }
                     System.out.println("Insertion Sort Time: " + timeInsertion);
                   break;
                case "E":
                   menu = false;
                   break;
                   
                case "T": 
                     start = System.currentTimeMillis();
                    MetodoBubble(arrBubble);
                    end = System.currentTimeMillis();
                    timeBubble = end - start;
                    
                    start = System.currentTimeMillis();
                    MetodoSelecao(arrSelection);
                    end = System.currentTimeMillis();
                    timeSelection = end - start;
                
                    start = System.currentTimeMillis();
                    MetodoInsercao(arrInsertion);
                    end = System.currentTimeMillis();
                    timeInsertion = end - start;
                    
                    for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%-15d | %-15d | %-15d\n", arrBubble[i], arrInsertion[i], arrSelection[i]);
                }
                    System.out.println("Tempo do método bubble: " + timeBubble);
                    System.out.println("Tempo do método Seleção: " + timeSelection);
                    System.out.println("Tempo do método Inserção:: " + timeInsertion);
                default:
                    JOptionPane.showMessageDialog(null,"Escolha outra opção");
            }
        }
        
        
        
        
    }
    
    
    public static void MetodoBubble(int[]vetor) {
        long inicio = System.currentTimeMillis();
        int aux;
        for(int i = 0; i < vetor.length; i++){
            for(int j = i + 1; j < vetor.length; j++) {
                if(vetor[i] > vetor[j]){
                  aux = vetor[j];
                  vetor[j] = vetor[i];
                  vetor[i] = aux;
              
                }
            }
        }
        long fim = System.currentTimeMillis();
        
        long execucao = fim - inicio;
        System.out.println("quantidade de tempo:" + execucao);
        
    }
    
   public static void MetodoSelecao(int[] vetor) {
    long inicio = System.currentTimeMillis();
    int aux;
    for (int i = 0; i < vetor.length - 1; i++) {
        int indice_minimo = i;
        for (int j = i+1; j < vetor.length; j++) {
            if (vetor[j] < vetor[indice_minimo]) {
                indice_minimo = j;
            }
        }
        aux = vetor[i];
        vetor[i] = vetor[indice_minimo];
        vetor[indice_minimo] = aux;
    }
    long fim = System.currentTimeMillis();
    long execucao = (fim - inicio);
    System.out.println("quantidade de tempo: " + execucao);
    
}
     
    public static void MetodoInsercao(int[]vetor){
        long inicio = System.currentTimeMillis();
        for(int i = 1; i < vetor.length; i++){
          int aux,j;
          aux = vetor[i];
          j = i - 1;
          while(j >= 0 && vetor[j] > aux){
              vetor[j+1] = vetor[j];
              j--;
          }
          vetor[j+1] = aux;
        }
        
        long fim = System.currentTimeMillis();
        long execucao = fim - inicio;
        
        System.out.println("quantidade de tempo:" + execucao);
    }
      
    
    }

