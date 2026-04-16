from collections import deque

altaPrio=deque()
bajaPrio=deque()

def mostrarCola():
    print("Alta prioridad:", list(altaPrio),"\n")
    print("Baja prioridad:", list(bajaPrio),"\n")

def agregarTarea(tarea, prioridad):
    if prioridad == "alta":
        altaPrio.append(tarea)
    elif prioridad == "baja":
        bajaPrio.append(tarea)
    mostrarCola()

def eliminarTarea():
    if altaPrio:
        tarea = altaPrio.popleft()
        print(f"Tarea eliminada: {tarea}\n")
    elif bajaPrio:
        tarea = bajaPrio.popleft()
        print(f"Tarea eliminada: {tarea}\n")
    else:
        print("No hay tareas en la cola.")
    mostrarCola()

#ejemplo de uso:
agregarTarea("Tarea de Estructuras", "alta")
agregarTarea("Estudiar Física", "alta")
agregarTarea("MVC de Paradigmas", "alta")
agregarTarea("Tocar guitarra", "baja")
agregarTarea("Jugar", "baja")
agregarTarea("Estudiar para Modelacion matematica", "alta")
eliminarTarea()
eliminarTarea()
eliminarTarea()
eliminarTarea()
eliminarTarea()
eliminarTarea()
