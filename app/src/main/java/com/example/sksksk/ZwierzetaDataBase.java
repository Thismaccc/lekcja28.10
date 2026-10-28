package com.example.sksksk;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Zwierze.class}, version = 1)
abstract public class ZwierzetaDataBase extends RoomDatabase {

    public abstract ZwierzeDAO zwrocZwierzeDao();

}
