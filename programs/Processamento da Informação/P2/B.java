import java.util.Scanner;

public class EuQueroNove
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String resp;
        int qtd_atv,qtd_rank,i,j,k,aux,a;



        qtd_atv=scan.nextInt();
        qtd_rank=scan.nextInt();


        while((qtd_atv!=0)&&(qtd_rank!=0))
        {

            resp="";
            a=0;

            int tabela[][] = new int[qtd_rank][qtd_atv];
            int rank1[] = new int[10000];
            int rank2[] = new int[10000];


            for(j=0;j<qtd_atv;j++)
            {
                for(i=0;i<qtd_rank;i++)
                {
                    tabela[i][j]=scan.nextInt();
                }
            }


            for(k=0;k<10000;k++)
            {
                for(i=0;i<qtd_rank;i++)
                {
                    {
                        for(j=0;j<qtd_atv;j++)
                        {
                            if(tabela[i][j]==k+1)
                            {
                                rank1[k]=rank1[k]+1;
                                rank2[k]=rank2[k]+1;
                            }

                        }
                    }
                }
            }

            for(i=0;i<10000;i++)
            {
                for(j=0;j<10000;j++)
                {

                    if(rank2[i]>rank2[j])
                    {
                        aux=rank2[j];
                        rank2[j]=rank2[i];
                        rank2[i]=aux;
                    }
                }
            }

            for(i=0;i<10000;i++)
            {
                if((rank2[1]==rank1[i])&&(a==0))
                {
                    resp=String.valueOf(i+1);
                    a=1;

                }

                else
                {
                    if((rank2[1]==rank1[i])&&(a==1))
                    {
                        resp=resp + " " + String.valueOf(i+1);

                    }
                }

            }

            System.out.println(resp);

            qtd_atv=scan.nextInt();
            qtd_rank=scan.nextInt();


        }
    }
}