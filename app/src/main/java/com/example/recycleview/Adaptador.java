package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.Viewholder> {

    private List<Persona> personaList;
    public Adaptador(List<Persona> personaList) {
        this.personaList = personaList;
    }

    @NonNull
    @Override
    public Adaptador.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vistaPersona= LayoutInflater.from(parent.getContext()).inflate(R.layout.items_layout,parent,false);
        return new Viewholder(vistaPersona);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        int Resource = personaList.get(position).getImagen();
        String cont=personaList.get(position).getTexto();
        Button bot=personaList.get(position).getBoton();
        holder.setData(Resource,cont);

    }

    @Override
    public int getItemCount() {
        return personaList.size();
    }

    public static class Viewholder extends RecyclerView.ViewHolder {

        private final ImageView imagen;
        private final Button boton;
        private final TextView texto;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imagen=itemView.findViewById(R.id.imageView);
            boton=itemView.findViewById(R.id.btn1);
            texto=itemView.findViewById(R.id.contenido);
        }
        public void setData(int imageResources,String contenido){
            imagen.setImageResource(imageResources);
            texto.setText(contenido);
        }
    }
}
