package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.increment();
        System.out.println(Counter.getCount());

        Counter c2 = new Counter();
        c2.increment();
        c2.increment();

        System.out.println(Counter.getCount());
    }
}
/* Ответ: первый sout выводит 1, второй выводит 3.
Функция increment увеличивает значение переменной count на 1. Первый раз когда мы создали c1 и вызвали c1.increment()  мы положили туда значение 1.
Далее мы создали еще один экземпляр класса c2 и уже два раза вызвали функцию c2.increment т.е. значение переменной уже было 1 и стало 1+1+1=3.
Вывели во втором sout 3.
 */