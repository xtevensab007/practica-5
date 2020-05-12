/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javax.swing.JOptionPane;

/**
 *
 * @author STEVEN
 */
public class OperacionMatrix {
    
    /**
     * @esta funcion realiza la suma dos matrices de igual tamano
     * @param matrixA
     * @param matrixB
     * @return 
     */
    public static Integer[][] suma (Integer[][] matrixA, Integer[][] matrixB){
      if (matrixA.length==matrixB.length && matrixA[0].length==matrixB[0].length)
    {
        Integer[][] matrixSum = new Integer[matrixA.length][matrixA[0].length];
         for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
         }
        return matrixSum;
        }
    else
    {
        JOptionPane.showMessageDialog(null,"Sus matatrices ingresadas no cumplen con las condiciones para ser sumadas");
   }
        return null;
    }
    /**
     * @esta funcion realiza la resta de dos matrices de igual tamaño
     * @param matrixA
     * @param matrixB
     * @return 
     */
    public static Integer[][] resta (Integer[][] matrixA, Integer[][] matrixB){
        if (matrixA.length==matrixB.length && matrixA[0].length==matrixB[0].length)
    {
        Integer[][] matrixres = new Integer[matrixA.length][matrixA[0].length];
         for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixres[i][j] = matrixA[i][j] - matrixB[i][j];
            }
         }
        return matrixres;
        }
    else
    {
        JOptionPane.showMessageDialog(null,"Sus matatrices ingresadas no cumplen con las condiciones para ser restadas");
   }
        return null;
    }
    /**
     * @esta funcion realiza la multiplicacion de dos matrices de igual tamaño
     * @param matrixA
     * @param matrixB
     * @return 
     */
    public static Integer[][] multi (Integer[][] matrixA, Integer[][] matrixB){
        if (matrixA.length==matrixB.length && matrixA[0].length==matrixB[0].length)
    {
        Integer[][] matrixmulti = new Integer[matrixA.length][matrixA[0].length];
         for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixmulti[i][j] = matrixA[i][j] * matrixB[i][j];
            }
         }
        return matrixmulti;
        }
    else
    {
        JOptionPane.showMessageDialog(null,"Sus matatrices ingresadas no cumplen con las condiciones para ser multiplicadas ");
   }
        return null;
    }
    /**
     * @esta funcion transpone la matriz A
     * @param matrixA
     * @return 
     */
    public static Integer[][] transpuesta (Integer[][] matrixA){
        
        Integer[][] matrixtras = new Integer[matrixA[0].length][matrixA.length];
        for (int i=0;i<matrixA.length;i++)
         {
        for(int j=0;j<matrixA[0].length;j++)
        {
            
            matrixtras[j][i]=matrixA[i][j];
            
        }
    }
        return matrixtras;
    }
    /**
     * @esta funcion eleva los elementos de la matriz A al cubo
     * @param matrixA
     * @return 
     */
    public static Integer[][] elevada (Integer[][] matrixA){
        
        Integer[][] matrixelevada = new Integer[matrixA.length][matrixA[0].length];
         for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixelevada[i][j] = matrixA[i][j]*matrixA[i][j]*matrixA[i][j];
            }
         }
        return matrixelevada;
    }
    /**
     * @esta funcion realiza la multiplicacion matricial de dos matrices 
     * @param matrixA
     * @param matrixB
     * @return 
     */
    public static Integer[][] punto (Integer[][] matrixA, Integer[][] matrixB){
        
        
        if (matrixA[0].length==matrixB.length)
    {
      
            Integer[][] matrixpunto = new Integer[matrixA.length][matrixB[0].length];
      
                
            for (int i=0; i < matrixA.length; i++) {
                for (int j=0; j < matrixB[0].length; j++) {
                    matrixpunto[i][j] = 0;
                    for (int k=0; k<matrixB.length; k++){
                        matrixpunto[i][j] = matrixpunto[i][j] + (matrixA[i][k] * matrixB[k][j]);
                    }
                 }
            }
          
           return matrixpunto;
        
   }
    else
    {
        JOptionPane.showMessageDialog(null,"Sus matatrices ingresadas no cumplen con las condiciones para ser multiplicadas (n!=q)");
   }
        return null;
    }
    
   
        
    
    
}
