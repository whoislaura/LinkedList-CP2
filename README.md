# LinkedList-CP2

Clase Práctica de la asignatura Estructura de Datos para la implementación y manipulación de una lista simplemente enlazada en Java.

## Descripción

El proyecto implementa una lista simplemente enlazada genérica utilizando nodos enlazados. Su objetivo es aplicar los conceptos fundamentales de las estructuras de datos dinámicas y resolver las operaciones solicitadas en la clase práctica:

1. Eliminar los elementos repetidos de una lista.
2. Rotar los elementos una posición hacia la derecha.
3. Concatenar dos listas.

También se incluyen operaciones básicas como agregar, eliminar, consultar, limpiar la lista y verificar si está vacía.

## Estructura del proyecto

```text
src/
├── IList.java
├── LinkedList.java
├── Main.java
└── Node.java
```

- `Node.java`: representa cada nodo de la lista y almacena un valor y una referencia al siguiente nodo.
- `IList.java`: define las operaciones básicas que debe implementar la lista.
- `LinkedList.java`: contiene la implementación de la lista simplemente enlazada.
- `Main.java`: contiene un ejemplo de ejecución de las operaciones principales.

## Operaciones principales

### Eliminar elementos repetidos

Recorre la lista y elimina los elementos que aparecen más de una vez, conservando una sola ocurrencia de cada valor.

### Rotar hacia la derecha

Desplaza todos los elementos una posición hacia la derecha. El último elemento pasa a ocupar la primera posición.

Por ejemplo:

```text
[A, B, C, D] → [D, A, B, C]
```

### Concatenar dos listas

Agrega los elementos de una segunda lista al final de la primera.

Por ejemplo:

```text
Lista 1: [A, B, C]
Lista 2: [D, E]

Resultado: [A, B, C, D, E]
```

## Tecnologías utilizadas

- Java
- Programación orientada a objetos
- Tipos genéricos
- Lista simplemente enlazada

## Compilación y ejecución

Desde la carpeta raíz del proyecto, ejecutar:

```bash
javac -d out src/*.java
java -cp out Main
```

En Windows PowerShell también se puede utilizar:

```powershell
javac -d out src\*.java
java -cp out Main
```

## Contexto académico

Este repositorio corresponde a una clase práctica de Estructura de Datos realizada como parte de la formación en Ingeniería Informática.
