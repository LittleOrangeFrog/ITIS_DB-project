package ru.kpfu.itis.group905.medvedeva.inf.exceptions;

import java.io.*;
/*программа не скомпилится, так как мы создаем новый 
"тип" исключения Exception1, но не указываем, что данный класс наследуется от исключений.
То есть в блоке try он не сможет выбросить исключение Exception1, так как он не является
типом доступным к "выбросу" (то есть не Throwable).
Аналогично в catch, который должен принимать Throwable:
он его не получит 
*/

//предположение верно

/*поэтому необходимо в объявлении класса написать
 Exception1 extends Exception.
 Теперь программа выведет "b" и "d", так как поймает исключение Exception1,
 которое появляется в блоке try,
 и запустит первый блок catch, но не запустит
 второй, так как оно ловит исключение более общего типа,
 то есть ему уже нечего ловить(?).
 а блок finally выполнится в любом случае
*/
public class Exception1 extends Exception {
    public static void main(String[] args) {
        try {
            throw new Exception1();
        } catch (Exception1 e) {
            System.out.println("b");
        } catch (Exception e) {
            System.out.println("c");
        } finally {
            System.out.println("d");
        }
    }
}
