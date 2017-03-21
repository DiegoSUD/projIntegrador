package pinteg1;

public class Temperatura {
    public static void main(String [] args){
        //Entrada
        double f = 212;
        
       //Processamento
       /* Quando eu coloco o (.0) ele se torna numeros
       inteiros ou seja ele traz a divisão inteira pq é double*/
       // Temperatura é sempre do tipo de variavel real
        double c = (5.0/9.0)*(f-32);
        
        //saída
        System.out.println(f + "ºF = " + c + "ºC");
        
        // Sempre lê da esquerda para direita, para alterar isso é so acrestar()
        System.out.println("2+2 ="+2+2);
    
    
    
    }
}
