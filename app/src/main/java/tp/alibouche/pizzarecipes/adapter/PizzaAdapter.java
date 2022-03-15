package tp.alibouche.pizzarecipes.adapter;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import tp.alibouche.pizzarecipes.R;
import tp.alibouche.pizzarecipes.classes.Produit;

public class PizzaAdapter extends BaseAdapter {

    private List<Produit> produits;
    private LayoutInflater inflater;

    public  PizzaAdapter(Activity activity, List<Produit> produits) {
        this.produits = produits;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int position) {
        return produits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position + 1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = inflater.inflate(R.layout.activity_produit_list, null);

        TextView idpd = convertView.findViewById(R.id.idp);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView nbrIngredients = convertView.findViewById(R.id.nbrIngredients);
        ImageView photo = convertView.findViewById(R.id.icon);
        TextView temps = convertView.findViewById(R.id.dureeT);
        //TextView detailsIngred = convertView.findViewById(R.id.detailsIngred);
        //TextView description = convertView.findViewById(R.id.description);
        //TextView preparation = convertView.findViewById(R.id.preparation);

        idpd.setText(produits.get(position).getId()+"");
        nom.setText(produits.get(position).getNom());
        nbrIngredients.setText(produits.get(position).getNbrIngredients()+"");
        photo.setImageResource(produits.get(position).getPhoto());
        temps.setText(produits.get(position).getDuree());
        //detailsIngred.setText(produits.get(position).getDetailsIngred());
        //description.setText(produits.get(position).getDescription());
        //preparation.setText(produits.get(position).getPreparation());

        return convertView;
    }
}
