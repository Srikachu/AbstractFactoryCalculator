
public class DivisionBasic extends DivisionAbstract{
  @Override
  public DivisionAbstract generarDiv(){
    DivisionAbstract div=new DivisionBasic();
    return div;
  }
  @Override
  public float operar(float num1, float num2){
    if(num2==0){
      return 0;
    }
    return num1/num2;
  }
}
