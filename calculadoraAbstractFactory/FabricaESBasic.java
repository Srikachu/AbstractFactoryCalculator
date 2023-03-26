public class FabricaESBasic extends FabricaESAbstract{
  @Override
  public EntradaAbstract generarEntrada(){
    EntradaAbstract entrada=new EntradaBasic();
    return entrada;
   }

  @Override
  public SalidaAbstract generarSalida(){
    SalidaAbstract salida=new SalidaBasic();
    return salida;
  }
  
}