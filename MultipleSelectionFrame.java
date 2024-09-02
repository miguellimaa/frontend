
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MultipleSelectionFrame extends JFrame 
{
   private final JList<String> colorJList; // list to hold color names
   private JList<String> copyJList;
   private final JList<String> copyJList2; // copia do j list
   private JButton copyJButton;
   private JButton copyJButton2; //copia do j button
   private static final String[] colorNames = {"Black", "Blue", "Cyan",
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", 
      "Pink", "Red", "White", "Yellow"};

   // MultipleSelectionFrame constructor
   public MultipleSelectionFrame()
   {
      super("Multiple Selection Lists");
      setLayout(new FlowLayout());

      colorJList = new JList<String>(colorNames); // list of color names
      colorJList.setVisibleRowCount(5); // show five rows
      colorJList.setSelectionMode(
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      add(new JScrollPane(colorJList)); 

      copyJButton = new JButton("Copy >>>"); 
      copyJButton.addActionListener(
         new ActionListener() 
         {  
       
            @Override
            public void actionPerformed(ActionEvent event)
            {
            
               copyJList.setListData(
                  colorJList.getSelectedValuesList().toArray(
                     new String[0]));
            }
         } 
      ); 

      add(copyJButton); 

      copyJList = new JList<String>(); 
      copyJList.setVisibleRowCount(5); 
      copyJList.setFixedCellWidth(100); 
      copyJList.setFixedCellHeight(15); 
      copyJList.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      add(new JScrollPane(copyJList)); 
      copyJButton2 = new JButton("Copy >>>"); 
      copyJButton2.addActionListener(
         new ActionListener() 
         {  
       
            @Override
            public void actionPerformed(ActionEvent event)
            {
            
               copyJList2.setListData(
                  copyJList.getSelectedValuesList().toArray(
                     new String[0]));
            }
         } 
      ); 

      add(copyJButton2); 

      copyJList2 = new JList<String>(); 
      copyJList2.setVisibleRowCount(5); 
      copyJList2.setFixedCellWidth(100); 
      copyJList2.setFixedCellHeight(15); 
      copyJList2.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      add(new JScrollPane(copyJList2));   } 
} 
