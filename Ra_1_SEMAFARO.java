//alunos: Anderson Mendes Munhoz, Henrique Kasprzak Bernardo, Nilson de Araujo Souza Junior.

public class Ra_1_SEMAFARO {
    private int cor = 2;
     
    public void mudaCor()
    {
        if(cor==0) {
            cor = 1;
            
            System.out.printf("amarelo ");
        }
        if (cor==1) {
            cor = 2;
            System.out.printf("vermelho ");
        } 
        else {
            cor = 0;
            System.out.printf("verde ");
         } 

    }

    public void mudaCorFixa(int valorCor){
        this.cor = valorCor;

    }
    public int mostraCor(){
        return getCor(); 
}

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
       this.cor = cor;
    }



    
    
}
