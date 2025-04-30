import random;
import time;
import metodos_ordenamiento as mo ;
class Benchmarking():
    def __init__(self):
        print('Bench inicializado')
        arreglo= self.build_arreglo(1000)
        self.mOrdenamiento= mo.MetodosOrdenamiento()
        tarea= lambda: self.mOrdenamiento.sortByBubble(arreglo)
        tiempoMillis = self.contar_con_current_time_milles(tarea)
        tiempoNano = self.contar_con_nano_time(tarea)
        print(f'Tiempo{tiempoMillis}')
        print(f'Tiempo{tiempoNano}')

    def build_arreglo(self,tamanio):
        array=[]
        for i in range(tamanio):
            numero = random.randint(0,99999)
            array.append(numero)
        return array   

    def contar_con_current_time_milles(self, tarea):
        x= time.time()
        tarea()
        fin = time.time()
        return fin-x


    def contar_con_nano_time(self,tarea):
        x= time.time_ns()
        tarea()
        fin = time.time_ns()
        return  fin -x

            