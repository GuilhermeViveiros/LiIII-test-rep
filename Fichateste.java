
/**
 * Escreva a descrição da classe fichateste aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;

public class Fichateste
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
   
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        Ficha1 f = new Ficha1();
        
        //
        System.out.println("Introduza temperatura C");
        float tc = s.nextFloat();
        float tf = f.celsiusparaFarenheit(tc);
        System.out.println("A temperatura de" + tc + " C corresponde a" + tf + "F");
        
        int fst = s.nextInt();
        int snd = s.nextInt();
        
        int sol = f.max2(fst,snd);
        System.out.println(sol);
        
        System.out.println( f.criaDescricaoConta("meunome", (float)64.2) );
    }
}
