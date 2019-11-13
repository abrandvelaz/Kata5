/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5;

import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 *
 * @author Alber
 */
public class CurrencyDialog extends JPanel {
    
    
     public CurrencyDialog(){
        super();
        add(createCombobox());
    }

    private JComboBox createCombobox() {
        return new JComboBox(new String[] {"EUR","USD","GBP"});
    }
}
