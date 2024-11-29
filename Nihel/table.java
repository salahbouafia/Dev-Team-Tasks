package ExoFour;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;


public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez entrer la taille du tableau : ");
        int n = sc.nextInt();
        int[] table = new int[n];
        System.out.print("Veuillez entrer les elements du tableau : ");
        for (int i = 0; i < n; i++) {
            table[i] = sc.nextInt();
        }
        boolean sortir = false;
        while (!sortir) {
            System.out.println("Veuillez choisir une operation : ");
            System.out.println("1. Trouver la valeur maximale");
            System.out.println("2. Trouver la valeur minimale");
            System.out.println("3. Trierr le tableau de A à Z");
            System.out.println("4. Trier le tableau de Z à A");
            System.out.println("5. Supprimer un element du tableau");
            System.out.println("6. Ajouter un element au tableau");
            System.out.println("7. Quitter");
            String numero = sc.next();
            switch (numero) {
                case "1":{
                    findMaxValue(table);
                    break;
                }

                case "2": {
                    findMinValue(table);
                    break;
                }
                case "3":
                    sortTableAscending(table);
                    break;
                case "4":
                    sortTableDescending(table);
                    break;
                case "5":
                    table = deleteElement(table, sc);
                    break;
                case "6":
                    table = addElement(table, sc);
                    break;
                case "7":
                    sortir = true;
                    break;
                default:
                    System.out.println("veuillez reessaiyer et choisir une operation disponible");
                    break;
            }
        }
    }

    private static void findMaxValue(int[] table) {
            int max = Arrays.stream(table).max().orElse(Integer.MIN_VALUE);
        System.out.println("La valeur maximale est : " + max);
    }

    private static void findMinValue(int[] table) {
        int min = Arrays.stream(table).min().orElse(Integer.MAX_VALUE);
        System.out.println("La valeur minimale est : " + min);
    }

    private static void sortTableAscending(int[] table) {
        Arrays.sort(table);
        System.out.println("Tableau trie de A à Z: " + Arrays.toString(table));
    }

    private static void sortTableDescending(int[] table) {
        Arrays.sort(table);
        int[] reversedTable = new int[table.length];
        for (int i = 0; i < table.length; i++) {
            reversedTable[i] = table[table.length - 1 - i];
        }
        System.out.println("Tableau trie de Z à A: " + Arrays.toString(reversedTable));
    }

    private static int[] deleteElement(int[] table, Scanner scanner) {
        System.out.println("Entrez la valeur a supprimer: ");
        int valeurASupprimer = scanner.nextInt();
        int[] newTable = Arrays.stream(table).filter(val -> val != valeurASupprimer).toArray();
        System.out.println("voici le tableau apres suppression  " + Arrays.toString(newTable));
        return newTable;
    }

    private static int[] addElement(int[] table, Scanner scanner) {
        System.out.println("Entrez la valeur à ajouter:");
        int valeurAAjouter = scanner.nextInt();
        int[] newTable = Arrays.copyOf(table, table.length + 1);
        newTable[table.length] = valeurAAjouter;
        System.out.println("Tableau après ajout: " + Arrays.toString(newTable));
        return newTable;
    }
}
