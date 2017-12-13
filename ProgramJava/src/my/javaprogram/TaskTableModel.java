package my.javaprogram;

import javax.swing.table.AbstractTableModel;
import java.sql.*;
import java.util.ArrayList;

// класс табличной модели для БД
public class TaskTableModel extends AbstractTableModel {
    
    private int colnum=24;
    private int rownum;
    private String[] colNames={
        "Номер","Комментарий","N","Y","Ty","Ттреб1","Ттреб2","R1","R2","R3","R4","R5","R6","R7","R8",
        "Ts1","Ts2","Ts3","Ts4","Ts5","Ts6","Ts7","Ts8","Mmax","Eзадан"
    };
    private  ArrayList<String[]> ResultSets;
    
    /** Creates a new instance of FoodTableModel */
    public TaskTableModel(ResultSet rs) {
      
      ResultSets=new ArrayList<String[]>();  
    
      try{
        while(rs.next()){
      
              String[] row={
                rs.getString("NumberTask"),rs.getString("Description"),rs.getString("N"), rs.getString("Y"),rs.getString("Ty"),
                rs.getString("Ttreb1"),rs.getString("Ttreb2"),rs.getString("R1"),rs.getString("R2"),
                rs.getString("R3"),rs.getString("R4"),rs.getString("R5"),rs.getString("R6"),rs.getString("R7"),
                rs.getString("R8"),rs.getString("Ts1"),rs.getString("Ts2"),rs.getString("Ts3"),rs.getString("Ts4"),
                rs.getString("Ts5"),rs.getString("Ts6"),rs.getString("Ts7"),rs.getString("Ts8"),
                rs.getString("Mmax"),rs.getString("Ezadan")
          
            };
            ResultSets.add(row);
      
         }   
      }
      catch(Exception e){
          System.out.println("Exception in TaskTableModel");
            }
        
    }
    
    //функция получения текущего значения
    public Object getValueAt(int rowindex, int columnindex) {
        
       String[] row=ResultSets.get(rowindex);
       return row[columnindex];
        
    }
    
    //функция получения количества строк
    public int getRowCount() {
        return ResultSets.size();
    }
    
    //функция получения количества столбцов
    public int getColumnCount() {
        return colnum;
    }

    //функция получения названия столбца
    public String getColumnName(int param) {

       return colNames[param];
    }
    
}