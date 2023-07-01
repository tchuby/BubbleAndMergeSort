programa{

  funcao merge_sort(inteiro vetor[], inteiro ini, inteiro fim){
    inteiro meio, i, j, k, aux[10]
  
    se(ini < fim){
      meio = (ini + fim) / 2
      merge_sort(vetor, ini, meio)
      merge_sort(vetor, meio + 1, fim)

    
      i = ini
      j = meio + 1
      k = ini

      enquanto(i <= meio e j <= fim){
        se(vetor[i] < vetor[j]){
          aux[k] = vetor[i]
          i++
        
        }
        senao{
          aux[k] = vetor[j]
          j++
          
        }
        k++
      }

      enquanto(i <= meio){
        aux[k] = vetor[i]
        i++
        k++
      }
      enquanto(j <= fim){
        aux[k] = vetor[j]
        j++
        k++
      }

      para(i = ini; i <= fim; i++)
        vetor[i] = aux[i]
    }
   
  }
  
  
  funcao inicio(){

  	//inteiro vetor[10] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, valor

  	inteiro vetor[10], valor

  	para(inteiro i = 0; i < 10; i++){
  		escreva("Informe o ",(i+1),"° valor do vetor: ")
  		leia(valor)
  		vetor[i] = valor
  	}

  

	escreva("Vetor original: ")
  	para(inteiro i = 0; i < 10; i++){
  		escreva(vetor[i], " ")
  	}
    

    merge_sort(vetor, 0, 9)

    escreva("\nVetor ordenado: ")
  	para(inteiro i = 0; i < 10; i++){
  		escreva(vetor[i], " ")
  	}
  }

  
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 884; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 3, 28, 5}-{aux, 4, 27, 3}-{vetor, 52, 11, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */