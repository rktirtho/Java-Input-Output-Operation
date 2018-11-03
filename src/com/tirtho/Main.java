/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tirtho;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input=new Scanner(System.in);
        System.out.print("Please input a valid path: ");
        Path path=Paths.get(input.nextLine());
        String n = (1==1) ? "Flase":"True";
        System.out.println(n);
        //F:\Projrct\Web Design\div\index.html
        
        if (Files.exists(path)) {
            System.out.println("Existing file name is "+ path.getFileName());
            System.out.printf("\n%s a directory%n", Files.isDirectory(path)? "Is" : "Is not");
            System.out.println("Last Modified Time is :"+ Files.getLastModifiedTime(path));
            
            System.out.printf("%s absulate%n",path.isAbsolute() ? "Is" : "Is not");
            System.out.println("File Size :"+Files.size(path));
            System.out.println("Absulate Path :"+path.toAbsolutePath());
           
            
        }
        if (Files.isDirectory(path)) {
            DirectoryStream<Path> directoryStream=Files.newDirectoryStream(path);
            
            for (Path path1 : directoryStream) {
                System.out.println(path1);
            }
            
        }
           
    }
    
}
