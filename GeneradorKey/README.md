# Generador de Keys Aleatorias en Java

Esta aplicación es un **generador básico de claves aleatorias** desarrollado en **Java**, que permite crear *keys* de una longitud definida por el usuario utilizando letras minúsculas, mayúsculas y números.

---

## 📌 Descripción

El programa genera una clave aleatoria combinando:

* Letras minúsculas (`a–z`)
* Letras mayúsculas (`A–Z`)
* Números (`0–9`)

En total, se utilizan **62 caracteres posibles**.
La longitud de la clave se define como parámetro al llamar al método `generarKey`.

---

## 🚀 Uso

En el método `main`, se puede generar una key indicando su longitud:

```java
generarKey(10);
```

Esto generará y mostrará por consola una clave aleatoria de **10 caracteres**.

---

## ⚙️ Funcionamiento

* Se utiliza la clase `Random` para generar índices aleatorios.
* Cada índice corresponde a un carácter dentro de un arreglo de 62 posiciones.
* En cada iteración se concatena un carácter aleatorio hasta completar la longitud solicitada.

---

## 🧠 Ejemplo de salida

```
-Generador de Keys Aleatorias-
Key generada: aZ3F9kP2Lm
```

---

## 🛠️ Requisitos

* Java 17 o superior (por el uso de `nextInt(0, 62)`)


---
