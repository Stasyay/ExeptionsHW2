/*
        2. Если необходимо, исправьте данный код
        (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

   try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
     System.out.println("Catching exception: " + e);
    }


*/
public class Task2 {
/*
Если задача получить исключение только ArithmeticException, тогда нужно просто заменить
intArray[8] на intArray[intArray.length-1]
Иначе при входящем массиве больше или меньше 8
будет вылетать не обрабатываемое исключение ArrayIndexOutOfBoundsException
Если же нам нужно выводить Это исключение, то добавляем
} catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }

Или же для каких нибудь неучтенных ошибок
catch (RuntimeException e) {
            System.out.println("Всё пошло не по плану: " + e);
        }


 */
    public static void main(String[] args) {

        Integer[] intArray = new Integer[] {1,2,3,4,5,6};
        try {
            int d = 0;
            double catchedRes1 = intArray[intArray.length-1] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }catch (RuntimeException e) {
            System.out.println("Всё пошло не по плану: " + e);
        }
    }
}
