# 🌐 Máquina de Turing - Simulación del Problema de Parar

Este proyecto implementa una **simulación conceptual del "Problema de Parar"** planteado por Alan Turing en 1936. Utilizando Java y tres patrones de diseño creacionales, el objetivo es mostrar la **indecidibilidad de ciertos problemas computacionales** de manera práctica y estructurada.

---

## ⚙️ Tecnologías utilizadas

- Java 17
- Maven
- IntelliJ IDEA
- Git + GitHub
- JUnit 5
- Swing (para GUI básica)

---

## 🎯 Objetivos del proyecto

- Comprender el problema de parar y su naturaleza indecidible
- Simular la lógica con programas que se detienen y otros que no lo hacen
- Implementar tres soluciones distintas utilizando patrones creacionales:
    - Abstract Factory
    - Builder
    - Prototype
- Unificar todo en un menú comparativo interactivo
- Reflexionar sobre los límites de la computación

---

## 📁 Estructura del proyecto

El proyecto se estructura de la siguiente manera:

```
src/
├── main/
│   └── java/
│       ├── builder/
│       │   ├── ConcreteCountDownBuilder.java
│       │   ├── ConcreteCountUpBuilder.java
│       │   ├── Director.java
│       │   └── ProgramBuilder.java
│       │
│       ├── common/
│       │   ├── HaltChecker.java
│       │   ├── Program.java
│       │   └── Reverser.java
│       │
│       ├── factory/
│       │   ├── CountDownFactory.java
│       │   ├── CountDownProgram.java
│       │   ├── CountUpFactory.java
│       │   ├── CountUpProgram.java
│       │   └── ProgramFactory.java
│       │
│       ├── Prototype/
│       │   ├── cache/
│       │   │   └── BundledShapeCache.java
│       │   └── shapes/
│       │       ├── Circle.java
│       │       ├── Rectangle.java
│       │       └── Shape.java
│       │
│       ├── selectors/
│       │   ├── AbstractFactorySelector.java
│       │   ├── BuilderSelector.java
│       │   ├── ProgramSelector.java
│       │   └── PrototypeSelector.java
│       │
│       └── main/
│           └── Main.java
│
├── test/
│   └── java/
│       ├── builder/
│       │   ├── ConcreteCountDownBuilderTest.java
│       │   ├── ConcreteCountUpBuilderTest.java
│       │   └── DirectorTest.java
│       │
│       ├── common/
│       │   ├── HaltCheckerTest.java
│       │   └── ReverserTest.java
│       │
│       ├── program/
│       │   ├── CountDownProgramTest.java
│       │   └── CountUpProgramTest.java
│       │
│       ├── Prototype/
│       │   ├── cache/
│       │   │   └── BundledShapeCacheTest.java
│       │   └── shapes/
│       │       ├── CircleTest.java
│       │       ├── RectangleTest.java
│       │       └── ShapeTest.java
│       │
│       └── selector/
│           └── ProgramSelectorTest.java
│
└── Docs/
    └── UMLs/
        ├── Actividades.puml
        ├── Clases.puml
        └── Objeto.puml

```

---

## 🧠 ¿Qué es el problema de parar?

El **problema de parar** pregunta:
> “¿Existe un algoritmo que pueda determinar si cualquier programa termina o entra en bucle infinito?”

Turing demostró que la respuesta es **no**.  
Este proyecto simula dicha situación con tres programas:

| Programa   | Descripción                                       |
|------------|---------------------------------------------------|
| `CountDown`| Cuenta hacia abajo hasta 0 → **se detiene** ✅     |
| `CountUp`  | Cuenta hacia arriba indefinidamente → **no** ❌    |
| `Reverser` | Evalúa otro programa usando `HaltChecker`. Si se detiene → entra en bucle; si no → termina 🔁 |

---

## 🧪 Pruebas unitarias
 Ejecutables con:

```bash

mvn test
```

#### Pruebas separadas por patrón y clase

#### Incluye:

- Verificación de ejecución de CountDown / CountUp

- Funcionamiento de Reverser y HaltChecker

- Tests de fábrica, builder, clonado

- Test del ProgramSelector y menú

##  Link al repositorio de GitHub

[https://github.com/maquina-turing/MaquinaTuring](https://github.com/dxn1l/MaquinaTuring)



