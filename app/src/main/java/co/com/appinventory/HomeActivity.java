package co.com.appinventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import co.com.appinventory.databinding.ActivityHome2Binding;
import co.com.appinventory.databinding.ActivityMain3Binding;

public class HomeActivity extends AppCompatActivity {
    private ActivityHome2Binding home2Binding;
    private Button btnRegister;
    private DbHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        home2Binding = ActivityHome2Binding.inflate(getLayoutInflater());
        View view = home2Binding.getRoot();
        dbHelper = new DbHelper(this);
        setContentView(view);
    }

    public void nuevoProducto(View view) {
        Intent intent = new Intent(this, AddProductActivity.class);
        startActivity(intent);
    }

    public void inBuscarProducto(View view) {
        Intent intent = new Intent(this, CheckProductActivity.class);
        startActivity(intent);
    }

    public void logOut(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}