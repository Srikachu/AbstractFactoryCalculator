import java.util.Scanner; 
public class EntradaBasic extends EntradaAbstract{
  Scanner entrada= new Scanner(System.in);
  @Override
  public EntradaAbstract generarEntrada(){
    EntradaAbstract entrada=new EntradaBasic();
    return entrada;
  }
  @Override
  public int capturar(){
    String numero=entrada.nextLine();
    int resultado=Integer.parseInt(numero);
    return resultado;
  }
}