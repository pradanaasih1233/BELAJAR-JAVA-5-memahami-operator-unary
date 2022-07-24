// OPERATOR UNARY
// unary adalah operator yang digunakan pada satu bilangan saja.
package com.belajar5;

public class main {
    public static void main(String[] args){
        System.out.println("==============================");
        System.out.println("BELAJAR MEMAHAI OPERATOR UNARY");
        System.out.println("==============================");

        // deklarasi
        int a = 10;
        int b;
        boolean c = true;
        boolean d;

        //MACAM MACAM UNARY
        //------------------------------------------------------------------------------

        // 1. unary min(-)
        System.out.println("\n1. unary min -");
        System.out.println("---------");

        // ini adalah unary dari a;
        b = -a; // <--- tidak melibatkan angka lain
        // maka nilai b menjadi nilai - (negatif) dari a

        // cara penulisan
        System.out.println("nilai " + a + " setelah union --> " + b);

        // 2. unary plus(-)
        System.out.println("\n2. unary plus +");
        System.out.println("---------");

        // ini adalah unary dari a;
        b = +a; // <--- tidak melibatkan angka lain
        // maka nilai b menjadi nilai + (positif) dari a

        // cara penulisan
        System.out.println("nilai " + a + " setelah union --> " + b);

        //3. unary decrement(++)
        System.out.println("\n3. unary deckremen ++");
        System.out.println("--------------");

        // ini adalah unary decrement dari a;
        b = a++; // <--- tidak melibatkan angka lain
        // maka nilai b adalah a ditambah 1

        // cara penulisan
        System.out.println("nilai " + a + " setelah union decrement ++ --> " + b);

        // 4. unary increment(++)
        System.out.println("\n4. unary inckremen --");
        System.out.println("--------------");

        // ini adalah unary decrement dari a;
        b = a--; // <--- tidak melibatkan angka lain
        // maka nilai b adalah a dikurang 1

        // cara penulisan
        System.out.println("nilai " + a + " setelah union increment -- --> " + b);

        // 5. unary booblean(++)
        System.out.println("\n5. unary boolean (!)");
        System.out.println("--------------");

        // ini adalah unary decrement dari a;
        d = !c; // <--- tidak melibatkan angka lain
        // maka nilai d adakan menjadi kebalikan dari c

        // cara penulisan
        System.out.println("nilai " + c + " setelah union boolean --> " + d);

    }
}
