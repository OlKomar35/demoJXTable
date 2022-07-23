package org.olga_komar;

import org.jdesktop.swingx.JXTable;
import org.jdesktop.swingx.JXTitledSeparator;
import org.painlessgridbag.PainlessGridBag;
import org.painlessgridbag.PainlessGridbagConfiguration;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ProfileViews extends JDialog {
    private JDialog jDialog = new JDialog();
    String[][] dataName = {{"1dgddefihetrfhedhfdhjhfkhdtyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyykjfjdjhdhfdfkdn", "2"}, {"3", "4"}, {"5", "6"}, {"5", "6"}, {"5", "6"}, {"5", "6"}};
    String[] dataTitle = {"Number", "Content"};
    private final DefaultTableModel profileProfileModel = new DefaultTableModel(dataName, dataTitle);

    private JXTable jxTable = new JXTable(profileProfileModel);
    private JScrollPane jJScrollPane = new JScrollPane(jxTable);

    public ProfileViews() {
        jDialog.setSize(800, 600);
        jDialog.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width) / 2 - jDialog.getWidth() / 2,
                (Toolkit.getDefaultToolkit().getScreenSize().height) / 2 - jDialog.getHeight() / 2);
        jDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        JPanel panelSettings = new JPanel();
        panelSettings.setBorder(new EtchedBorder());
        jDialog.add(panelSettings);

        jxTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jxTable.setColumnControlVisible(true);
        jxTable.setHorizontalScrollEnabled(true);
        jxTable.setEditable(false);
        jxTable.setVisibleRowCount(5);
        jxTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        PainlessGridbagConfiguration config = new PainlessGridbagConfiguration();
        config.setFirstColumnLeftSpacing(5);
        config.setFirstRowTopSpacing(5);
        config.setLastColumnRightSpacing(5);
        config.setLastRowBottomSpacing(5);
        PainlessGridBag gbl = new PainlessGridBag(panelSettings, config, false);


        gbl.row()
                .cell(new JXTitledSeparator("Profile")).fillX();


        gbl.row()
                .cellX(jJScrollPane, 1).fillXY();


        gbl.doneAndPushEverythingToTop();

        jDialog.setVisible(true);

    }
}
