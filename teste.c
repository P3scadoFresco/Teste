#include <stdio.h>
#include <stdbool.h>
#include <string.h>

bool fim(char palavra[]) {
    bool resultado = true;
    
    if(strlen(palavra) >= 3 && palavra[0] == 'F' && palavra[1] == 'I' && palavra[2] == 'M') {
        resultado = false;
    }
    
    return resultado;
}

bool palidromo(char palavra[]) {
    int tamanho = strlen(palavra);
    bool resultado = true;
    
    for(int i = 0; i < tamanho / 2; i++) {
        if(palavra[tamanho - 1 - i] != palavra[i]) {
            resultado = false;
        }
    }
    
    return resultado;
}

int main() {
    char palavra[1000];
    
    fgets(palavra, sizeof(palavra), stdin);
    
    // Remove o '\n' do final da string
    palavra[strcspn(palavra, "\n")] = '\0';
    
    while(fim(palavra)) {
        if(palidromo(palavra)) {
            printf("SIM\n");
        } else {
            printf("NAO\n");
        }
        
        fgets(palavra, sizeof(palavra), stdin);
        palavra[strcspn(palavra, "\n")] = '\0';
    }
    
    return 0;
}