/*
public class script{
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
 */

/*
public class script{
    public static void main(String args[]) {
        int idade = 20;
        double salario = 1000;
        boolean isMaiorIdade = idade >= 18;

        if(isMaiorIdade = idade >= 18 ){
            System.out.println("Maior de idade");
        }
        if(!isMaiorIdade){
            System.out.println("Menor de idade");
        }
    }
}    
 */

/*
public class script{
    public static void main(String[] args) {
        int idade = 12;

        if(idade >= 18){
            System.out.println("Maior de Idade");
        }else if (idade < 18){
            System.out.println("Menor de Idade");
        }
   }
}

 */

/*
public class script{
public static void main(String[] args) {
    int numero = 120;

    if (numero > 0 ){
        System.out.println("Numero positivo");
    }else if(numero < 0 ){
        System.out.println("numero negativo voce é preto");
    }else{
        System.out.println("Zero");
    }
}
}

 */

/*
public class script{
    public static void main(String[] args) {
            int idade = 18;

            if (idade >= 18){
                System.out.println("Pode dirigir Parabens");
            }else if(idade < 18){
                System.out.println("Nao podi dirigir , sinto muito ");
            }else{
                System.out.println("Esperar a idade necessaria");
            }
    }
}

*/



public class script{
    // utilizando switch e dados os valores de 1  a 7 , imprima se  é dia util ou final de semana 
    // Considernando 1 como domingo
    public static void main(String[] args) {
        byte dia = 1 ;
        switch(dia){
            case 1 :
            case 7 :
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Opçao Invalida");
        }
    }   
}


