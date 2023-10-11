public class Pepito {

    public static void main(String[] args){
    //Declarar variable e incrementarla

    int numero = 0;
    numero =numero + 1;
        System.out.println(numero);
        numero +=1;
        System.out.println(numero);
        numero++;
        System.out.println(numero);
       int numero2=100;
        numero2=numero2-5;
        System.out.println("numero2->"+numero2);
        numero2-=5;
        System.out.println("numero2->"+numero2);
        numero2--;
        System.out.println("numero2->"+numero2);

        //Multiplicar

        int numero3 =7;
        numero3=numero3 * 3;
        System.out.println("numero3->"+numero3);
        numero3*=2;
        System.out.println("numero3->"+numero3);

        //Division -dividir entre 10 y luego entre 5

        int numero4 =100;
        numero4=numero4/10;
        System.out.println("numero4->"+numero4);
        numero4/=5;
        System.out.println("numero4->"+numero4);

        //Declarar una variable con el nombre numero5 asignar un valor de 8
        //Obtener el resto de dividirlo entre 3

        int numero5=8;
        numero5=numero5%3;
        System.out.println("numero5->"+numero5);
        numero5%=3;
        System.out.println("numero5->"+numero5);

        //Caso de asignar valores

        int num1=10, num2=2, num3=0;
        num3= num1 + ++num2;
        System.out.println(num3);
        System.out.println("numero3->"+numero2);

        int num4=10, num5=2, num6=0;
        num6=num4+num5++;
        System.out.println(num6);
        System.out.println("numro6->"+num6);

        //Operadores de comparacion
        //Declarar una variable con el valor de 10 y decir si es par
        //Tip-> operador comparacion y algun operador aritmetico
        //Ejemplo1
        int valor=10;
        System.out.println(valor%2==0);
        System.out.println("Es par?"+(valor%2==0));

            //Ejemplo2
      int valor1=11;
        System.out.println(valor1%2==0);

        //Decir si un numero es multiplo de 3
        int valor2=3;
        System.out.println("¿Es multiplo de tres?"+(valor2%3));
        System.out.println("¿Es multiplo de tres?"+(valor2%1));
        System.out.println("¿Es multiplo de tres?"+(valor2%2));

        //Declarar una variable y y asignarle el numero  -5
        int valor3=-5;

        //Decir si es positivo
        System.out.println("¿Es positivo?"+(valor3>=0));

        //Decir se es negativo
        System.out.println("¿Es negativo?"+(valor3<0));


        //Declarar una variable importe con el 50
        //Si el impoirte es mayor o igual a 100 calcular el 10% de descuento
        //Pero si el importe es menor calcular el 3%

        float importe = 50f;
        if (importe>=100){
            System.out.println("Entra al IF");
            System.out.println(importe *0.10);
        }else
        {
            System.out.println("Entra al ELSE");
            System.out.println(importe*0.03);
        }


        //Declarar una variable de numero de hijos
        byte numeroDeHijos=5;

        //Decir si es familia numerosa o NO es famillia numerosa
           if (numeroDeHijos>=3){
               System.out.println("Considerar familia numerosa");

           }else {
               System.out.println("No es familia numerosa");
           }


        //Una variable que guarde la edad
        byte edad=25;

        //Decir si es mayor o menor de edad
        if (edad>=18){
            System.out.println("Mayor de edad");
        }else {
            System.out.println("Menor de edad");
        }


        // Declarar una variable para el numero del mes
        byte mes=8;
        //Decir los dias de ese mes
        if (mes==1||mes==3|| mes==5|| mes==7|| mes==8 ||mes==10||mes==12){
            System.out.println("El mes tiene 31 dias");

        }else {
            System.out.println("El mes tiene 30 dias");
        }

        //Si el numero esta entre 5 y 15 mostrar que te has ganado un
        int numero=7;






    }
}