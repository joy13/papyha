package com.minutetale.browse.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.minutetale.browse.domain.model.Readlist;
import com.minutetale.papyha.R;

import java.util.List;

import com.bumptech.glide.Glide;

/**
 * Created by jBhattacharya on 02/02/17.
 */

public class BrowseReadlistsAdapter extends RecyclerView.Adapter<BrowseReadlistsAdapter.ReadlistViewHolder> {

    private Context mContext;
    private List<Readlist> readlists;

    public static class ReadlistViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView description;
        public ImageView readlistArt;

        public ReadlistViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            description = (TextView) view.findViewById(R.id.description);
            readlistArt = (ImageView) view.findViewById(R.id.readlist_art);
        }
    }

    public BrowseReadlistsAdapter(Context mContext, List<Readlist> readlists) {
        this.mContext = mContext;
        this.readlists = readlists;
    }

    @Override
    public BrowseReadlistsAdapter.ReadlistViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.readlist_card, parent, false);

        return new ReadlistViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ReadlistViewHolder holder, int position) {
        Readlist readlist = readlists.get(position);
        holder.name.setText(readlist.getName());
        holder.description.setText(readlist.getDescription());

        // loading album cover using Glide library
        Glide.with(mContext).load(readlist.getArtPath()).into(holder.readlistArt);
    }

    @Override
    public int getItemCount() {
        return readlists.size();
    }
}
