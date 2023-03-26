public class SumaBasic extends SumaAbstract{
  @Override
  public SumaAbstract generarSuma(){
    SumaAbstract suma=new SumaBasic();
    return suma;
  }
  @Override
  public float operar(float num1, float num2){
    return num1+num2;
  }
}