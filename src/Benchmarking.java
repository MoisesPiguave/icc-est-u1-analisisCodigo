import java.util.Random;
public class Benchmarking {
     private MetodosOrdenamiento metodosOrdenamiento;
    public Benchmarking(){
        //long inicioMillis=System.currentTimeMillis();
        //long inicioNano=System.nanoTime();
        //System.out.println(inicioMillis);
        //System.out.println(inicioNano);
        metodosOrdenamiento = new MetodosOrdenamiento();
        int[] arreglo = generarArregloAleatorio(1000000);
        Runnable tarea = () -> metodosOrdenamiento.burbujaTradicional(arreglo);

        double tiempoNano= medirConNanoTime(tarea);
        double tiempoMillis = medircurrentTimeMillis(tarea);
        System.out.println("Tiempo con nano time"+ tiempoNano + "segundos");
        System.out.println("Tiempo con currentTimeMillis:"+ tiempoMillis+"segundos");
    
    }


    private int[] generarArregloAleatorio( int tamano){
        int [] arreglo = new int [tamano];
        Random ramdom = new Random();
        for ( int i =0 ; i < tamano ; i++){
            arreglo[i] = ramdom.nextInt(100_000);
        }
        return arreglo;
    }

    public double medirConNanoTime(Runnable tarea){
        long inicio = System.nanoTime();
        tarea.run();
        long fin = System.nanoTime();
        return ( fin - inicio)/ 1_000_000_000.0;
    }

    public double medircurrentTimeMillis(Runnable tarea){
        long inicio = System.currentTimeMillis();
        tarea.run();
        long fin = System.currentTimeMillis();
        return(fin - inicio)/ 1000.0;
    }
}
