package com.levelup.view;

import com.levelup.entity.Citizen;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class CitizenTableModelContainer extends AbstractTableModel {

    private String[] columns = {"ID", "First Name", "Last Name", "Age", "Street ID"};
    private List<Citizen> data = new ArrayList<>();
    private List<Citizen> updated = new ArrayList<>();

    public List<Citizen> getData() {
        return data;
    }

    public void setData(List<Citizen> data) {
        this.data = data;
    }


    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex != 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Citizen citizen = data.get(rowIndex);
        switch (columnIndex) {
            case 1 : return citizen.getFistName();
            case 2 : return citizen.getLastName();
            case 3 : return citizen.getAge();
            case 4 : return citizen.getStreetId();
            default: return citizen.getId();
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Citizen citizen = data.get(rowIndex);
        switch (columnIndex) {
            case 1 : citizen.setFistName((String)aValue); break;
            case 2 : citizen.setLastName((String)aValue); break;
            case 3 : citizen.setAge(Integer.parseInt((String)aValue)); break;
            case 4 : citizen.setStreetId(Long.parseLong((String)aValue)); break;
        }
    }

    public Citizen getSelectRowData(int rowIndex) {
        return data.get(rowIndex);
    }
}
