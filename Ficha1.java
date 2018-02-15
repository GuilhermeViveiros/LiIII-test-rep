
/**
 * Escreva a descrição da classe Ficha1 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Ficha1
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
   public float celsiusparaFarenheit(float graus) {
    
    return graus*(float)1.8 + (float)32.0;
    }
    
   public int max2(int x, int y) {
    
        if(x>=y)
            return x;
            
        return y;
    }
   
   public String criaDescricaoConta(String nome, float saldo) {
       
       return ( "escrever no ecra" + nome + " " + saldo + "disto" );
    }
    
    
}
