public class Cliente{
  FabricaESAbstract objFabricaES=new FabricaESBasic();
  SalidaAbstract objSalida;
  EntradaAbstract objEntrada;
  FabricaOperacionAbstract objFabricaOperacion=new FabricaOperacionBasic();
  SumaAbstract objSuma;
  RestaAbstract objResta;
  MultiplicacionAbstract objMulti;
  DivisionAbstract objDiv;
  int opcion;
  float num1,num2, resultado;
  public Cliente(){
    objSalida=objFabricaES.generarSalida();
    objEntrada=objFabricaES.generarEntrada();
    do{
      objSalida.imprimir("1.Suma");
      objSalida.imprimir("2.Resta");
      objSalida.imprimir("3.Multiplicacion");
      objSalida.imprimir("4. Division");
      objSalida.imprimir("-1. salir");
      objSalida.imprimir("Ingrese la opcion: ");
      
      opcion=objEntrada.capturar();
      if(opcion!=-1){
         objSalida.imprimir("Ingrese un numero:");
         num1=objEntrada.capturar();
         objSalida.imprimir("Ingrese un numero:");
         num2=objEntrada.capturar();
         switch(opcion){
            case 1:
                objSuma=objFabricaOperacion.generarSuma();
                resultado=objSuma.operar(num1,num2);
                break;
            case 2:
                objResta=objFabricaOperacion.generarResta();
                resultado=objResta.operar(num1,num2);
                break;
            case 3:
                objMulti=objFabricaOperacion.generarMulti();
                resultado=objMulti.operar(num1,num2);
                break;
            case 4:
                objDiv=objFabricaOperacion.generarDiv();
                resultado=objDiv.operar(num1,num2);
                break;
         }
        objSalida.imprimir("Resultado:"+resultado);
      }else if(opcion==-1){
         objSalida.imprimir("Esta saliendo");
      }else{
         objSalida.imprimir("Opcion no disponible");
      }
    }while(opcion!=-1);
  }
}