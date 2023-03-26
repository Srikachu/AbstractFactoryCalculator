public class MultiplicacionBasic extends MultiplicacionAbstract{
  @Override
  public MultiplicacionAbstract generarMulti(){
    MultiplicacionAbstract multi=new MultiplicacionBasic();
    return multi;
  }
  @Override
  public float operar(float num1, float num2){
    return num1*num2;
  }
}