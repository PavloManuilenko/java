package com.levelup.view.impl;

import javax.swing.*;

import com.levelup.entity.Citizen;
import com.levelup.view.Action;
import com.levelup.view.CitizenTableModelContainer;

import java.awt.*;
import java.util.List;

public class CitizenTablePanel extends JPanel implements Action {

    private final JTable table;
    private final CreateCitizenDialog dialog = new CreateCitizenDialog();
    private final CitizenTableModelContainer tableContainer;

    public CitizenTablePanel() {
        this.tableContainer = new CitizenTableModelContainer();
        this.table = new JTable(tableContainer);
        setName("Citizen Tab");
        init();
    }

    private void init() {
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setSize(new Dimension(595, 300));
        add(scrollPane);
        setSize(new Dimension(595, 300));
    }

    @Override
    public void create() {
        dialog.setVisible(true);
        if (dialog.isOkPressed()) {
            tableContainer.getData().add(dialog.getEntity());
        }
    }

    @Override
    public List<Citizen> read() {
        return tableContainer.getData();
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {
        Citizen citizen = tableContainer.getSelectRowData(table.getSelectedRow());
        tableContainer.getData().remove(citizen);
    }
}
