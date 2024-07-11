/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ph47056.model;

/**
 *
 * @author Acer
 */
public class NhanVien {
    private String MaNV;
    private String HoNV;
    private String DemNV;
    private String TenNV;

    public NhanVien() {
    }

    public NhanVien(String MaNV, String HoNV, String DemNV, String TenNV) {
        this.MaNV = MaNV;
        this.HoNV = HoNV;
        this.DemNV = DemNV;
        this.TenNV = TenNV;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoNV() {
        return HoNV;
    }

    public void setHoNV(String HoNV) {
        this.HoNV = HoNV;
    }

    public String getDemNV() {
        return DemNV;
    }

    public void setDemNV(String DemNV) {
        this.DemNV = DemNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "MaNV=" + MaNV + ", HoNV=" + HoNV + ", DemNV=" + DemNV + ", TenNV=" + TenNV + '}';
    }
   
    
}
