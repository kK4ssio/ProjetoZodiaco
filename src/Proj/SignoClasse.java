//Programa que leia nome, sexo, dia, mes, ano. e diga qual é seu signo.
package Proj;

import java.util.Scanner;

/**
 * ;
 *
 * @aluno Kassio Dias Monteiro
 */
public class SignoClasse {
//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome ");
        String nome = sc.nextLine();
        System.out.print("Digite seu sexo (M/F)");
        char sexo = sc.nextLine().charAt(0);
        System.out.print("Digite o dia de seu nascimento ");
        int dia = sc.nextInt();
        System.out.print("Digite o mes de seu nascimento ");
        int mes = sc.nextInt();
        System.out.print("Digite o ano de seu nascimento ");
        int ano = sc.nextInt();

        String signo = "";
        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Aquário";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Peixes";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Touro";
        }else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <=20)) {
            signo = "Gemeos";
        }else if ((mes == 7 && dia >= 22) || (mes == 8 && dia <=20)) {
            signo = "Leão";
        }else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <=22)) {
            signo = "Libra";
        }else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <=21)) {
            signo = "Sagitário";
        }else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 21)) {
            signo = "Cancer";
        }else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22 )) {
            signo = "Virgem";
        }else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21 )) {
            signo = "Escorpião";
        }else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
            signo = "Capricórnio";
        }
            System.out.print("Olá, " +nome );
            System.out.print(", voce nasceu em " +dia +mes +ano);
            System.out.print(" e seu signo é " + signo);
            System.out.print(" e voce é do sexo:  " +sexo);
        }
    }

