# progra2labs

### Flujo de trabajo Git

Paso 1, regresar a `main`:

```bash
git switch main
```

Paso 2, actualizar `main`:

```bash
git pull
```

Paso 3, crear rama de trabajo desde `main`:

```bash
git switch -c lab1
```

Paso 4, realizar cambios para el respectivo lab

Paso 5, verificar cambios en la rama

```bash
git status
git diff
```

Paso 6, verificar los test y coding standars:

```bash
./gradlew clean test
```

Paso 7, agregar cambios

```bash
git add file1
git add file2
...

```

excluir cambios que no sean necesarios para el lab, evitar incluir binarios `.class`, `bin`, actualizar `.gitignore` para evitarlos 


Paso 8, confirmar cambios:

```bash
git commit -m "implementado el lab1 con..."
```

Paso 9, subir commits al repo personal:

```bash
git push -u origin lab1
```

Paso 10, crear el Merge Request a `main`, describir los cambios, agregar capturas del resultado del comando `./gradlew clean test`, y los diagramas UML. Asignar Reviewer para el MR.



# Contributing to my Chess System

Contributions are always welcome!

See [contributing.md](/Contributing.md). for ways to get started.


## Support for execution

the project has the start point on the class [Chess.java](/chess/src/main/java/project/entities/Chess.java)


### Licences

The project is licenced by  [MIT License](https://choosealicense.com/licenses/mit/).

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)
