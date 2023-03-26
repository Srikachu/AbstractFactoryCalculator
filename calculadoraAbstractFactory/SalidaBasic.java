
public class SalidaBasic extends SalidaAbstract{
  @Override
   public SalidaAbstract generarSalida(){
    SalidaAbstract salida=new SalidaBasic();
    return salida;
  }
  @Override
  public void imprimir(String texto){
    System.out.println(texto);
  }
}