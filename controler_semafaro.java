//alunos: Anderson Mendes Munhoz, Henrique Kasprzak Bernardo, Nilson de Araujo Souza Junior. 

public class controler_semafaro {
    public static void main(String[] args){
        Ra_1_SEMAFARO semafaro = new Ra_1_SEMAFARO();
        
        //imprime cor semafaro

       System.out.println(semafaro.mostraCor());
       for(int i=0; i<=9; i++){
           semafaro.mudaCor();
        }  
        
           semafaro.mudaCorFixa(1);

           if(semafaro.mostraCor() == 1){
            System.out.println("Amarelo");
        }
}
    }
