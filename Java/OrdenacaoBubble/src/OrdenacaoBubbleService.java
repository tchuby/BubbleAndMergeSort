import javax.swing.*;

public class OrdenacaoBubbleService {

    public void ordenarBubble()
    {
        int tamanho = 10;

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
