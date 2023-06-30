programa
{
	
	funcao inicio()
	{
		real vetor[10], entrada, temporario
		cadeia saida = ""
		
		para(inteiro i = 0; i < 10; i++)
		{
			escreva("Informe o " + (i + 1) + "º número do vetor: \n")
			leia(entrada)
			vetor[i] = entrada
		}
		
		para(inteiro i = 0; i < 10; i++)
		{
			para(inteiro j = 0; j < (i - 1); j++)
			{
				se(vetor[j] > vetor[j+1])
				{
					temporario = vetor[j+1]
					vetor[j+1] = vetor[j]
					vetor[j] = temporario	
				}
			}
		}

		para(inteiro i = 0; i < 10; i++)
		{
			se(i == 0)
			{
				saida = saida + vetor[i]
			}
			senao
			{
				saida = saida + "; " + vetor[i]
			}
		}

		escreva("Vetor ordenado: [" + saida + "]")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 523; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 6, 7, 5}-{temporario, 6, 27, 10}-{saida, 7, 9, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */