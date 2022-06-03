
package textanalizer;


public class TextAnalizer {

   public static InterfazServidor interfazServidor=new InterfazServidor();
   public static errores.ErroresLexicos erroresLexicos= new errores.ErroresLexicos();
   public static errores.ErroresSemanticos erroresSemanticos=new errores.ErroresSemanticos();
   public static errores.ErroresSintacticos erroresSintacticos=new errores.ErroresSintacticos();
   public static Datos.ListaProyectos listaProyectos = new Datos.ListaProyectos();
   public static Datos.ListaVarRef listaVarRef = new Datos.ListaVarRef();
   public static Datos.ListaVariables listaVariables = new Datos.ListaVariables();
   
    public static void main(String[] args) {
        interfazServidor.correrInterfaz();
    }
    
}
