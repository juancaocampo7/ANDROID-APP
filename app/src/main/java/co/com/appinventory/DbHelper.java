package co.com.appinventory;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 3;
    public static final String DATABASE_NAME = "appInventory";
    public DbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase SQLiteDatabase) {
        SQLiteDatabase.execSQL("CREATE TABLE users " +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT," + " name VARCHAR(50), email VARCHAR(50),"
                + "identification int, password VARCHAR (16))");
        SQLiteDatabase.execSQL("CREATE TABLE products(idpro INTEGER PRIMARY KEY AUTOINCREMENT  ,"+
                "productName VARCHAR(60),productReference VARCHAR(60),"+"productId int,"+ " description VARCHAR(60))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase SQLiteDatabase, int oldVersion, int newVersion) {
        SQLiteDatabase.execSQL("DROP TABLE IF EXISTS users");
        SQLiteDatabase.execSQL("DROP TABLE IF EXISTS products");
        onCreate(SQLiteDatabase);
    }
}
