import javax.swing.*;
import java.lang.Math;

public class OrdenacaoService {

    public void ordenar()
    {
        int tamanho = 10;

        int[] vetor = new int[tamanho];

        cadastrar(vetor);

        int menu = 0;

        while(menu != 4)
        {
            menu = Integer.parseInt(
                JOptionPane.showInputDialog("Digite: \n"
                + "1 - Mostrar Vetor \n2 - Ordenar com BubbleSort" + 
                "\n3 - Ordenar com MergeSort \n4 - Sair"));

            switch (menu)
            {
                case 1:
                    mostrar(vetor);
                    break;
                case 2:
                    ordenarBubble(vetor);
                    break;
                case 3:
                    mergeSort(vetor, 0, (vetor.length - 1));
                    break;
                default:
                    break;
            }
        }

    }

    private void cadastrar(int[] vetor)
    {
        for(int i = 0; i < vetor.length; i++){
            vetor[i] =  Integer.parseInt(
                            JOptionPane.showInputDialog("Digite o " + (i+1) + 
                            "º número do vetor: \n"));
        }
    }

    private void ordenarBubble(int[] vetor)
    {
        long tempoInicial = System.currentTimeMillis();
        int elementos = vetor.length;
        for(int i = 0; i < elementos; i++)
        {
            for(int j = 0; j < (elementos - i -1); j++)
            {
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

    private void mergeSort(int[] vetor, int posicaoInicial, int posicaoFinal)
    {
        int meio;

        int[] auxiliar = new int[vetor.length];

        if(posicaoInicial < posicaoFinal)
        {
            meio = (posicaoInicial + posicaoFinal)/ 2;
            mergeSort(vetor, posicaoInicial, meio);
            mergeSort(vetor, (meio + 1), posicaoFinal);
            
            int i = posicaoInicial;
            int j = meio + 1;
            int k = posicaoInicial;

            while(i <= meio && j <= posicaoFinal)
            {
                if(vetor[i] < vetor[j])
                {
                    auxiliar[k] = vetor[i];
                    i++;
                }
                else
                {
                    auxiliar[k] = vetor[j];
                    j++;
                }

                k++;    
            }

            while(i <= meio)
            {
                auxiliar[k] = vetor[i];
                i++;
                j++;
            }

            while(j <= posicaoFinal)
            {
                auxiliar[k] = vetor[j];
                j++;
                k++;
            }

            for(int p = posicaoInicial; p <= posicaoFinal; p++)
            {
                vetor[i] = auxiliar[i];
            }
        }
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
