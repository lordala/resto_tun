package resto.tunsie.presentation;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import resto.tunsie.entities.Restaurateur;
import resto.tunsie.dao.RestaurateurDAO;

/**
 *
 * @author MARWEN
 */
public class RestaurateurTable extends AbstractTableModel{

    String[] tab={"id","nom","prenom","login","mail"};
    List <Restaurateur> rest=new ArrayList<Restaurateur>();


    @Override
    public int getRowCount() {
        return rest.size();
    }

    @Override
    public int getColumnCount() {
        return tab.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
           case 0:
               return rest.get(rowIndex).getId_restaurateur();
           case 1:
            return rest.get(rowIndex).getNom_restaurateur();
           case 2:
            return rest.get(rowIndex).getPrenom_restaurateur();
           case 3:
               return rest.get(rowIndex).getLogin_restaurateur();
           case 4:
              return rest.get(rowIndex).getMail_restaurateur();
                     
           default:
                   throw new IllegalArgumentException();
       }
    }

public RestaurateurTable()
{
RestaurateurDAO rdao=new RestaurateurDAO();
rest=rdao.DisplayAllRestaurateur();

}

    @Override
    public String getColumnName(int column) {
        return tab[column];}

}

