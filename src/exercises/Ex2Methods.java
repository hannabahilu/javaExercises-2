package exercises;

import static java.lang.System.out;

/*
 *  Implement methods to make program produce correct output (normally print true)
 *
 * See:
 * - MethodsBasics
 * - MethodsArrObj  (just arrays)
 */
public class Ex2Methods {

    public static void main(String[] args) {
        new Ex2Methods().program();
    }

    void program() {
        // All, except last,  should print true
        out.println(sumTo(5) == 15);     // 1 + 2 + ... + 5 = 15
        out.println(sumTo(23) == 276);
        //out.println(factorial(3) == 6);    // 3 * 2 * 1 = 6
        //out.println(factorial(5) == 120);
        //out.println(digitSum(1111) == 4);   // 1 + 1 + 1 + 1 = 4
        //out.println(digitSum(12345) == 15);

        int[] arr = {10, 20, 30, 40, 50};
        //out.println(next(arr, 2) == 40);    // Find *next* value given index
                                                  // Index 2 is 30 so next is 40.
        //out.println(next(arr, 4) == 10);    // Index 4 is 50 so next is 10 (circular).

        String winner = "Olle";
        // A special case, should print: "Winner is Olle" (or whatever name)
        //winnerMsg(winner);
    }

    // ------ Write methods below this  -----------

    // Declaration
    int sumTo(int n) {
        // TODO
        return 0;
    }

    // TODO More methods here

}
