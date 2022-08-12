import java.util.ArrayList;
import java.util.Iterator;


public class prueba
{
   static class elemento
   {
      public int atr1;

      public elemento(int parm) { atr1 = parm; }

      public int getElemento() { return(atr1); }
   }

   // Ejemplo de uso de Generics.
   static public class VectorSim<Item>
   {
      private Item arrSt;

      public VectorSim(Item arrPar) { arrSt = arrPar; }

      public Item getVector() { return(arrSt); }
   }

   /* Ejemplo de sobrecarga de metodos. Dos o mas metodos pudieran tener el mismo nombre pero manejar tipos de datos
      diferentes. El compilador de Java se encarga de detectar cual metodo invocar dependiendo del tipo de dato usado 
      como argumento en la invocacion.                                                                                */
   static int suma(int oper1, int oper2) { return(oper1 + oper2); }
   static double suma(double oper1, double oper2) { return(oper1 + oper2); }

   public static void main(String[] args)
   {
      // Ejemplo de ArrayList y uso de iteradores.
      ArrayList<String> cars = new ArrayList<String>();

      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");

      Iterator<String> it = cars.iterator();

      while(it.hasNext()) System.out.println(it.next());


      // Ejemplo de una ArrayList de objetos (clases).
      ArrayList<elemento> elementos = new ArrayList<elemento>();

      // Cada vez que se adiciona un elemento, se debe invocar el constructor (es decir: usar "new...").
      elementos.add(new elemento(10));
      elementos.add(new elemento(15));
      elementos.add(new elemento(20));

      Iterator<elemento> it2 = elementos.iterator();

      while(it2.hasNext()) System.out.println("Elemento[0]: " + it2.next().getElemento());


      // Ejemplo de sobrecarga de metodos.
      System.out.println("Resultado: " + suma(2.4, 3.9));


      // Simulacion de apuntadores. En JAVA no existe ese concepto.
      elemento a;
      elemento b;

      a = new elemento(40);
      b = new elemento(60);

      a = b;   // Asigna la direccion de la segunda instancia de la clase elementos (b) a la primera instancia (a).

      System.out.println("Valor de a: " + a.getElemento());


      // Ejemplo de Generics.
      int[] c = {1, 2, 3, 4, 5, 6, 7, 8};

      VectorSim<int[]> v = new VectorSim<int[]>(c);

      System.out.println("Valor del vector s: " + v.getVector()[0]);
   }
}
