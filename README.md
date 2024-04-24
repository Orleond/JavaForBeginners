## Java. Руководство для начинающих. 7-е издание. Герберт Шилдт
#### Java. A Begginer's Guide. Seventh Edition. Herbert Schildt
##### Собрание всех исходных кодов из книги
____
### Содержание:
 - [Глава 1. Основы Java](#chapter1)
 - [Глава 2. Знакомство с типами данных и операторами](#chapter2)
 - [Глава 3. Управляющие конструкции](#chapter3)
 - [Глава 4. Знакомство с классами, объектами и методами](#chapter4)
 - [Глава 5. Подробнее о типах данных и операторах](#chapter5)
 - [Глава 6. Подробнее о методах и классах](#chapter6)
 - [Глава 7. Наследование](#chapter7)
 - [Глава 8. Пакеты и интерфейсы](#chapter8)
 - [Глава 9. Обработка исключений](#chapter9)
 - [Глава 10. Ввод-вывод данных](#chapter10)
 - [Глава 11. Многопоточное программирование](#chapter11)
 - [Глава 12. Перечисления, автоупаковка, статический импорт и аннотации](#chapter12)
 - [Глава 13. Обобщения](#chapter13)
 - [Глава 14. Лямбда-выражения и ссылки на методы](#chapter14)
 - [Глава 15. Модули](#chapter15)
 - [Глава 16. Введение в Swing](#chapter16)
 - [Глава 17. Введение в JavaFX](#chapter17)
 - [Приложение Б. Применение документирующих комментариев в Java](#appendixb)
 - [Приложение B. Обзор технологии Java Web Start](#appendixc)

&nbsp;
____

&nbsp;
### <a name="chapter1">Глава 1. Основы Java</a>
#### Листинг примеров
|Название класса|Описание|
|-----------|-------------|
|[Example](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter1/Example.java)|Это пример простой программы на Java|
|[Example2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter1/Example2.java)|Демонстрация использования переменных|
|[Example3](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter1/Example3.java)|Демонстрация различий между типами int и double|
|[IfDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter1/IfDemo.java)|Демонстрация применения инструкции if|
|[ForDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter1/ForDemo.java)|Демонастрация применения цикла for|
|[BlockDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter1/BlockDemo.java)|Демонстрация применения блоков кода|

&nbsp;
#### Листинг упражнений
|Номер упражнения|Название класса|Описание|
|-----------|-------------|-------------|
|Упражнение 1.1|[GalToLit](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises1/GalToLit.java)|Программа перевода галлонов в литры|
|Упражнение 1.2|[GalToLitTable](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises1/GalToLitTable.java)|Эта программа отображает таблицу перевода галлонов в литры|

&nbsp;
#### Листинг ответов на упражнения для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 9|[Moon](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests1/Moon.java)|Вычисление веса на луне|
|Задание 10|[InchToMeterTable](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests1/InchToMeterTable.java)|Эта программа отображает таблицу преобразования дюймов в метры|

&nbsp;
#### Листинг моих решений упражнений для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 9|[Homework1](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks1/Homework1.java)|Вычисление веса на луне|
|Задание 10|[Homework2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks1/Homework2.java)|Видоизмените программу, созданную в упражнении 1.2, таким образом, чтобы она выводила таблицу перевода дюймов в метры. Выведите значения длины до 12 футов через каждый дюйм. После каждых 12 дюймов выведите пустую строку. (Один метр приблизительно равен 39.37 дюймам)|

&nbsp;
____

&nbsp;
### <a name="chapter2">Глава 2. Знакомство с типами данных и операторами</a>
#### Листинг примеров
|Название класса|Описание|
|-----------|-------------|
|[Inches](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter2/Inches.java)|Расчет числа кубических дюймов в кубе объемом в 1 куб. милю|
|[Hypot](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter2/Hypot.java)|Определение длины гипотенузы исходя из длины катетов, по теореме Пифагора|
|[CharArithDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter2/CharArithDemo.java)|С символьными переменными можно обращаться как с целочисленными|
|[BoolDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter2/BoolDemo.java)|Демонстрация использования логических значений|
|[StrDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter2/StrDemo.java)|Демонстрация управляющих последовательностей в символьных строках|
|[DynInit](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter2/DynInit.java)|Демонстрация динамической инициализации|
|[ScopeDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter2/ScopeDemo.java)| Демонстрация области действия блока кода||[VarInitDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter2/VarInitDemo.java)| Демонстрация времени жизни переменной|
|[ModDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter2/ModDemo.java)|Демонстрация использования оператора %|
|[RelLogOps](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter2/RelLogOps.java)|Демонстрация использования операторов сравнения и логических операторов|
|[SCops](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter2/SCops.java)|Демонстрация использования укороченных логических операторов|
|[SideEffects](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter2/SideEffects.java)|Демонстрация роли побочных эффектов|
|[LtoD](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter2/LtoD.java)|Демонстрация автоматического преобразования типа Long в тип double|
|[CastDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter2/CastDemo.java)|Демонстрация приведения типов|
|[PromDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter2/PromDemo.java)|Неожиданный результат повышения типов!|
|[UseCast](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter2/UseCast.java)|Приведение типов для правильного вычисления выражений|


&nbsp;
#### Листинг упражнений
|Номер упражнения|Название класса|Описание|
|-----------|-------------|-------------|
|Упражнение 2.1|[Sound](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises1/Sound.java)|Вычисление расстояния до места вспышки молнии, звук от которого доходит до наблюдателя через 7.2 секунды|
|Упражнение 2.2|[LogicalOpTable](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises1/LogicalOpTable.java)|Отображение таблицы истинности для логических операций|


&nbsp;
#### Листинг ответов на упражнения для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 10|[Prime](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests2/Prime.java)|Нахождение простых чисел в диапазоне от 2 до 100|


&nbsp;
#### Листинг моих решений упражнений для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 7|[Homework1](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks2/Homework1.java)|Предотвращение деления на нуль с исользованием логического оператора|
|Задание 10|[Homework2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks2/Homework2.java)|Нахождение простых чисел в диапазоне от 2 до 100|

&nbsp;
____

&nbsp;
### <a name="chapter3">Глава 3. Управляющие конструкции</a>
#### Листинг примеров</a>
|Название класса|Описание|
|-----------|-------------|
|[KbIn](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/KbIn.java)|Чтение символа с клавиатуры|
|[Guess](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/Guess.java)|Игра в угадывание букв|
|[Guess2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/Guess2.java)|Игра в угадывание букв, вторая версия|
|[Guess3](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/Guess3.java)|Игра в угадывание букв, третья версия|
|[Ladder](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/Ladder.java)|Демонстрация использования многоступенчатой конструкции if-else-if|
|[SwitchDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/SwitchDemo.java)|Демонстрация использования инструкции switch|
|[NoBreak](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/NoBreak.java)|Демонстрация использования инструкции switch без break|
|[SqrRoot](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/SqrRoot.java)|Вывод квадратных корней чисел от 1 до 99 вместе с ошибкой окрушления|
|[DecrFor](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/DecrFor.java)|Цикл for, выполняющийся с отрицательным приращением переменной|
|[Comma](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/Comma.java)|Применение запятых в определении цикла for|
|[ForTest](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/ForTest.java)|Выполнение цикла до тех пор, пока с клавиатуры не будет введена буква S|
|[Empty](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/Empty.java)|Пропуск отдельных составляющих в определении цикла for|
|[Empty2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/Empty2.java)|Пропуск отдельных составляющих в определении цикла for|
|[Empty3](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/Empty3.java)|Тело цикла for может быть пустым|
|[ForVar](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/ForVar.java)|Объявление переменной цикла в самом цикле for|
|[WhileDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/WhileDemo.java)|Демонстрация использования цикла while|
|[Power](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/Power.java)|Вычисление целых степеней числа 2|
|[DWDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/DWDemo.java)|Демонстрация использования цикла do-while|
|[Guess4](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/Guess4.java)|Игра в угадывание букв, четвертая версия|
|[BreakDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/BreakDemo.java)|Применение инструкции break для выхода из цикла|
|[Break2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/Break2.java)|Чтение вводимых данных до тех пор, пока не будет получена буква q|
|[Break3](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/Break3.java)|Применение инструкции break во вложенных циклах|
|[Break4](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/Break4.java)|Получение инструкции break с меткой|
|[Break5](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/Break5.java)|Еще один пример применения инструкции break с меткой|
|[Break6](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/Break6.java)|Расположение метки имеет большое значение|
|[ContDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/ContDemo.java)|Применение инструкции continue|
|[ContToTable](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/ContToTable.java)|Применение инструкции continue с меткой|
|[FindFac](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter3/FindFac.java)|Использование вложенных циклов для нахождения делителей чисел от 2 до 100|


&nbsp;
#### Листинг упражнений
|Номер упражнения|Название класса|Описание|
|-----------|-------------|-------------|
|Упражнение 3.1|[Help](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises3/Help.java)|Простая справочная система|
|Упражнение 3.2|[Help2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises3/Help2.java)|Расширенная справочная система, в которой для обработки результатов выбора из меню используется цикл do-while|
|Упражнение 3.3|[Help3](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises3/Help3.java)|Завершенная справочная система по управляющим инструкциям Java, обрабатывающая многократные запросы|


&nbsp;
#### Листинг ответов на упражнения для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 1|[Spaces](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests3/Spaces.java)|Подсчет пробелов|
|Задание 9|[Progress](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests3/Progress.java)|Использование цикла for для формирования геометрической прогрессии: 1, 2, 4, 8, 16, 32...|
|Задание 10|[CaseChg](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests3/CaseChg.java)|Смена регистра символов|


&nbsp;
#### Листинг моих решений упражнений для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 1|[Homework1](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks3/Homework1.java)|Подсчет пробелов|
|Задание 4|[Homework2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks3/Homework2.java)|Цикл for с перебором от 1000 до 0 с шагом 2|
|Задание 9|[Homework3](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks3/Homework3.java)|Использование цикла for для формирования геометрической прогрессии: 1, 2, 4, 8, 16, 32...|
|Задание 10|[Homework4](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks3/Homework4.java)|Смена регистра символов|

&nbsp;
____

&nbsp;
### <a name="chapter4">Глава 4. Знакомство с классами, объектами и методами</a>
|Название класса|Описание|
|-----------|-------------|
|[Vehicle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/Vehicle.java)|Класс, предназначенный для тестирования другими классами|
|[VehicleDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/VehicleDemo.java)|Программа, в которой используетс класс [Vehicle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/Vehicle.java)|
|[TwoVehicles](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/TwoVehicles.java)|В этой программе создаются два объекта класса [Vehicle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/Vehicle.java)|
|[AddMeth](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/AddMeth.java)|Добавление метода range() в класс [Vehicle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/Vehicle2.java)|
|[RetMeth](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/RetMeth.java)|Использование возвращаемого значения в методе range() класса [Vehicle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/Vehicle3.java)|
|[ChkNum](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/ChkNum.java)|Простой пример применения параметра в методе|
|[ParmDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/ParmDemo.java)|Простой пример применения параметра в методе из класса [ChkNum](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/ChkNum.java)|
|[Factor](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/Factor.java)|Простой пример применения двух параметров в методе|
|[IsFact](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/IsFact.java)|Простой пример применения двух параметров в методе из класса [Factor](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/Factor.java)|
|[CompFuel](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/CompFuel.java)|Добавление параметризированного метода, в котором выполняется расчет объема топлива, необходимого транспортному средству для преодоления заданного расстояния из класса [Vehicle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/Vehicle4.java)|
|[ConsDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/ConsDemo.java)|Класс, созданный для демонстрации работы конструктора класса [MyClass](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/MyClass.java)|
|[ParmConsDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/ParmDemo.java)|Класс, созданный для демонстрации работы параметризированного конструктора класса [MyClass](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/MyClass2.java)|
|[VehConsDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/VehConsDemo.java)|Добавление конструктора в классе [Vehicle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/Vehicle5.java)|
|[DemoPwr](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/DemoPwr.java)|Возведение в степень заданного числа через класс [Pwr](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter4/Pwr.java)|


&nbsp;
#### Листинг упражнений
|Номер упражнения|Название класса|Описание|
|-----------|-------------|-------------|
|Упражнение 4.1|[HelpClassDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises4/HelpClassDemo.java)|Преобразование в класс [Help](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises4/Help.java) справочной системы из упражнения 3.3|


_В 4 главе отсутствуют упражнения для самопроверки, в которых необходимо писать код._

&nbsp;
____

&nbsp;
### <a name="chapter5">Глава 5. Подробнее о типах данных и операторах</a>
|Название класса|Описание|
|-----------|-------------|
|[ArrayDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/ArrayDemo.java)|Демонстрация одномерного массива|
|[MinMax](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/MinMax.java)|Поиск минимального и максимального значений в массиве|
|[MinMax2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/MinMax2.java)|Применение инициализаторов массива|
|[TwoD](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/TwoD.java)|Демонстрация использования двумерного массива|
|[Ragged](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/Ragged.java)|Выделение памяти по второму индексу массива вручную|
|[Squares](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/Squares.java)|Инициализация двумерного массива|
|[AssignARef](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/AssignARef.java)|Присваивание ссылок на массивы|
|[LengthDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/LengthDemo.java)|Демонстрация использования переменной экземпляра length|
|[ACopy](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/ACopy.java)|Пример использования переменной length для копирования массивов|
|[ForEach](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/ForEach.java)|Использование цикла типа for-each|
|[NoChange](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/NoChange.java)|Циклы for-each предназначены только для чтения|
|[ForEach2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/ForEach2.java)|Использование расширенного цикла for для обработки двумерного массива|
|[Search](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/Search.java)|Поиск в массиве с использованием расширенного цикла for|
|[StringDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/StringDemo.java)|Знакомство с классом String|
|[StrOps](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/StrOps.java)|Некоторые операции над строками|
|[StringArrays](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/StringArrays.java)|Демонстрация использования массивов строк|
|[SubStr](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/SubStr.java)|Применение метода substring()|
|[StringSwitch](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/StringSwitch.java)|Использование строк для управления инструкцией switch|
|[CLDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/CLDemo.java)|Отображение всех данных, указываемых в командной строке|Использование строк для управления инструкцией switch|
|[Phone](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/Phone.java)|Простейший автоматизированный телефонный справочник|
|[UpCase](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/UpCase.java)|Преобразование строчных букв английского алфавита в прописные|
|[ShowBits](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/ShowBits.java)|Отображение битов, составляющих байт|
|[LowCase](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/LowCase.java)|Преобразование прописных букв английского языка в строчные|
|[Encode](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/Encode.java)|Использование побитовой операции исключающего ИЛИ для шифрования и дешифрования сообщений|
|[NotDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/NotDemo.java)|Демонстрация побитовой операции НЕ|
|[ShiftDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/ShiftDemo.java)|Демонстрация использования операторов << и >>|
|[NoZeroDiv](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/NoZeroDiv.java)|Предотвращение деления на нуль с помощью оператора ?|
|[NoZeroDiv2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter5/NoZeroDiv2.java)|Предотвращение деления на нуль с помощью оператора ?|


&nbsp;
#### Листинг упражнений
|Номер упражнения|Название класса|Описание|
|-----------|-------------|-------------|
|Упражнение 5.1|[Bubble](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises5/Bubble.java)|Демонстрация алгоритма пузырьковой сортировки|
|Упражнение 5.2|[QDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises5/QDemo.java)|Демонстрация использования класса [Queue](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises5/Queue.java)|
|Упражнение 5.3|[ShowBitsDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises5/ShowBitsDemo.java)|Создание класса для отображения значений в двоичном виде. Реализуется при помощи класса [ShowBits](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises5/ShowBits.java)|


&nbsp;
#### Листинг ответов на упражнения для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 3|[Avg](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests5/Avg.java)|Среднее арифметическое 10 значений типа double|
|Задание 4|[StrBubble](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests5/StrBubble.java)|Демонстрация алгоритма пузырьковой сортировки строк|
|Задание 7|[Encode](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests5/Encode.java)|Улучшенный вариант программы шифрования сообщений с помощью побитовой операции исключающего ИЛИ|
|Задание 13|[MinMax](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests5/MinMax.java)|Поиск минимального и максимального значений в массиве|


&nbsp;
#### Листинг моих решений упражнений для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 3|[Homework1](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks5/Homework1.java)|Среднее арифметическое 10 значений типа double|
|Задание 4|[Homework2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks5/Homework2.java)|Демонстрация алгоритма пузырьковой сортировки строк|
|Задание 7|[Homework3](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks5/Homework3.java)|Улучшенный вариант программы шифрования сообщений с помощью побитовой операции исключающего ИЛИ|
|Задание 13|[Homework4](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks5/Homework4.java)|Поиск минимального и максимального значений в массиве|

&nbsp;
____

&nbsp;
### <a name="chapter6">Глава 6. Подробнее о методах и классах</a>
|Название класса|Описание|
|-----------|-------------|
|[MyClass](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/MyClass.java)|Сравнение модификаторов доступа public и private|
|[AccessDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/AccessDemo.java)|Класс, реализующий сравнение модификаторов доступа public и private при помощи класса [MyClass](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/MyClass.java)|
|[FailSortArray](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/FailSortArray.java)|В этом классе реализуется "отказоустойчивый" массив, предотвращающий ошибки времени выполнения|
|[FSDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/FSDemo.java)|Демонстрация работы с "отказоустойчивым" массивом при помощи класса [FailSortArray](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/FailSortArray.java) |
|[Block](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/Block.java)|Методам можно передавать объекты|
|[PassOb](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/PassOb.java)|Класс, реализующий класс [Block](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/Block.java)|
|[Test](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/Test.java)|Простые типы данных передаются методам по значению|
|[CallByValue](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/CallByValue.java)|Класс, реализующий класс [Test](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/Test.java)|
|[Test2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/Test2.java)|Объекты передаются методам по ссылке|
|[CallByRef](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/CallByRef.java)|Класс, реализующий класс [Test2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/Test2.java)|
|[ErrorMsg](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/ErrorMsg.java)|Возврат объекта типа String|
|[ErrMsg](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/ErrMsg.java)|Класс, реализующий класс [ErrorMsg](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/ErrorMsg.java)|
|[Err](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/Err.java)|Возврат объекта, определяемого разработчиком программы|
|[ErrorInfo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/ErrorInfo.java)|Возврат объекта, определяемого разработчиком программы|
|[ErrInfo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/ErrInfo.java)|Класс, реализующий классы [Err](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/Err.java) и [ErrorInfo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/ErrorInfo.java)|
|[Overload](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/Overload.java)|Перегрузка методов|
|[OverloadDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/OverloadDemo.java)|Класс, реализующий класс [Overload](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/Overload.java)|
|[Overload2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/Overload2.java)|Автоматическое преобразование типов может влиять на выбор перегружаемого метода|
|[TypeConv](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/TypeConv.java)|Класс, реализующий класс [Overload2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/Overload2.java)|
|[MyClass2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/MyClass2.java)|Демонстрация перегрузки конструкторов|
|[OverloadConsDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/OverloadConsDemo.java)|Класс, реализующий класс [MyClass2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/MyClass2.java)|
|[Summation](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/Summation.java)|Инициализация одного объекта посредством другого|
|[SumDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/SumDemo.java)|Класс, реализующий класс [Summation](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/Summation.java)|
|[Factorial](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/Factorial.java)|Простой пример рекурсии|
|[Recursion](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/Recursion.java)|Класс, реализующий класс [Factorial](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/Factorial.java)|
|[StaticDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/StaticDemo.java)|Применение статической переменной|
|[SDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/SDemo.java)|Класс, реализующий класс [StaticDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/StaticDemo.java)|
|[StaticMeth](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/StaticMeth.java)|Применение статического метода|
|[SDemo2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/SDemo2.java)|Класс, реализующий класс [StaticMeth](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/StaticMeth.java)|
|[StaticBlock](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/StaticBlock.java)|Применение статического блока|
|[SDemo3](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/SDemo3.java)|Класс, реализующий класс [StaticBlock](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/StaticBlock.java)|
|[Outer](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/Outer.java)|Применение внутреннего класса|
|[NestedClassDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/NestedClassDemo.java)|Класс, реализующий класс [Outer](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/Outer.java)|
|[LocalClassDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/LocalClassDemo.java)|Применение класса ShowBits в качестве локального|
|[VarAargs](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/VarAargs.java)|Демонстрация использования метода с переменным числом аргументов|
|[VarAargs2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/VarArgs2.java)|Использование массива аргументов переменной длины наряду с обычными аргументами|
|[VarAargs3](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter6/VarArgs3.java)|Перегрузка метода с переменным числом аргументов|


&nbsp;
#### Листинг упражнений
|Номер упражнения|Название класса|Описание|
|-----------|-------------|-------------|
|Упражнение 6.1, 6.2|[Queue](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises6/Queue.java)|Класс, реализующий очередь для хранения символов|
|Упражнение 6.1|[QDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises6/QDemo.java)|Демонстрация использования класса [Queue](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises6/Queue.java)|
|Упражнение 6.2|[QDemo2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises6/QDemo2.java)|Демонстрация использования класса [Queue](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises6/Queue.java)|
|Упражнение 6.3|[QuickSort](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises6/QuickSort.java)|Простая версия класса Quicksort, реализующего быструю сортировку|
| |[QSDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises6/QSDemo.java)|Демонстрация использования класса [Quicksort](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises6/QuickSort.java)|


&nbsp;
#### Листинг ответов на упражнения для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 3|[Stack](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests6/Stack.java)|Класс, реализующий стек для хранения символов|
| |[SDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests6/SDemo.java)|Демонстрация использования класса [Stack](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests6/Stack.java)|
|Задание 6|[Backwards](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests6/Backwards.java)|Отображение символов строки в обратном порядке с помощью рекурсии|
| |[BWDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests6/BWDemo.java)|Демонстрация использования класса [Backwards](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests6/Backwards.java)|
|Задание 13|[SumIt](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests6/SumIt.java)|Суммирование переданных чисел|
| |[SumDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests6/SumDemo.java)|Демонстрация использования класса [SumIt](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests6/SumIt.java)|


&nbsp;
#### Листинг моих решений упражнений для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 3|[Stack](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks6/Stack.java)|Класс, реализующий стек для хранения символов|
| |[Homework1](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks6/Homework1.java)|Демонстрация использования класса [Stack](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks6/Stack.java)|
|Задание 4|[Test](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks6/Test.java)|Решить задачу на основании этого класса|
| |[Homework2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks6/Homework2.java)|Класс, реализующий обмен данными между двумя объектами на основании класа [Test](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks6/Test.java)|
|Задание 6|[Homework3](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks6/Homework3.java)|Отображение символов строки в обратном порядке с помощью рекурсии|
|Задание 13|[Homework4](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks6/Homework4.java)|Суммирование переданных чисел|

&nbsp;
____

&nbsp;
### <a name="chapter7">Глава 7. Наследование</a>
|Название класса|Описание|
|-----------|-------------|
|[TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape.java)|Класс, описывающий двумерные объекты|
|[Triangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Triangle.java)|Подкласс для представления треугольников, производный от класса [TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape.java)|
|[Shapes](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Shapes.java)|Простая иерархия классов. Реализует класс [Triangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Triangle.java)|
|[Rectangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Rectangle.java)|Подкласс для представления прямоугольников, производный от класса [TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape.java)|
|[TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape2.java)|Класс, описывающий двумерные объекты|
|[Triangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Triangle2.java)|Подкласс для представления треугольников, производный от класса [TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape2.java)|
|[Shapes2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Shapes2.java)|Использование методов доступа для установки и получения значений закрытых членов. Реализует класс [Triangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Triangle2.java)|
|[Triangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Triangle3.java)|Подкласс для представления треугольников, производный от класса [TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape2.java)|
|[Shapes3](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Shapes3.java)|Добавление конструктора в класс [Triangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Triangle3.java)|
|[TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape3.java)|Добавление конструкторов в класс [TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape2.java)|
|[Triangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Triangle4.java)|Подкласс для представления треугольников, производный от класса [TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape3.java)|
|[Shapes4](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Shapes4.java)|Добавление конструкторов в класс [TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape3.java)|
|[TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape4.java)|Добавление дополнительных конструкторов в класс [TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape3.java)|
|[Triangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Triangle5.java)|Подкласс для представления треугольников, производный от класса [TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape4.java)|
|[Shapes5](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Shapes5.java)|Добавление дополнительных конструкторов в класс [TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape4.java)|
|[A](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/A.java)|Использование ключевого слова super для предотвращения сокрытия имен. |
|[B](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/B.java)|Создание подкласса, расширяющего класс [A](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/A.java)|
|[UseSuper](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/UseSuper.java)|Использование ключевого слова super для предотвращения сокрытия имен. Реализует класс [B](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/B.java)|
|[ColorTriangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/ColorTriangle.java)|Расширение класса [Triangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Triangle5.java)|
|[Shapes6](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Shapes6.java)|Многоуровневая иерархия. Реализует класс [ColorTriangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/ColorTriangle.java)|
|[A](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/A2.java)|Создание суперкласса|
|[B](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/B2.java)|Создание подкласса в результате расширения класса [A](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/A2.java)|
|[C](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/C.java)|Создание подкласса в результате расширения класса [B](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/B2.java)|
|[OrderOfConstruction](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/OrderOfConstruction.java)|Демонстрация очередности вызова конструкторов. Реализует класс [C](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/C.java)|
|[X](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/X.java)|Обращение к объекту подкласса по ссылочной переменой суперкласса|
|[Y](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Y.java)|Обращение к объекту подкласса по ссылочной переменой суперкласса. Расширяет класс [X](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/X.java)|
|[SupSubRef](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/SupSubRef.java)|Обращение к объекту подкласса по ссылочной переменой суперкласса. Реализует классы [X](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/X.java) и [Y](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Y.java)|
|[TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape5.java)|Добавление конструктора, принимающего в качестве параметра другой объект [TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape5.java)|
|[Triangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Triangle6.java)|Подкласс для представления треугольников, производный от класса [TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape5.java)|
|[Shapes7](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Shapes7.java)|Добавление конструкторов, принимающих в качестве параметра другие объекты. Реализует класс [Triangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Triangle6.java)|
|[A](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/A3.java)|Переопределение метода|
|[B](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/B3.java)|Переопределение метода. Расширяет класс [A](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/A3.java)|
|[Override](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Override.java)|Переопределение метода. Реализует класс [B](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/B3.java)|
|[A](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/A4.java)|Методы с разными сигнатурами не переопределяются, а перегружаются|
|[B](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/B4.java)|Методы с разными сигнатурами не переопределяются, а перегружаются. Расширяет класс [A](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/A4.java)|
|[Overload](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Overload.java)|Методы с разными сигнатурами не переопределяются, а перегружаются. Реализует класс [B](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/B4.java)|
|[Sup](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Sup.java)|Демонстрация динамической диспетчеризации методов|
|[Sub1](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Sub1.java)|Демонстрация динамической диспетчеризации методов. Расширяет класс [Sup](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Sup.java)|
|[Sub2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Sub2.java)|Демонстрация динамической диспетчеризации методов. Расширяет класс [Sup](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Sup.java)|
|[DynDispDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/DynDispDemo.java)|Демонстрация динамической диспетчеризации методов. Реализует классы [Sub1](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Sub1.java) и [Sub2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Sub2.java)|
|[TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape6.java)|Использование динамической диспетчеризации методов|
|[Triangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Triangle7.java)|Подкласс для представления треугольников, производный от класса [TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape6.java)|
|[Rectangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Rectangle2.java)|Подкласс для представления прямоугольников, производный от класса [TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape6.java)|
|[DynShapes](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/DynShapes.java)|Использование динамической диспетчеризации методов. Реализует классы [Triangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Triangle7.java) и [Rectangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Rectangle2.java)|
|[TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape7.java)|Создание абстрактного класса|
|[Triangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Triangle8.java)|Подкласс для представления треугольников, производный от класса [TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape7.java)|
|[Rectangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Rectangle3.java)|Подкласс для представления прямоугольников, производный от класса [TwoDShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/TwoDShape7.java)|
|[AbsShape](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/AbsShape.java)|Создание абстрактного класса. Реализует классы [Triangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Triangle8.java) и [Rectangle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/Rectangle3.java)|
|[ErrorMsg](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/ErrorMsg.java)|Возврат объекта типа String|
|[FinalD](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/FinalD.java)|Возврат объекта типа String. Реализует класс [ErrorMsg](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter7/ErrorMsg.java)|


&nbsp;
#### Листинг упражнений
|Номер упражнения|Название класса|Описание|
|-----------|-------------|-------------|
|Упражнение 7.1|[Vehicle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises7/Vehicle.java)|Создание подкласса класса Vehicle для грузовиков|
||[Truck](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises7/Truck.java)|Расширение класса [Vehicle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises7/Vehicle.java) для грузовиков|
||[TruckDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises7/TruckDemo.java)|Создание подкласса класса [Vehicle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises7/Vehicle.java) для грузовиков|


&nbsp;
#### Листинг ответов на упражнения для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 2|[Circle](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests7/Circle.java)|Подкласс для окружностей, производный от класса TwoDShape|


&nbsp;
#### Листинг моих решений упражнений для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 2|[Circle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks7/Circle.java)|Подкласс для окружностей, производный от класса TwoDShape|

&nbsp;
____

&nbsp;
### <a name="chapter8">Глава 8. Пакеты и интерфейсы</a>
|Название класса|Описание|
|-----------|-------------|
|[Book](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/bookpack/Book.java)|Простая программа, демонстрирующая применение пакетов|
|[BookDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/bookpack/BookDemo.java)|Простая программа, демонстрирующая применение пакетов. Реализует класс [Book](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/bookpack/Book.java)|
|[Book](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/bookpack2/Book.java)|Класс [Book](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/bookpack/Book.java), видоизмененный для открытого доступа|
|[BookDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/bookpack2/BookDemo.java)|Простая программа, демонстрирующая применение пакетов. Реализует класс [Book](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/bookpack2/Book.java)|
|[UseBook](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/bookpackext/UseBook.java)|Использование класса [Book](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/bookpack2/Book.java) из пакета bookpack|
|[Book](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/bookpack3/Book.java)|Объявление защищенными переменных экземпляра в классе [Book](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/bookpack2/Book.java)|
|[ExtBook](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/bookpackext/ExtBook.java)|Пример использования модификатора protected|
|[ProtectDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/bookpackext/ProtectDemo.java)|Пример использования модификатора protected. Реализует класс [ExtBook](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/bookpackext/ExtBook.java)|
|[UseBook](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/bookpackext2/UseBook.java)|Использование ключевого слова import. Реализует класс [Book](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/bookpack3/Book.java)|
|[Series](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/Series.java)|Пример определения интерфейса|
|[ByTwos](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/ByTwos.java)|Реализация интерфейса [Series](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/Series.java)|
|[SeriesDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/SeriesDemo.java)|Реализация интерфейса [Series](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/Series.java). Реализует класс [ByTwos](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/ByTwos.java)|
|[ByTwos2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/ByTwos2.java)|Реализация интерфейса [Series](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/Series.java) и добавление метода getPrevious()|
|[ByThrees](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/ByThrees.java)|Еще одна реализация интерфейса [Series](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/Series.java)|
|[SeriesDemo2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/SeriesDemo2.java)|Реализация интерфейсных ссылок. Реализует классы [ByTwos](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/ByTwos.java) и [ByThrees](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/ByThrees.java) с помощью интерфейса [Series](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/Series.java)|
|[IConst](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/IConst.java)|Интерфейс, содержащий только константы|
|[IConstD](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/IConstD.java)|Реализация интерфейса [IConst](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/IConst.java) для доступа к его константам|
|[A](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/A.java)|Наследование интерфейсов|
|[B](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/B.java)|Этот интерфейс содержит методы meth1() и meth2() из интерфейса [A](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/A.java), а кроме того, в него добавляется метод meth3()|
|[MyClass](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/MyClass.java)|Этот класс должен реализовывать все методы, объявленные в интерфейсах [A](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/A.java) и [B](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/B.java)|
|[IFExtend](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/IFExtend.java)|Пример наследования интерфейсов. Реализует класс [MyClass](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/MyClass.java)|
|[MyIF](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/MyIF.java)|Использование метода по умолчанию|
|[MyIFImp](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/MyIFImp.java)|Реализация интерфейса [MyIF](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/MyIF.java)|
|[DefaultMethodDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/DefaultMethodDemo.java)|Использование интерфейсного метода по умолчанию. Реализует класс [MyIFImp](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/MyIFImp.java)|
|[MyIFImp2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/MyIFImp2.java)|Переопределение метода по умолчанию. Реализует интерфейс [MyIF](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/MyIF.java)|
|[Series2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/Series2.java)|Усовершенствованная версия интерфейса [Series](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/Series.java), которая включает используемый по умолчанию метод getNextArray()|
|[MyIF2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/MyIF2.java)|Добавление статического метода в интерфейс|
|[Series3](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/Series3.java)|Еще одна расширенная версия интерфейса [Series](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter8/Series.java), включающая два заданных по умолчанию метода и использующая закрытый метод getArray();|


&nbsp;
#### Листинг упражнений
|Номер упражнения|Название класса|Описание|
|-----------|-------------|-------------|
|Упражнение 8.1|[ICharQ](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises8/ICharQ.java)|Интерфейс для очереди символов|
| |[FixedQueue](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises8/FixedQueue.java)|Класс, реализующий очередь фиксированного размера для хранения символов. Реализует интерфейс [ICharQ](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises8/ICharQ.java)|
| |[CircularQueue](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises8/CircularQueue.java)|Кольцевая очередь. Реализует интерфейс [ICharQ](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises8/ICharQ.java)|
| |[IQDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises8/IQDemo.java)|Демонстрация трех реализаций интерфейса [ICharQ](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises8/ICharQ.java)|


&nbsp;
#### Листинг ответов на упражнения для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 1|[IQDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests8/IQDemo.java)|Добавление интерфейса [ICharQ](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests8/qpack/ICharQ.java) и 3 его реализации в пакет qpack и подключение этих файлов с помощью ключевого слова import|
|Задание 9|[IVehicle](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests8/IVehicle.java)|Добавление интерфейса Интерфейс для класса [Vehicle](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests8/Vehicle.java)|


&nbsp;
#### Листинг моих решений упражнений для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 1|[IQDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks8/IQDemo.java)|Добавление интерфейса [ICharQ](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks8/qpack/ICharQ.java) и 3 его реализации в пакет qpack и подключение этих файлов с помощью ключевого слова import|
|Задание 9|[IVehicle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks8/IVehicle.java)|Добавление интерфейса Интерфейс для класса [Vehicle](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks8/Vehicle.java)|

&nbsp;
____

&nbsp;
### <a name="chapter9">Глава 9. Обработка исключений</a>
|Название класса|Описание|
|-----------|-------------|
|[ExcDemo1](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/ExcDemo1.java)|Демонстрация обработки исключений|
|[ExcTest](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/ExcTest.java)|Исключение можеть быть сгенерировано одним методом, а перехваено другим.|
|[ExcDemo2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/ExcDemo2.java)|Исключение можеть быть сгенерировано одним методом, а перехваено другим. Использует класс [ExcTest](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/ExcTest.java)|
|[NotHandled](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/NotHandled.java)|Обработка ошибки средствами виртуалльной машины Java|
|[ExtTypeMismatch](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/ExtTypeMismatch.java)|Эта программа не будет работать!|
|[ExcDemo3](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/ExcDemo3.java)|Корректная обработка исключения и продолжение выполнения программы|
|[ExcDemo4](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/ExcDemo4.java)|Применение нескольких инструкций catch|
|[ExcDemo5](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/ExcDemo5.java)|В инструкциях catch исключения подкласса должны предшествовать исключениям суперкласса|
|[NestTrys](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/NestTrys.java)|Использование вложенных блоков try|
|[ThrowDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/ThrowDemo.java)|Генерирование исключения вручную|
|[Rethrow](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/Rethrow.java)|Повторное генерирование исключений|
|[RethrowDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/RethrowDemo.java)|Повторное генерирование исключений. Использует класс [Rethrow](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/Rethrow.java)|
|[UseThrowableMethods](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/UseThrowableMethods.java)|Использование методов класса Throwable. Использует класс [ExcTest](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/ExcTest.java)|
|[UseFinally](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/UseFinally.java)|Использование блока finally|
|[FinallyDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/FinallyDemo.java)|Использование блока finally. Использует класс [UseFinally](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/UseFinally.java)|
|[TrowsDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/TrowsDemo.java)|Использование ключевого слова throws|
|[MultiCatch](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/MultiCatch.java)|Использование средства группового перехвата исключений. Примечание: для компиляции этого кода требуется JDK 7 или выше|
|[NonIntResultException](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/NonIntResultException.java)|Использование специально создаваемого исключения|
|[CustomExceptDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/CustomExceptDemo.java)|Использование специально создаваемого исключения. Использует класс [NonIntResultException](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter9/NonIntResultException.java)|


&nbsp;
#### Листинг упражнений
|Номер упражнения|Название класса|Описание|
|-----------|-------------|-------------|
|Упражнение 9.1|[QueueFullException](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises9/QueueFullException.java)|Исключение для ошибок, связанных с заполненной очередью|
| |[QueueEmptyException](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises9/QueueEmptyException.java)|Исключение для ошибок, связанных с пустой очередью|
| |[ICharQ](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises9/ICharQ.java)|Интерфейс очереди для хранения символов с генерированием исключений|
| |[FixedQueue](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises9/FixedQueue.java)|Класс, реализующий очередь фиксированного размера для хранения символов|
| |[QExcDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises9/QExcDemo.java)|Демонстрация исключений при работе с очередью|


&nbsp;
#### Листинг ответов на упражнения для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 10|[StackFullException](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests9/StackFullException.java)|Исключение, возникающее при переполнении стека|
| |[StackEmptyException](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests9/StackEmptyException.java)|Исключение, возникающее при обращении к пустому стеку|
| |[Stack](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests9/Stack.java)|Класс, реализующий стек для хранения символов|


&nbsp;
#### Листинг моих решений упражнений для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 10|[FullStackException](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks9/FullStackException.java)|Исключение, возникающее при переполнении стека|
| |[EmptyStackException](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks9/EmptyStackException.java)|Исключение, возникающее при обращении к пустому стеку|
| |[Stack](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks9/Stack.java)|Класс, реализующий стек для хранения символов|
| |[Homework1](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks9/Homework1.java)|Демонстрация работы стека [Stack](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks9/Stack.java)|

&nbsp;
____

&nbsp;
### <a name="chapter10">Глава 10. Ввод-вывод данных</a>
|Название класса|Описание|
|-----------|-------------|
|[ReadBytes](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter10/ReadBytes.java)|Чтение байтов с клавиатуры в массив|
|[WriteDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter10/WriteDemo.java)|Демонстрация метода System.out.write()|
|[ShowFile](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter10/ShowFile.java)|Отображение текстового файла|
|[ShowFile](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter10/ShowFile2.java)|В этой версии программы те ее части, которые отвечают за открытие файла и получение доступа к нему, помещены в один блок try. Файл закрывается в блоке finally|
|[CopyFile](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter10/CopyFile.java)|Копирование текстового файла|
|[ShowFile](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter10/ShowFile3.java)|В этой версии программы [ShowFile](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter10/ShowFile2.java) инструкция try с ресурсами применяется для автоматического закрытия файла, когда в нем больше нет необходимости|
|[CopyFile](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter10/CopyFile2.java)|Версия программы [CopyFile](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter10/CopyFile.java), в которой используется инструкция try с ресурсами. В ней демонстрируется управление двумя ресурсами (в данном случае - файлами) с помощью единственной инструкции try.|
|[RWData](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter10/RWData.java)|Запись и чтение двоичных данных|
|[RandomAccessDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter10/RandomAccessDemo.java)|Демонстрация произвольного доступа к файлам|
|[ReadChars](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter10/ReadChars.java)|Использование класса BufferedReader для чтения символов с консоли|
|[ReadLines](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter10/ReadLines.java)|Чтение символьных строк с консоли с использованием класса BufferedReader|
|[PrintWriterDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter10/PrintWriterDemo.java)|Использование класса PrintWriter|
|[KtoD](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter10/KtoD.java)|Пример простой утилиты для ввода данных с клавиатуры и записи их на диск, демонстрирующий использование класса FileWriter|
|[DtoS](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter10/DtoS.java)|Пример простой утилиты для чтения данных с диска и вывода их на экран, демонстрирующий использование класса FileREader|
|[AvgNums](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter10/AvgNums.java)|Данная программа находит среднее арифметическое для ряда чисел, введенных пользователем с клавиатуры|


&nbsp;
#### Листинг упражнений
|Номер упражнения|Название класса|Описание|
|-----------|-------------|-------------|
|Упражнение 10.1|[CompFiles](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises10/CompFiles.java)|Сравнение двух файлов|
|Упражнение 10.2|[Help](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises10/Help.java)|В этом классе открывается файл со справочной информацией, выполняется поиск указанной темы, а затем отображается справочная информация|
| |[FileHelp](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises10/FileHelp.java)|Демонстрация работы справочной системы на основе файла|
| |[helpfile.txt](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises10/helpfile.txt)|Файл со справочной информацией|


&nbsp;
#### Листинг ответов на упражнения для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 7|[Hyphen](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests10/Hyphen.java)|Копирование текстового файла с заменой пробелов дефисами. В этой версии программы используются байтовые потоки|
|Задание 8|[Hyphen2](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests10/Hyphen2.java)|Копирование текстового файла с заменой пробелов дефисами. В этой версии программы используются символьные потоки|


&nbsp;
#### Листинг моих решений упражнений для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 7|[Homework1](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks10/Homework1.java)|Копирование текстового файла с заменой пробелов дефисами. В этой версии программы используются байтовые потоки|
|Задание 8|[Homework2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks10/Homework1.java)|Копирование текстового файла с заменой пробелов дефисами. В этой версии программы используются символьные потоки|

&nbsp;
____

&nbsp;
### <a name="chapter11">Глава 11. Многопоточное программирование</a>
|Название класса|Описание|
|-----------|-------------|
|[MyThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/MyThread.java)|Создание потока путем реализации интерфейса Runnable|
|[UseThreads](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/UseThreads.java)|Создание потока путем реализации интерфейса Runnable. Реализует класс [MyThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/MyThread.java)|
|[MyThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/MyThread2.java)|Изменения класса [MyThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/MyThread.java). Эта версия класса MyThread создает объект Thread путем вызова его конструктора и сохранения в переменной экземпляра thrd. Также присваивается имя потоку и используется фабричный метод создания и запуска потока.|
|[ThreadVariations](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/ThreadVariations.java)|Реализует класс [MyThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/MyThread2.java)|
|[MoreThreads](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/MoreThreads.java)|Создание нескольких потоков. Реализует класс [MyThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/MyThread2.java)|
|[MoreThreads](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/MoreThreads2.java)|Использование метода isAlive(). Реализует класс [MyThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/MyThread2.java)|
|[JoinThreads](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/JoinThreads.java)|Использование метода join(). Реализует класс [MyThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/MyThread2.java)|
|[Priority](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/Priority.java)|Демонстрация потоков с разными приоритетами|
|[PriorityDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/PriorityDemo.java)|Демонстрация потоков с разными приоритетами. Реализует класс [Priority](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/Priority.java)|
|[SumArray](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/SumArray.java)|Использование ключевого слова synchronized для управления доступом|
|[MyThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/MyThread3.java)|Использование ключевого слова synchronized для управления доступом. Реализует класс [SumArray](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/SumArray.java)|
|[Sync](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/Sync.java)|Использование ключевого слова synchronized для управления доступом. Реализует класс [MyThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/MyThread3.java)|
|[SumArray](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/SumArray2.java)|Использование синхронизированного блока для управления доступом к SumArray|
|[MyThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/MyThread4.java)|Использование синхронизированного блока для управления доступом к [SumArray](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/SumArray2.java)|
|[Sync](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/Sync2.java)|Использование синхронизированного блока для управления доступом к [SumArray](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/SumArray2.java). Реализует [MyThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/MyThread4.java)|
|[TickTock](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/TickTock.java)|Использование методов wait() и notify() для имитации часов|
|[MyThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/MyThread5.java)|Использование методов wait() и notify() для имитации часов. Использует класс [TickTock](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/TickTock.java)|
|[ThreadCom](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/ThreadCom.java)|Использование методов wait() и notify() для имитации часов. Использует классы [TickTock](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/TickTock.java) и [MyThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/MyThread5.java)|
|[ThreadCom](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/ThreadCom2.java)|В этой версии вызовы методов wait() и notify() отсутствуют. Использует классы [TickTock](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/TickTock2.java) и [MyThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/MyThread6.java)|
|[MyThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/MyThread7.java)|Приостановка, возобновление и остановка потока|
|[Suspend](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/Suspend.java)|Приостановка, возобновление и остановка потока. Реализует класс [MyThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/MyThread7.java)|


&nbsp;
#### Листинг упражнений
|Номер упражнения|Название класса|Описание|
|-----------|-------------|-------------|
|Упражнение 11.1|[MyThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises11/MyThread.java)|Расширение класса Thread|
| |[ExtendThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises11/ExtendThread.java)|Расширение класса Thread. Реализует класс [MyThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises11/MyThread.java)|
|Упражнение 11.2|[UseMain](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises11/UseMain.java)|Расширение класса Thread|


&nbsp;
#### Листинг ответов на упражнения для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 8|[TickTock](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests11/TickTock.java)|Вариант класса [TickTock](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/TickTock.java), в который добавлены вызовы метода sleep() для организации отсчета времени|


&nbsp;
#### Листинг моих решений упражнений для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 4|[Homework1](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks11/Homework1.java)|Ожидание завершения потокового объекта [MyThrd](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks11/MyThrd.java) помощью метода join()|
|Задание 8|[TickTock](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks11/TickTock.java)|Вариант класса [TickTock](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter11/TickTock.java), в который добавлены вызовы метода sleep() для организации отсчета времени|
| |[MyThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks11/MyThread.java)|Использует класс [TickTock](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks11/TickTock.java)|
| |[ThreadCom](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks11/ThreadCom.java)|Демонстрация работы классов [TickTock](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks11/TickTock.java) и [MyThread](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks11/MyThread.java)|

&nbsp;
____

&nbsp;
### <a name="chapter12">Глава 12. Перечисления, автоупаковка, статический импорт и аннотации</a>
|Название класса|Описание|
|-----------|-------------|
|[Transport](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter12/Transport.java)|Перечисление, представляющее разновидности транспортных средств|
|[EnumDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter12/EnumDemo.java)|Использование перечисления [Transport](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter12/Transport.java)|
|[EnumDemo2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter12/EnumDemo2.java)|Использование встроенных методов перечислений. Использование перечисления [Transport](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter12/Transport.java)|
|[Transport](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter12/Transport2.java)|Использование конструктора, переменной экземпляра и метода перечисления|
|[EnumDemo3](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter12/EnumDemo3.java)|Использование конструктора, переменной экземпляра и метода перечисления. Использование перечисления [Transport](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter12/Transport2.java)|
|[EnumDemo4](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter12/EnumDemo4.java)|Использование методов ordinal() т compareTo(). Использование перечисления [Transport](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter12/Transport.java)|
|[Wrap](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter12/Wrap.java)|Упаковка и распаковка значений вручную|
|[AutoBox](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter12/AutoBox.java)|Демонстрация автоупаковки и автораспаковки|
|[AutoBox2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter12/AutoBox2.java)|Автоупаковка и автораспаковка при передаче параметров и возврате значений из методов|
|[AutoBox3](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter12/AutoBox3.java)|Автоупаковка и автораспаковка в выражениях|
|[Quadratic](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter12/Quadratic.java)|Нахождение корней квадратного уравнения|
|[Quadratic2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter12/Quadratic2.java)|Использование статического импорта для помещения методов sqrt() и pow() в область видимости|
|[MyAnno](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter12/MyAnno.java)|Простой пример аннотации|
|[MyClass](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter12/MyClass.java)|Пример использования аннтоации @Deprecated|
|[AnnoDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter12/AnnoDemo.java)|Пример использования аннтоации @Deprecated. Реализует класс [MyClass](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter12/MyClass.java)|


&nbsp;
#### Листинг упражнений
|Номер упражнения|Название класса|Описание|
|-----------|-------------|-------------|
|Упражнение 12.1|[TrafficLightColor](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises12/TrafficLightColor.java)|Перечисление, представляющее цвета светофора|
| |[TrafficLightSimulator](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises12/TrafficLightSimulator.java)|Автоматизированное управление светофором. Использует перечисление [TrafficLightColor](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises12/TrafficLightColor.java)|
| |[TrafficLightDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises12/TrafficLightDemo.java)|Демонстрация работы светофора. Реализует класс [TrafficLightSimulator](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises12/TrafficLightSimulator.java)|


&nbsp;
#### Листинг ответов на упражнения для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 4|[TrafficLightColor](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests12/TrafficLightColor.java)|Перечисление, представляющее цвета светофора|
| |[TrafficLightSimulator](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests12/TrafficLightSimulator.java)|Имитация автоматизированного светофора|
| |[TrafficLightDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests12/TrafficLightDemo.java)|Усовершенствованная версия программы, имитирующей работу светофора. Значения задержки теперь хранятся в классе [TrafficLightColor](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests12/TrafficLightColor.java)|



&nbsp;
#### Листинг моих решений упражнений для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 3|[Homework1](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks12/Homework1.java)|Использование метода values() для отображения списка констант перечисления [Tools](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks12/Tools.java) и их значений|
|Задание 4|[TrafficLightColor](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks12/TrafficLightColor.java)|Перечисление, представляющее цвета светофора|
| |[TrafficLightSimulator](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks12/TrafficLightSimulator.java)|Имитация автоматизированного светофора|
| |[TrafficLightDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks12/TrafficLightDemo.java)|Демонстрация работы светофора. Реализует класс [TrafficLightSimulator](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks12/TrafficLightSimulator.java)|

&nbsp;
____

&nbsp;
### <a name="chapter13">Глава 13. Обобщения</a>
|Название класса|Описание|
|-----------|-------------|
|[Gen](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/Gen.java)|Простой обобщенный класс|
|[GenDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/GenDemo.java)|Демонстрация использования обобщенного класса [Gen](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/Gen.java)|
|[TwoGen](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/TwoGen.java)|Простой обобщенный класс с двумя параметрами типа: T и V|
|[SimpGen](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/SimpGen.java)|Демонстрация класса [TwoGen](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/TwoGen.java)|
|[NumericFns](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/NumericFns.java)|В этой версии класса NumericFns аргументом типа, заменяющим параметр типа Т, должен выступать класс Number или производный от него подкласс|
|[BoundsDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/BoundsDemo.java)|Демонстрация класса [NumericFns](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/NumericFns.java)|
|[NumericFns](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/NumericFns2.java)|Использование шаблона аргумента|
|[WildCardDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/WildCardDemo.java)|Демонстрация использования шаблона аргумента. Реализует класс [NumericFns](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/NumericFns2.java)|
|[UseBoundedWildcard](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/UseBoundedWildcard.java)|Пример класса, демонстрирующий типы объектов класса [Gen](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/Gen.java), которые могут быть переданы методу test()|
|[GenericMethodDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/GenericMethodDemo.java)|Пример простого обобщенного метода|
|[Summation](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/Summation.java)|Использование обобщенного конструктора|
|[GenConsDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/GenConsDemo.java)|Использование обобщенного конструктора. Реализует класс [Summation](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/Summation.java)|
|[Containment](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/Containment.java)|Пример обобщенного интерфейса|
|[MyClass](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/MyClass.java)|Реализовать интерфейс [Containment](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/Containment.java) с помощью массива, предназначенного для хранения значений|
|[GenIFDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/GenIFDemo.java)|Пример обобщенного интерфейса. Реализует класс [MyClass](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/MyClass.java)|
|[RawDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/RawDemo.java)|Продемонстрировать использование базового типа|
|[Gen](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/Gen2.java)|Обобщенные типы и массивы|
|[GenArrays](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/GenArrays.java)|Обобщенные типы и массивы. Реализует класс [Gen](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter13/Gen2.java)|


&nbsp;
#### Листинг упражнений
|Номер упражнения|Название класса|Описание|
|-----------|-------------|-------------|
|Упражнение 13.1|[IGenQ](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises13/IGenQ.java)|Обобщенный интерфейс очереди|
| |[QueueFullException](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises13/QueueFullException.java)|Исключение, указывающее на переполнение|
| |[QueueEmptyException](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises13/QueueEmptyException.java)|Исключение, указывающее на исчерпание очереди|
| |[GenQueue](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises13/GenQueue.java)|Обобщенный класс, реализующий очередь фиксированного размера|
| |[GenQDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises13/GenQDemo.java)|Демонстрация обобщенного класса очереди|
| |[CircularQueue](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises13/CircularQueue.java)|Кольцевая очередь|
| |[DynQueue](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises13/DynQueue.java)|Динамическая модель|


&nbsp;
#### Листинг ответов на упражнения для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 12|[IGenStack](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests13/IGenStack.java)|Обобщенный стек|
| |[StackFullException](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests13/StackFullException.java)|Исключение, возникающее при переполнении стека|
| |[StackEmptyException](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests13/StackEmptyException.java)|Исключение, возникающее при обращении к пустому стеку|
| |[GenStack](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests13/GenStack.java)|Класс, реализующий стек для хранения символов|
| |[GenStackDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests13/GenStackDemo.java)|Демонстрация использования класса [GenStack](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests13/GenStack.java)|



&nbsp;
#### Листинг моих решений упражнений для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 9|[IGenIF](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks13/IGenIF.java)|Интерфейс, который необходимо реализовать|
| |[MyClass](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks13/MyClass.java)|Реализация интерфейса [IGenIF](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks13/IGenIF.java)|
|Задание 12|[IGenStack](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks13/IGenStack.java)|Обобщенный стек|
| |[FullStackException](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks13/FullStackException.java)|Исключение, возникающее при переполнении стека|
| |[EmptyStackException](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks13/EmptyStackException.java)|Исключение, возникающее при обращении к пустому стеку|
| |[Stack](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks13/Stack.java)|Класс, реализующий стек для хранения символов|
| |[Homework2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks13/Homework2.java)|Демонстрация использования класса [Stack](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks13/Stack.java)|

&nbsp;
____

&nbsp;
### <a name="chapter14">Глава 14. Лямбда-выражения и ссылки на методы</a>
|Название класса|Описание|
|-----------|-------------|
|[MyValue](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MyValue.java)|Функциональный интерфейс|
|[LambdaDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/LambdaDemo.java)|Демонстрация двух простых лямбда-выражений с использованием интерфейса [MyValue](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MyValue.java)|
|[NumericTest](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/NumericTest.java)|Функциональный интерфейс имеет два параметра типа int и возвращает результат типа boolean|
|[LambdaDemo2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/LambdaDemo2.java)|Использование одного и того же функционального интерфейса с тремя различными лямбда-выражениями. Используется интерфейс [NumericTest](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/NumericTest.java)|
|[StringTest](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/StringTest.java)|Функциональный интерфейс, тестирующий две строки|
|[LambdaDemo3](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/LambdaDemo3.java)|Демонстрация использования функционального интерфеса [StringTest](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/StringTest.java)|
|[NumericFunc](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/NumericFunc.java)|Блочное лямбда-выражение, предназначенное для нахождения наименьшего положительного делителя заданного целого числа|
|[BlockLambdaDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/BlockLambdaDemo.java)|Демонстрация использования интерфейса [NumericFunc](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/NumericFunc.java)|
|[SomeTest](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/SomeTest.java)|Обобщенный функциональный интерфейс с двумя параметрами, который возвращает результат типа boolean|
|[GenericFunctionalInterfaceDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/GenericFunctionalInterfaceDemo.java)|Использование обобщенного функционального интерфейса [SomeTest](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/SomeTest.java)|
|[MyFunc](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MyFunc.java)|Функциональный интерфейс|
|[VarCapture](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/VarCapture.java)|Пример захвата локальной переменной из охватывающей лямбда-выражение области видимости с использованием функционального интерфейса [MyFunc](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MyFunc.java)|
|[MyIOAction](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MyIOAction.java)|Функциональный интерфейс|
|[LambdaExceptionDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/LambdaExceptionDemo.java)|Генерация исключений в лямбда-выражениях. Используется функциональный интерфейс [MyIOAction](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MyIOAction.java)|
|[IntPredicate](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/IntPredicate.java)|Функциональный интерфейс для числовых предикатов, которые воздействуют на целочисленные значения|
|[MyIntPredicates](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MyIntPredicates.java)|Данный класс определяет три статических метода, которые проверяют целое число на соответствие определенным условиям|
|[MethodRefDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MethodRefDemo.java)|Демонстрация использования ссылок на статические методы класса [MyIntPredicates](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MyIntPredicates.java) при помощи интерфейса [IntPredicate](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/IntPredicate.java)|
|[MyIntNum](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MyIntNum.java)|Данный класс хранит значение типа int и определяет метод isFactor(), который возвращает значение true, если его аргумент является делителем числа, хранящегося в классе|
|[MethodRefDemo2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MethodRefDemo2.java)|ДИспользование ссылки на метод экземпляра класса [MyIntNum](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MyIntNum.java) при помощи интерфейса [IntPredicate](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/IntPredicate.java)|
|[MyIntNumPredicate](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MyIntNumPredicate.java)|Функциональный интерфейс для числовых предикатов, которые воздействуют на объект типа [MyIntNum](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MyIntNum.java) и целочисленное значение|
|[MethodRefDemo3](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MethodRefDemo3.java)|Использование ссылки на метод экземпляра для обращения к любому интерфейсу. Используется класс [MyIntNum](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MyIntNum.java) и интерфейса [MyIntNumPredicate](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MyIntNumPredicate.java)|
|[MyFunc](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MyFunc2.java)|MyFunc - функциональный интерфейс, метод которого возвращает ссылку на [MyClass](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MyClass2.java)|
|[MyClass](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MyClass2.java)|Демонстрация использования ссылок на конструкторы|
|[ConstructorRefDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/ConstructorRefDemo.java)|Демонстрация использования ссылок на конструкторы с использованием класса [MyClass](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MyClass2.java) и интерфейса [MyFunc](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MyFunc2.java)|
|[UsePredicateInterface](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/UsePredicateInterface.java)|Использование встроенного функционального интерфейса Predicate|


&nbsp;
#### Листинг упражнений
|Номер упражнения|Название класса|Описание|
|-----------|-------------|-------------|
|Упражнение 14.1|[StringFunc](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises14/StringFunc.java)|Функциональный интерфейс|
| |[LambdaArgumentDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises14/LambdaArgumentDemo.java)|Использование лямбда-выражения в качестве аргумента метода|


&nbsp;
#### Листинг ответов на упражнения для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 7|[NumericFunc](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests14/NumericFunc.java)|Блочное лямбда-выражение, предназначенное для нахождения наименьшего положительного делителя заданного целого числа|
| |[FactorialLambdaDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests14/FactorialLambdaDemo.java)|Демонстрация использования блочного лямбда-выражения и использованием функционального интерфейса [NumericFunc](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests14/NumericFunc.java)|
|Задание 8|[MyFunc](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests14/MyFunc.java)|Функциональный интерфейс с абстрактным методом func()|
| |[FactorialLambdaDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests14/FactorialLambdaDemo2.java)|Демонстрация использования функционального интерфейса [MyFunc](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests14/MyFunc.java)|
|Задание 16|[MyIntNum](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests14/MyIntNum.java)|Добавление метода hasCommonFactor() в класс [MyIntNum](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MyIntNum.java)|



&nbsp;
#### Листинг моих решений упражнений для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 5|[Homework1](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks14/Homework1.java)|Лямбда-выражение, которое возвращает true, если число принадлежит диапазону чисел 10-20, включая граничные значения|
|Задание 6|[MyTest](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks14/MyTest.java)|Функциональный интерфейс, способный поддерживать лямбда-выражение, предложенное в Homework1 с абстрактным методом - testing()|
|Задание 7|[NumericFunc](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks14/NumericFunc.java)|Блочное лямбда-выражение, предназначенное для нахождения наименьшего положительного делителя заданного целого числа|
| |[Homework3](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks14/Homework3.java)|Демонстрация использования блочного лямбда-выражения и использованием функционального интерфейса [NumericFunc](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks14/NumericFunc.java)|
|Задание 8|[MyFunc](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks14/MyFunc.java)|Функциональный интерфейс с абстрактным методом func()|
| |[Homework4](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks14/Homework4.java)|Демонстрация использования функционального интерфейса [MyFunc](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks14/MyFunc.java)|
|Задание 9|[Homework5](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks14/Homework5.java)|Лямбда-выражение, удаляющее пробелы из заданной строки|
| |[StringFunc](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks14/StringFunc.java)|Функциональный интерфейс, используемый в классе [Homework5](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks14/Homework5.java)|
|Задание 14|[MyClass](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks14/MyClass.java)|Демонстрация способа указания ссылки на метод. Используется функциональный интерфейс [HomeworkInterface6and7](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks14/HomeworkInterface6and7.java)|
|Задание 15|[MyClass2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks14/MyClass2.java)|Демонстрация создания ссылки на метод,ассоциированный с объектом. Используется функциональный интерфейс [HomeworkInterface6and7](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks14/HomeworkInterface6and7.java)|
|Задание 16|[MyIntNum](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks14/MyIntNum.java)|Добавление метода hasCommonFactor() в класс [MyIntNum](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter14/MyIntNum.java)|
| |[IntPredicate](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks14/IntPredicate.java)|Функциональный интерфейс|
| |[MethodRefDemo2](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks14/MethodRefDemo2.java)|Демонстрация работы метода hasCommonFactor() с использованием ссылки на метод|

&nbsp;
____

&nbsp;
### <a name="chapter15">Глава 15. Модули</a>
_Компилировать примеры рекомендуется вручную через командную строку без использования IDE_
|Название класса|Описание|
|-----------|-------------|
|[SimpleMathFuncs](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter15/mymodapp/appsrc/appfuncs/appfuncs/simplefuncs/SimpleMathFuncs.java)|Несколько простых математических функций|
|[MyModAppDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter15/mymodapp/appsrc/appstart/appstart/mymodappdemo/MyModAppDemo.java)|Демонстрация простого модульного приложения|
|[appfuncs](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter15/mymodapp/appsrc/appfuncs/module-info.java)|Определение модуля функций|
|[appstart](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter15/mymodapp/appsrc/appstart/module-info.java)|Определение главного модуля приложения|
|[appfuncs](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter15/mymodapp2/appsrc/appfuncs/module-info.java)|Определение модуля, которое использует предложение to|
|[BinaryFunc](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter15/mymodapp3/appsrc/userfuncs/userfuncs/binaryfuncs/BinaryFunc.java)|Данный интерфейс определяет функцию, которая имеет два аргумента типа int и возвращает результат типа int. Это может быть любая бинарная операция с двумя аргументами типа int, которая возвращает результат типа int|
|[BinFuncProvider](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter15/mymodapp3/appsrc/userfuncs/userfuncs/binaryfuncs/BinFuncProvider.java)|Этот интерфейс определяет структуру провайдера службы, который возвращает экземпляры [BinaryFunc](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter15/mymodapp3/appsrc/userfuncs/userfuncs/binaryfuncs/BinaryFunc.java)|
|[AbsPlus](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter15/mymodapp3/appsrc/userfuncsimp/userfuncsimp/binaryfuncsimp/AbsPlus.java)|Класс AbsPlus обеспечивает конкретную реализацию интерфейса [BinaryFunc](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter15/mymodapp3/appsrc/userfuncs/userfuncs/binaryfuncs/BinaryFunc.java). Он возвращает результат abs(a) + abs(b)|
|[AbsMinus](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter15/mymodapp3/appsrc/userfuncsimp/userfuncsimp/binaryfuncsimp/AbsMinus.java)|Класс AbsMinus обеспечивает конкретную реализацию интерфейса [BinaryFunc](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter15/mymodapp3/appsrc/userfuncs/userfuncs/binaryfuncs/BinaryFunc.java). Он возвращает результат abs(a) - abs(b)|
|[AbsPlusProvider](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter15/mymodapp3/appsrc/userfuncsimp/userfuncsimp/binaryfuncsimp/AbsPlusProvider.java)|Провайдер для функции [AbsPlus](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter15/mymodapp3/appsrc/userfuncsimp/userfuncsimp/binaryfuncsimp/AbsPlus.java)|
|[AbsMinusProvider](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter15/mymodapp3/appsrc/userfuncsimp/userfuncsimp/binaryfuncsimp/AbsMinusProvider.java)|Провайдер для функции [AbsMinus](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter15/mymodapp3/appsrc/userfuncsimp/userfuncsimp/binaryfuncsimp/AbsMinus.java)|
|[userfuncs](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter15/mymodapp3/appsrc/userfuncs/module-info.java)|Файл определения модуля userfuncs|
|[userfuncsimp](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter15/mymodapp3/appsrc/userfuncsimp/module-info.java)|Файл определения модуля userfuncsimp|
|[MyModAppDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter15/mymodapp3/appsrc/appstart/appstart/mymodappdemo/MyModAppDemo.java)|Модульное приложение, демонстрирующее использование служб и провайдеров служб|
|[appstart](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter15/mymodapp3/appsrc/appstart/module-info.java)|Определение модуля для главного модуля приложения. Теперь используется интерфейс [BinFuncProvider](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter15/mymodapp3/appsrc/userfuncs/userfuncs/binaryfuncs/BinFuncProvider.java)|


&nbsp;
#### Листинг упражнений
|Номер упражнения|Название класса|Описание|
|-----------|-------------|-------------|
|Упражнение 15.1|[appsupport](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises15/mymodapp/appsrc/appsupport/module-info.java)|Определение модуля appsupport|
| |[SupportFuncs](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises15/mymodapp/appsrc/appsupport/appsupport/supportfuncs/SupportFuncs.java)|Функции поддержки|
| |[SimpleMathFuncs](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises15/mymodapp/appsrc/appfuncs/appfuncs/simplefuncs/SimpleMathFuncs.java)|Несколько простых математических функций. На этот раз метод isFactor() удален|
| |[appfuncs](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises15/mymodapp/appsrc/appfuncs/module-info.java)|Определение модуля appfuncs|
| |[MyModAppDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises15/mymodapp/appsrc/appstart/appstart/mymodappdemo/MyModAppDemo.java)|Обновлен для использования класса [SupportFuncs](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises15/mymodapp/appsrc/appsupport/appsupport/supportfuncs/SupportFuncs.java)|


_В 15 главе отсутствуют упражнения для самопроверки, в которых необходимо писать код._

&nbsp;
____

&nbsp;
### <a name="chapter16">Глава 16. Введение в Swing</a>
|Название класса|Описание|
|-----------|-------------|
|[SwingDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter16/SwingDemo.java)|Простая Swing-программа|
|[ButtonDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter16/ButtonDemo.java)|Демонстрация создания кнопки и обработки событий действий|
|[TFDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter16/TFDemo.java)|Использование текстового поля|Демонстрация создания кнопки и обработки событий действий|
|[CBDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter16/CBDemo.java)|Демонстрация использования флажков|
|[ListDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter16/ListDemo.java)|Демонстрация использования простого списка JList|


&nbsp;
#### Листинг упражнений
|Номер упражнения|Название класса|Описание|
|-----------|-------------|-------------|
|Упражнение 16.1|[SwingFC](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises16/SwingFC.java)|Утилита сравнения файлов на основе swing|


&nbsp;
#### Листинг ответов на упражнения для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 15|[SwingFC](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests16/SwingFC.java)|В этой версии предусмотрен флажок, установка которого задает отображение позиции первого расхождения в содержимом сравниваемых файлов|
|Задание 16|[ListDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests16/ListDemo.java)|Демонстрация выбора нескольких элементов из списка с помощью компонента JList|



&nbsp;
#### Листинг моих решений упражнений для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 15|[SwingFC](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks16/SwingFC.java)|В этой версии предусмотрен флажок, установка которого задает отображение позиции первого расхождения в содержимом сравниваемых файлов|
|Задание 16|[ListDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks16/ListDemo.java)|Демонстрация выбора нескольких элементов из списка с помощью компонента JList|
|Задание 17|[Homework3](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks16/Homework3.java)|Задание повышенной сложности. Преобразование класса Help в программу Swing с графическим пользовательским интерфейсом|

&nbsp;
____

&nbsp;
### <a name="chapter17">Глава 17. Введение в JavaFX</a>
|Название класса|Описание|
|-----------|-------------|
|[JavaFXSkel](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter17/JavaFXSkel.java)|Каркас приложения JavaFX|
|[JavaFXLabelDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter17/JavaFXLabelDemo.java)|Демонстрация использования меток JavaFX|
|[JavaFXEventDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter17/JavaFXEventDemo.java)|Демонстрация обработки событий JavaFX для кнопок|
|[CheckBoxDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter17/CheckBoxDemo.java)|Демонстрация использования флажков|
|[ListViewDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter17/ListViewDemo.java)|Демонстрация использования списка|
|[TextFieldDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter17/TextFieldDemo.java)|Демонстрация использования текстового поля|
|[EffectsAndTransformsDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter17/EffectsAndTransformsDemo.java)|Демонстрация эффектов поворота, масштабирования, отражения и размытия компонента|


&nbsp;
#### Листинг упражнений
|Номер упражнения|Название класса|Описание|
|-----------|-------------|-------------|
|Упражнение 17.1|[CheckBoxDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Exercises/Exercises17/CheckBoxDemo.java)|Демонстрация использования флажков|


&nbsp;
#### Листинг ответов на упражнения для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 10|[JavaFXEventDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests17/JavaFXEventDemo.java)|Демонстрация использования метода Platform.exit()|
|Задание 13|[JavaFXFileComp](https://github.com/Orleond/JavaForBeginners/blob/main/src/SelfTests/SelfTests17/JavaFXFileComp.java)|Реализация средствами JavaFX версии утилиты сравнения файлов|



&nbsp;
#### Листинг моих решений упражнений для самопроверки из книги
|Номер задания|Название класса|Описание|
|-----------|-------------|-------------|
|Задание 10|[JavaFXEventDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks17/JavaFXEventDemo.java)|Демонстрация использования метода Platform.exit()|
|Задание 13|[JavaFXFC](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks17/JavaFXFC.java)|Реализация средствами JavaFX версии утилиты сравнения файлов|
|Задание 14|[EffectsAndTransformsDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Homeworks/Homeworks17/EffectsAndTransformsDemo.java)|Модификация программы [EffectsAndTransformsDemo](https://github.com/Orleond/JavaForBeginners/blob/main/src/Chapters/Chapter17/EffectsAndTransformsDemo.java) таким образом, чтобы размытие применялось также к кнопке "Повернуть"|

&nbsp;
____

&nbsp;
### <a name="appendixb">Приложение Б. Применение документирующих комментариев в Java</a>
|Название класса|Описание|
|-----------|-------------|
|[SquareNum](https://github.com/Orleond/JavaForBeginners/blob/main/src/Appendixes/AppendixB/SquareNum.java)|Класс, демонстрирующий использование документирующих комментариев|

&nbsp;
____

&nbsp;
### <a name="appendixc">Приложение B. Обзор технологии Java Web Start</a>
При генерации сертификата вместо команды из книги необходимо использовать команду: _keytool -genkeypair -alias devName -keystore devFeys -keyalg RSA_
|Название класса|Описание|
|-----------|-------------|
|[ButtonDemo.jnlp](https://github.com/Orleond/JavaForBeginners/blob/main/src/Appendixes/Appendix%D0%A1/ButtonDemo.jnlp)|Файл, необходимый для запуска приложения|
|[MyMan.txt](https://github.com/Orleond/JavaForBeginners/blob/main/src/Appendixes/Appendix%D0%A1/MyMan.txt)|MANIFEST-файл|
|[StartBD.html](https://github.com/Orleond/JavaForBeginners/blob/main/src/Appendixes/Appendix%D0%A1/StartBD.html)|HTMLL-файл для загрузки приложения|
