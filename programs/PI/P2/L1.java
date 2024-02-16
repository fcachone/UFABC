import java.util.Scanner;

public class BackToTheFuture
{
    public static void main(String[] args)
    {
        int D, diamax = 0, M, A, anobi = 0, cont = 0, testes, comandos, soma=0, sub=0, i;
        String sinais, sinal;
        Scanner scan = new Scanner(System.in);

        testes = scan.nextInt();

        while(testes<0 || testes>20)
        {
            System.out.println("Digite o valor de testes novamente");
            testes = scan.nextInt();
        }

        while(cont<testes)
        {
            D = scan.nextInt();

            while(D < 1 || D > 31)
            {
                System.out.println("Digite o valor de D entre 1 e 31");
                D = scan.nextInt();
            }

            M = scan.nextInt();
            while(M < 1 || M > 12)
            {
                System.out.println("Digite o valor de M entre 1 e 12");
                M = scan.nextInt();
            }

            A = scan.nextInt();

            if((A % 4 == 0 && A % 100 != 0) || (A % 400 == 0))
            {
                anobi = 1;
            }

            else
            {
                anobi = 0;
            }

            if(M== 1 || M == 3 || M == 5 || M == 7 || M == 8 || M == 10 || M == 12)
            {
                diamax = 31;
            }

            else if(M == 2)
            {
                if(anobi == 0)
                {
                    diamax = 28;
                }
                else
                {
                    diamax = 29;
                }
            }

            else
            {
                diamax = 30;
            }

            comandos = scan.nextInt();

            sinal = scan.next();

            for(i=0; i<comandos; i++)
            {
                char c = sinal.charAt(i);

                if(c == '>')
                {
                    soma++;
                }

                else if(c == '<')
                {
                    sub++;
                }
            }

            if(soma>sub)
            {
                soma = soma - sub;

                for(i=0; i<soma; i++)
                {
                    D++;

                    if(D>28 && M==2 && anobi==0)
                    {
                        D = 1;
                        M++;
                    }

                    else if(D>29 && M==2 && anobi==1)
                    {
                        D=1;
                        M++;
                    }

                    else if(D>31 && (M==1 || M==3 || M==5 || M==7 || M==8 || M==10 || M==12))
                    {
                        D = 1;

                        if(M == 12)
                        {
                            M = 1;
                            A++;
                        }

                        else
                        {
                            M++;
                        }

                    }

                    else if(D>30 && (M==4 || M==6 || M==9 || M==11))
                    {
                        D = 1;
                        M++;
                    }

                }
            }

            else
            {
                sub = sub - soma;

                for(i=0; i<sub; i++)
                {
                    D--;

                    if(D<1 && M==3 && anobi==0)
                    {
                        D = 28;
                        M--;
                    }

                    else if(D<1 && M==3 && anobi==1)
                    {
                        D = 29;
                        M--;
                    }

                    else if(D<1 && (M==1 || M==2|| M==4 || M==6 || M==8 || M==9 || M==11 ))
                    {
                        D = 31;

                        if(M == 1)
                        {
                            M = 12;
                            A--;
                        }

                        else
                        {
                            M--;
                        }

                    }

                    else if(D<1 && (M==5 || M==7 || M==10 || M==12))
                    {
                        D = 30;
                        M--;

                    }

                }
            }

            System.out.println(D + "/"+ M + "/"+ A);
            cont++;
            soma=0;
            sub=0;
        }
    }
}