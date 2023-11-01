# Описание решения
## Код программы написан на языке программирования Java

### импортируемые методы
_Для реализации функции ввода данных импортируется import java.util.Scanner_ 

_Для работы с массивами импортируется import java.util.Arrays_ 

_Для генерации случайных чисел импортируется import java.util.Random_ 

### последовательность работы программы

- При открытии программы выводится сообщение с текстом: "Введите элементы массива через: ', '.
- От пользователя требуется ввод массива строк в консоле.
    _Данная функция реализуется через Scanner_. 
- Введенные строки записываются в переменную inputData.
- Содержание переменной inputData переобразуется в массив строк "array" используя разделитель ", ".
- Генерируется случайное число используя логическое выражение:
    * если длина массива меньше 3 то случайное число будет равен числу в диапазоне от 0 до длины массива (включительно);
    * иначе случайное число будет равен числу в диапазоне от 0 до 3 (включительно).
- создаётся копия массива с длиной равной случайному числу.
- в консоле выводится новый массив строк с текстом "Элементы массива: ".
- программа завершает свою работу.

### блок-схема решения: 
![Изображение](Cheme.svg "Блок-схема")