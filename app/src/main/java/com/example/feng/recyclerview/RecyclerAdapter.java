package com.example.feng.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Feng on 2017/5/27.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    private List<Recycler> recyclerList;

    public RecyclerAdapter(List<Recycler> recyclerList){
        this.recyclerList=recyclerList;

    }

    static class ViewHolder extends RecyclerView.ViewHolder {
       ImageView recyclerImg;
        TextView recyclerName;
        public ViewHolder(View itemView) {
            super(itemView);
            recyclerImg= (ImageView) itemView.findViewById(R.id.recycler_img);
            recyclerName= (TextView) itemView.findViewById(R.id.recycler_name);
        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Recycler recycler=recyclerList.get(position);
        holder.recyclerImg.setImageResource(recycler.getImgId());
        holder.recyclerName.setText(recycler.getName());
    }

    @Override
    public int getItemCount() {

        return recyclerList.size();
    }

}
