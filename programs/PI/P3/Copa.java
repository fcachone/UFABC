import java.util.Scanner;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
class Copa{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ArrayList<String> nomePaises = new ArrayList<String>(n*2);
        Dictionary<String,Integer> selecoes = new Hashtable<String,Integer>();

        for(int i=0; i < n;i++){
            String pais1 = scan.next();
            int golsPais1 = scan.nextInt();

            scan.next();

            int golsPais2 = scan.nextInt();
            String pais2 = scan.next();

            if( !nomePaises.contains(pais1) ){
                nomePaises.add(pais1);
                selecoes.put(pais1,0);
            }
            if( !nomePaises.contains(pais2) ){
                nomePaises.add(pais2);
                selecoes.put(pais2,0);
            }

            if(golsPais1 > golsPais2){
                int ptsPais1 = selecoes.get(pais1) + 3;
                selecoes.put(pais1,ptsPais1);
            }

            else if(golsPais2 > golsPais1){
                int ptsPais2 = selecoes.get(pais2) + 3;
                selecoes.put(pais2,ptsPais2);
            }

            else if(golsPais2 == golsPais1){
                int ptsPais1 = selecoes.get(pais1) + 1;
                selecoes.put(pais1,ptsPais1);

                int ptsPais2 = selecoes.get(pais2) + 1;
                selecoes.put(pais2,ptsPais2);
            }
        }
        scan.nextLine();
        for(int i=0; i<4; i++){
            String paisSolicitado = scan.next();
            int ptsPaisSolicitado = 0;
            if(nomePaises.contains(paisSolicitado)){
                ptsPaisSolicitado = selecoes.get(paisSolicitado);
            }

            System.out.println(paisSolicitado+" "+ptsPaisSolicitado);
        }
    }
}