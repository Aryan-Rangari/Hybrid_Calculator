import java.util.Scanner;
import java.lang.Math;
public class calculater {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose one option :");
        System.out.println("1) Simple Calculator");
        System.out.println("2) Scientific  Calculator");
        int d = sc.nextInt();
        if (d==1){
        System.out.println("Chose any one :     ");
        System.out.println("1)Additioan");
        System.out.println("2)Subtraction");
        System.out.println("3)Multiply");
        System.out.println("4)Division");
        int c = sc.nextInt();
        System.out.println("Enter first number :");
        float a = sc.nextInt();
        System.out.println("Enter second number :");
        float b = sc.nextInt();
        float de = a / b ;
       
       
        if(c==1){
        System.out.println("Answer is : "+ (a + b));
        }
        else if(c==2){
        System.out.println("Answer is : "+ (a - b));
        }
        else if(c==3){
        System.out.println("Answer is : "+ (a * b));
        }
        else if(c==4){
        System.out.println("Answer is : "+ de);
        }
        else{
            System.out.println("Sorry.....!");
        }
    }else if (d==2){
        System.out.println("Choose one of them :");
        System.out.println("1) Trignometric Calculator \n2) Exponential Calculator");
        int g = sc.nextInt();
        if(g==1){
            System.out.println("Which value you want to find  :  \n1)Sine(x)\n2)Cosine(x)\n3)Tangent(x)\n4)Secant(x)\n5)Cosecant(x)\n6)Cotangent(x)");
            int f = sc.nextInt();
            System.out.println("Enter the value of radians :");
            int fi = sc.nextInt();
            switch(f){
                case 1:
                System.out.println("Value of sin(" + fi+ ") is "+Math.sin(fi));
                break;
                case 2:
                System.out.println("Value of cos(" + fi+ ") is "+Math.cos(fi));
                 break;
                case 3:
                System.out.println("Value of tan(" + fi+ ") is "+Math.tan(fi));
                 break;
                case 4:
                System.out.println("Value of sec(" + fi+ ") is "+1/(Math.sin(fi)));
                 break;
                case 5:
                System.out.println("Value of cosec(" + fi+ ") is "+1/(Math.cos(fi)));
                 break;
                case 6:
                System.out.println("Value of cot(" + fi+ ") is "+1/(Math.tan(fi)));
                 break;
                default :
                System.out.println("Sorry.....!");
             }
           
            }
        else if(g==2){
            System.out.println(" Choose any one :\n 1) To find power \n 2) To find sqaure root");
            int h = sc.nextInt();
            switch(h){
                case 1:
                System.out.println("Enter the number :");
                int t = sc.nextInt();
                System.out.println("Enter the Power : ");
                int k = sc.nextInt();
                System.out.println("The power of "+t+"^"+k +" is "+Math.pow(t,k));
                break;
                case 2:
                System.out.println("Enter the number ");
                int v = sc.nextInt();
                System.out.println("The sqaure root "+ v +" is "+Math.sqrt(v));
                break;
                default :
                System.out.println("Sorry.....!");

            }


            

        }
        else{
            System.out.println("Sorry.....!");
        }


    }
    else{
        System.out.println("Sorry.....!");
    }
    }
    
    
}
