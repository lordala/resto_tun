/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.tunsie.presentation;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import resto.tunsie.dao.RestaurantDAO;
import resto.tunsie.dao.RestaurateurDAO;
import resto.tunsie.entities.Restaurant;
import resto.tunsie.entities.Restaurateur;

/**
 *
 * @author kaka
 */
public class Restaurant_table extends AbstractTableModel{

    String[] tab={"id","nom","adress","telephone","id_restaurateur","nbr_fourchette"};
    List <Restaurant> rest=new ArrayList<Restaurant>();
    
    
    public int getRowCount() {
        return rest.size();
    }

    public int getColumnCount() {
        return tab.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        
         switch(columnIndex){
           case 0:
               return rest.get(rowIndex).getId();
           case 1:
            return rest.get(rowIndex).getNom();
           case 2:
            return rest.get(rowIndex).getAdress();
           case 3:
               return rest.get(rowIndex).getTel();
           case 4:
              return rest.get(rowIndex).getId_res();
               
               case 5:
              return rest.get(rowIndex).getNbr_fourchette();
                     
           default:
                   throw new IllegalArgumentException();
       }
        
        
    }
    
    public Restaurant_table()
{
RestaurantDAO rdao=new RestaurantDAO();
rest=rdao.DisplayAllRestaurant();

}

    @Override
    public String getColumnName(int column) {
        return tab[column];}

    
}
