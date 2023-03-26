public class RestaBasic extends RestaAbstract{
  @Override
  public RestaAbstract generarResta(){
    RestaAbstract resta=new RestaBasic();
    return resta;
  }
  @Override
  public float operar(float num1, float num2){
    return num1-num2;
  }
}