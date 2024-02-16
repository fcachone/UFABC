import java.util.Scanner;

class Borboletas{
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int N = entrada.nextInt();
    int Aux = N * 2;
    int Mat[][] = new int[N][N];
    int Vetor[] = new int[Aux];
    int VetResp[] = new int[Aux];

    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            Mat[i][j] = entrada.nextInt();
        }
    }

    for(int j=0;j<Aux;j++){
        int P1 = entrada.nextInt();
        int P2 = entrada.nextInt();
        P1 = P1 - 1;
        P2 = P2 - 1;
        Vetor[j] = Mat[P1][P2];
    }

    int Cont = 0,ContaRep = 0,Qtd=0;

    for(int j=0;j<Aux;j++){
        int X = Vetor[j];
        ContaRep = 0;

        for(int m=0;m<Aux;m++){
                if(X==Vetor[m]){
                    if(ContaRep==0){
                        VetResp[Cont] = m;
                        ContaRep = ContaRep + 1;
                        Cont = Cont + 1;
                    }
                }
            }
    }

    for(int k=0;k<Aux;k++){
        if(k==VetResp[k]){
            Qtd = Qtd + 1;
        }
    }



    System.out.println(Qtd);



    }
}