/**
 *DamArrayApp class creates a dam array and prints the dam objects.
 *Contains a method that will return the number of comparisons when using the printDam() method.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;


public class DamArrayApp
{

    public static String filename = "..\\bin\\Dam_Levels_Individual_Nov2015-Mar2016.csv";
    public static int num =0; 


    public static void main(String args[])
    {

        if (args.length >0)
        {
            printDam(args[0]);
            System.out.println(getnum());
        }
        else
            printAllDams();
    }

    public static Dam[] makearray(){

        File file = new File(filename);

        try{
            Scanner read = new Scanner(file);
            read.nextLine();
            int count =-1;
            Dam[] allDams = new Dam[211];

            while (read.hasNext()){

                count = count + 1;
                String data = read.nextLine();
                String[] arr = data.split(",");

                if (arr.length > 42){
                    String[] arra = new String[3];
                    arra[0] = arr[2].toString().trim();
                    arra[1] = arr[10].toString();
                    arra[2] = arr[42].toString();
                    allDams[count] = new Dam(arra[0],arra[1],arra[2]);

                    String arraOutput = Arrays.toString(arra);
                }

                else if(arr.length > 10){
                    String arrOutput = Arrays.toString(arr);
                    allDams[count] = new Dam(arr[2].toString().trim(),arr[10].toString()," ");
                }
            }
            read.close();
            return (allDams);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return (null);
    }

    public static String[] DamNames(){
        String[] Names = new String[makearray().length];
        for (int i =0;i < makearray().length;i++){
            Names[i] = makearray()[i].getName();
        }
        return Names;
    }

    public static void printAllDams(){
        Dam[] a = makearray();
        for (Dam i: a){
            System.out.println(i);   
        }
    }

    public static void printDam(String damName){
        int counter = 0;
        Dam[] b = makearray();
        for (Dam j: b){
            if (j.getName().equals(damName))
            {
                System.out.println(j);
                counter += 1;
                break;
            }
            else
                num += 1;
        }

        if (counter == 0){
            System.out.println("Dam not found");
        }
    }


    /**
     *@return the number of comparisons made before finding Dam object
     */
    public static int getnum()
    {return(num);}
}