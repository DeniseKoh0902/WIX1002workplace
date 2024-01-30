/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2019;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class Q3_2019 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String genome="";
//        do{
//            System.out.println("Enter genome string [quit to stop]: ");
//            genome=sc.nextLine();
//            findGenes(genome);
//        }while(!genome.equalsIgnoreCase("quit"));
//        
//        
//        //must start with ATG and ends before TAG,TAA,TGA
//        //length of gene string must multiple of 3
//    }
//    
//    public static void findGenes(String genome){
////        int start=genome.indexOf("ATG");
////        while(start!=-1){
////            int end=findStopCodon(genome,start+3);//not include ATG
////            if(end!=-1){
////                String gene=genome.substring(start+3,end);
////                if (gene.length()%3==0 && !gene.contains("TAG") && !gene.contains("TAA") && !gene.contains("TGA")){
////                    System.out.println(gene);
////                }
////                start=genome.indexOf("ATG",end);
////                 
////            }else{
////               start = genome.indexOf("ATG", start + 1); // Look for the next ATG 
////            }
////        }
////        
////        if(genome.indexOf("ATG")==-1){
////            System.out.println("No gene is found");
////        }
//         int startIndex = 0;
//
//    while (true) {
//        int start = genome.indexOf("ATG", startIndex);
//        if (start == -1) {
//            break;  // No more start codons
//        }
//
//        int end = findStopCodon(genome, start + 3); // not include ATG
//        if (end != -1) {
//            String gene = genome.substring(start + 3, end);
//
//            if (gene.length() % 3 == 0 && !gene.contains("TAG") && !gene.contains("TAA") && !gene.contains("TGA")) {
//                System.out.println(gene);
//                startIndex = end + 1;
//                continue;
//            }
//        }
//
//        // No valid gene found, try next start codon
//        startIndex = start + 1;
//    }
//
//    if (genome.indexOf("ATG") == -1) {
//        System.out.println("No gene is found");
//    }
//    
//    }
//    
//    public static int findStopCodon(String genome,int startIndex){
//        int tagIndex=genome.indexOf("TAG",startIndex);//在找到startIndex后再来找
//        int taaIndex=genome.indexOf("TAA",startIndex);
//        int tgaIndex=genome.indexOf("TGA",startIndex);
//        
//        if(tagIndex==-1||(taaIndex != -1 && taaIndex<tagIndex)){//他找不到TAG或者TAA在TAG之前就拿TAA
//            tagIndex=taaIndex;
//        }
//        
//        if(tagIndex==-1||(tgaIndex!=-1 && tgaIndex<tagIndex)){
//            tagIndex=tgaIndex;
//        }
//        
//        return tagIndex;
//    }
        Scanner k = new Scanner(System.in);
        String genome;
        int count = 0; //check gene string is multiple of 3
        
        do {
            boolean geneFound = false; //check gene found
            System.out.print("Enter genome string [quit to stop] : ");
            genome = k.nextLine();
            
            //break immmediately if quit entered
            if(genome.equals("quit")){
                break;
            }
            
            for (int i = 0; i < genome.length() - 2; i++) {
                //check start codon
                if (genome.charAt(i) == 'A' && genome.charAt(i + 1) == 'T' && genome.charAt(i + 2) == 'G') {

                    //check end codon
                    for (int j = i + 3; j < genome.length() - 2; j++) {
                        if ((genome.charAt(j) == 'T' && genome.charAt(j + 1) == 'A' && genome.charAt(j + 2) == 'G')||
                                 (genome.charAt(j) == 'T' && genome.charAt(j + 1) == 'A' && genome.charAt(j + 2) == 'A')||
                                 (genome.charAt(j) == 'T' && genome.charAt(j + 1) == 'G' && genome.charAt(j + 2) == 'A')) {
                            
                            //print gene
                            for (int p = i + 3; p < j; p++) {
                                //not ATG,TAG,TAA,TGA inside gene code
                                if ((genome.charAt(p) == 'A' && genome.charAt(p + 1) == 'T' && genome.charAt(p + 2) == 'G')||
                                         (genome.charAt(p) == 'T' && genome.charAt(p + 1) == 'A' && genome.charAt(p + 2) == 'G')||
                                         (genome.charAt(p) == 'T' && genome.charAt(p + 1) == 'A' && genome.charAt(p + 2) == 'A')
                                        || (genome.charAt(p) == 'T' && genome.charAt(p + 1) == 'G' && genome.charAt(p + 2) == 'A')) {
                                    geneFound = false;
                                    break;
                                }else{
                                   count++; 
                                   geneFound = true;
                                }
                            }
                            //print gene
                            if (count % 3 == 0 && geneFound){
                                for (int p = i + 3; p < j; p++) {
                                    
                                    System.out.print(genome.charAt(p));
                                }
                                System.out.println();
                            }else{
                                geneFound = false;
                            }

                        }
                    }

                }
            }
            if (!geneFound) {
                System.out.println("No gene is found.");
            }

        } while (!genome.equals("quit"));
    }
}
