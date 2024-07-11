/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ph47056.service;

import com.mycompany.ph47056.model.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class NhanVienService {

    public ArrayList<NhanVien> lstNV = new ArrayList<>();

    public ArrayList<NhanVien> GetNV() {
       DatabaseConnectionManager_SQLServer dcm = new DatabaseConnectionManager_SQLServer("PTPM_FINALLY_JAVA_SOF203", "sa", "12");
        try {
            Connection c = dcm.getConnection();
            PreparedStatement ps = c.prepareStatement("Select*from NhanVien");
            ResultSet rs = ps.executeQuery();
            lstNV.clear();
            while (rs.next()) {
                String MaNV = rs.getString("Ma");
                String TenNV = rs.getString("Ten");
                String DemNV = rs.getString("TenDem");
                String HoNV = rs.getString("Ho");

                NhanVien nv = new NhanVien(MaNV, HoNV, DemNV, TenNV);
                lstNV.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return lstNV;
    }

    public void updateNV(NhanVien nv, int index) {
        lstNV.set(index, nv);
    }

    public void deleteNV(int index) {

        lstNV.remove(index);
    }
}
