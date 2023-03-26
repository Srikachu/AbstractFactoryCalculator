public class FabricaOperacionBasic extends FabricaOperacionAbstract {
  @Override
  public SumaAbstract generarSuma(){
    SumaAbstract suma=new SumaBasic();
    return suma;
  }
  @Override
  public RestaAbstract generarResta(){
    RestaAbstract resta=new RestaBasic();
    return resta;
  }
  @Override
  public MultiplicacionAbstract generarMulti(){
    MultiplicacionAbstract multi=new MultiplicacionBasic();
    return multi;
  }
  @Override
  public DivisionAbstract generarDiv(){
    DivisionAbstract div=new DivisionBasic();
    return div;
  }
}