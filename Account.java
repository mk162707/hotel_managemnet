//import java.io.File;
//import java.io.IOException;
//import java.util.Arrays;
//
//// constructor java
//class Account{
//    int id;
//    String name;
//    Account() {
//        id=101;
//        name="mk";
//    }
//
//    //constructor to initialize integer and string
////    Account(int i,String n){
////        id = i;
////        name = n;
////    }
//    //constructor to initialize another object
////    Account(Account a){
////        id = a.id;
////        name =a.name;
//   public  void display()
//    {
//        System.out.println(id+" "+name);
//    }
//
//
//
//    public static void main(String args[]){
//
//        Account a=new Account();
//        a.display();
////        Account b = new Account(101,"mk");
////        Account c = new Account(b);
////        b.display();
////        c.display();
//    }
//}

// array program
//public class Arr{
//
//    public static void main(String[] args) {
//
//        int a[] =new int [5];
//        a[0]=10;
//        a[1]=20;
//        a[2]=30;
//        System.out.println(" a[o]"+a[0]);
//        //or
//        for(int i=0;i<5;i++)
//        {
//            System.out.println("a["+i+"]="+a[i]);;
//        }
//
//    }
//}
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Array {


    // import java.util.String;;


    //    public static void main(String[] args) {
////        String[] name = {"hi ", "welcome", " in java "};
//////        int a[] = new int [5];
////
//////        for (String b : name) {
//////            System.out.println(b + " ");
//////        }
////        for(String  b  :name )
////        {
////            System.out.print(b+" ");
////
////        }
////        for(int i =0;i<=)
////        System.out.println(" length of an arrayy is "+name.length);
//        int a[][] = new int [2][2];
//        Scanner sc=new Scanner(System.in);
//        //
//        System.out.println(" enter  2d array elments ");;
//        for(int i=0; i<=1;i++)
//        {
//            for(int j=0;j<=1;j++)
//            {
//                a[i][j]= sc.nextInt();
//            }
//        }
//        System.out.println("  print 2d array  elemenst ");
//        for(int i=0; i<=1;i++)
//        {
//            for(int j=0;j<=1;j++)
//            {
//                System.out.println(" a["+i+"]["+j+"] "+a[i][j]);
//            }
//        }
//
//
//    }
//    public static void main(String[] args) {
//
//        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
//        int [] a={10, 20,30, 40,};
//        int [] b={50,60};
////    System.out.println("The original array is: ");
////    for (int num : arr) {
////        System.out.print(num + " ");
////    }
////    Arrays.sort(arr);
////    System.out.println("\nThe sorted array is: ");
////    for (int num : arr) {
////        System.out.print(num + " ");
//        //}
//
//        System.out.println(" comparison is "+ Arrays.compare(a,b));
//    }
//}
// modular programming
//public class Calling_method {
//    public  static  void swap(int a, int b)
//    {
//        int c=a;
//        a=b;
//        b=c;
//        System.out.println(" in user-defined  method  ");
//        System.out.println(" a is "+a+" b is "+b);
//    }
//
//
//
//
//    public static void main(String[] args) {
//        int a=10, b=20;
//        System.out.println(" before  fucntion call ");
//        System.out.println(" a is "+a+" b is "+b);
// swap(a,b);
//
//        System.out.println(" after  fucntion call ");
//        System.out.println(" a is "+a+" b is "+b);
//
//    }
//}
//class fun{
//
//}

//
//public class Calling_method {
//
//    //    fucn()
////    {}
////    fuinc()
////    {}
//    //instance var:
//    int b=10;
//    public  static   void print()
//    {
//
//    }
//
//    public static void main(String[] args) {
//        // types of variables in java :
////        1) instance vara
////                2) local var
////                3) static var
//        int a=10;
//        System.out.println(" a "+a);
//
//
//
//    }
//}

// exception program
// Importing File class
//import java.io.File;
//// Importing the IOException class for handling errors
//import java.io.IOException;
//class CreateFile {
//    public static void main(String args[]) {
//        try {
//            // Creating an object of a file
//            File a = new File("D:FileOperationExample.txt");
//            if (a.createNewFile()) {
//                System.out.println("File " + a.getName() + " is created successfully.");
//            } else {
//                System.out.println("File is already exist in the directory.");
//            }
//        } catch (IOException exception) {
//            System.out.println("An unexpected error is occurred.");
//            exception.printStackTrace();
//        }
//    }
//}

// tokens program
//import java.util.Scanner;

//import java.util.Scanner;

//import java.util.Scanner;

//import java.util.Scanner;
//
//public class Demo {
//    public static void main(String[] args) {
//        // var_nam
//        /// NumObtaiuned : cate:
////       1) variale insi:
////         // data_type var_name = value / literal
////
//////       2) " " decala:
//////
//////        data_type var_name ;
//        int a = 10 ;
//
//        // System.out.println(" "); // output stream
//        System.out.println(" teh value of a is "+a);


//         input // stream
//        Scanner <obj_name> = new scanner(System.in);
//        new -> keyword -> OBJECT CREATION
     //   System.out.println(" enter a number ");
//        Scanner sc = new Scanner(System.in);
//        float b=sc.nextFloat();
        //System.out.println(" the value of b is "+b);
//        Scanner sc=new Scanner(System.in);
//        char ch= sc.nextLine().charAt(0);
////        System.out.println(" the character is => " +ch);/
//        int a=10, b=20;
//
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println(" a => "+a);
//        System.out.println(" b  => "+b);
        // ++
////    int a
//    }
//
//}
// destructor program
//public class Destructor {
//    public static void main(String[] args)
//    {
//        Destructor dm = new Destructor();
//        dm.finalize();
//        dm = null;
//        System.gc();
//        System.out.println("In the Main Method");
//        dm.finalize();
//    }
//    protected void finalize()
//    {
//        System.out.println("garbage collected ");
//    }
//
//}