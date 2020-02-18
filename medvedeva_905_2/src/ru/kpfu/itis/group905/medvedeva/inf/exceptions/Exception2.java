package ru.kpfu.itis.group905.medvedeva.inf.exceptions;
import java.io.*;

/*программа выбросит исключение Exception2,
но, не смотря на то, что блок catch отсутствует,
перед выходом программа выполнит блок finally 
и выведется "c"
*/
public class Exception2 extends Exception {
    public static void main(String[] args) {
        try {
            throw new Exception2();
        } finally {
            System.out.println("c");
        }
    }
}
