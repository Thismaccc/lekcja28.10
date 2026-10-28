package com.example.sksksk;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity

public class Zwierze {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String gatunek;
    @ColumnInfo(name = "srodowisko_zycia")
    public String srodowiskoZycia;

    public boolean czyRoslinozerne;
    public int sredniWiek;

    public Zwierze(String gatunek, String srodowiskoZycia, int sredniWiek, boolean czyRoslinozerne) {
        this.gatunek = gatunek;
        this.srodowiskoZycia = srodowiskoZycia;
        this.sredniWiek = sredniWiek;
        this.czyRoslinozerne = czyRoslinozerne;
    }

    public Zwierze() {
    }
}
