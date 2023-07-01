import javax.swing.*;

public class OrdenacaoBubbleService {

    long startTime = System.nanoTime();
    public void ordenarBubble()
    {
<<<<<<< HEAD
        long tempoInicial = System.currentTimeMillis();

        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números do vetor"));
=======
        int tamanho = 10;
>>>>>>> main

        int[] vetor = new int[tamanho];

        int menu = 0;
        while(menu != 4){
            menu = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n"
            + "1 - Cadastrar \n2 - Ordenar \n3 - Mostrar \n4 - Sair"));

            switch (menu){
                case 1:
                    cadastrar(vetor);
                    break;
                case 2:
                    ordenar(vetor);
                    break;
                case 3:
                    mostrar(vetor);
                    break;
                default:
                    break;
            }
        }

    }

    private void cadastrar(int[] vetor)
    {
        for(int i = 0; i < vetor.length; i++){
            vetor[i] =  Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º número do vetor: \n"));
        }
    }

    private void ordenar(int[] vetor)
    {
        long tempoInicial = System.currentTimeMillis();
        int n = vetor.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < (n - i -1); j++){
                if(vetor[j] > vetor[j+1]){
                    int auxiliar = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = auxiliar;
                }
            }
        }
        long tempoFinal = System.currentTimeMillis();
        long tempoTotal = tempoFinal - tempoInicial;
        System.out.println("0 tempo final é de: " + tempoTotal);
    }

    private void mostrar(int[] vetor)
    {
        StringBuilder resultado = new StringBuilder("Vetor ordenado: [");
        for(int i = 0; i < vetor.length; i++)
        {
            if(i == 0)
            resultado.append(" ").append(vetor[i]);
            else
                resultado.append("; ").append(vetor[i]);
        }
        resultado.append("]");
        JOptionPane.showMessageDialog(null, resultado);

    }

}
