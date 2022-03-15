package tp.alibouche.pizzarecipes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import tp.alibouche.pizzarecipes.classes.Produit;
import tp.alibouche.pizzarecipes.service.ProduitService;

public class DetailsPizza extends AppCompatActivity {
    private ProduitService ps = ProduitService.getInstance();
    private ImageView icon;
    private TextView nom;
    private TextView description;
    private TextView ingredients;
    private TextView preparation;


    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_produits);
        //Intent intent = getIntent();
        //int id = Integer.parseInt(intent.getStringExtra("idp"));
        //ps = ProduitService.getInstance();
        icon = findViewById(R.id.iconPd);
        nom = findViewById(R.id.nomPd);
        description = findViewById(R.id.descriptionPd);
        ingredients = findViewById(R.id.ingredientsPd);
        preparation = findViewById(R.id.preparationPd);


        Produit p = ps.findById(Integer.parseInt(getIntent().getStringExtra("idp")));

        icon.setImageResource(p.getPhoto());
        //desc = findViewById(R.id.desc);
        //desc.setText(p.getDescription());
        nom.setText(p.getNom());
        description.setText(p.getDescription());
        ingredients.setText(p.getDetailsIngred());
        preparation.setText(p.getPreparation());
    }
}
