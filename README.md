Scelsx
======

console util for formatting microsoft excel files

```
java -jar ./scelsx-assembly-1.0.jar <path2file> <cmd> <args>
```

CMD == merge
------------

merge cells , args = array of (x_from, x_to, y_from, y_to) , example

```
java -jar ./scelsx-assembly-1.0.jar ./workbook.xlsx merge 1 3 1 3 4 6 4 6
```