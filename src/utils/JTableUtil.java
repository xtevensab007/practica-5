/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author STEVEN
 */
public class JTableUtil {
    /**
     * @obtenemos los datos de filas y columnas de las matrices A y B
     * @param table
     * @return 
     */
    public static Integer[][] getTableData(JTable table){
        TableModel model = table.getModel();
        Integer[][] matrix = new Integer[model.getRowCount()][model.getColumnCount()];

        for (int j = 0; j < model.getRowCount(); j++){
              for (int i = 0; i < model.getColumnCount(); i++) {
                matrix[j][i] = (Integer) model.getValueAt(j, i);
            }
        }

    return matrix;
    
    }
/**
 * @imprimimos los datos de las matrices despues de operarlas 
 * @param matrixSuma
 * @param tableResult 
 */
    public static void setDataToTable(Integer[][] matrixSuma, JTable tableResult) {
        int rows = matrixSuma.length;
        int cols = matrixSuma[0].length;
        DefaultTableModel model1 = (DefaultTableModel) tableResult.getModel();
        model1.setRowCount(rows);
        model1.setColumnCount(cols);
       for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tableResult.setValueAt(matrixSuma[i][j], i, j);
            }  
        }
    }
    
}
