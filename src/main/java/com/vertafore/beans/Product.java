package com.vertafore.beans;

import jakarta.persistence.*;
//trying git hub -- edited
@Entity
@Table(name="MYPRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="PID",length = 10)
    private int pid;
    @Column(name="PNAME",length=20)
    private String pname;
    @Column(name="PCOST",length = 6)
    private int pcost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPcost() {
        return pcost;
    }

    public void setPcost(int pcost) {
        this.pcost = pcost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pcost=" + pcost +
                '}';
    }
}
