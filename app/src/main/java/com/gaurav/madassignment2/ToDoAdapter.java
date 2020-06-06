package com.gaurav.madassignment2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.MyViewHolder> {
    private Context context;
    private List<PhoneClass> toDoList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, description, dueDate;
        public RelativeLayout viewBackground;
        public CardView viewForeground;

        public MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.header);
            description = view.findViewById(R.id.description);
            dueDate = view.findViewById(R.id.due_date);
            viewBackground = view.findViewById(R.id.view_background);
            viewForeground = view.findViewById(R.id.view_foreground);
        }
    }


    public ToDoAdapter(Context context, List<PhoneClass> toDoList) {
        this.context = context;
        this.toDoList = toDoList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.to_do_item_adapter, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final PhoneClass item = toDoList.get(position);
        holder.name.setText(item.getName());
        holder.description.setText(item.getDescription());
        holder.dueDate.setText(item.getPrice());

    }

    @Override
    public int getItemCount() {
        return toDoList.size();
    }

    public void removeItem(int position) {
        toDoList.remove(position);
        notifyItemRemoved(position);
    }

    public void restoreItem(PhoneClass item, int position) {
        toDoList.add(position, item);
        notifyItemInserted(position);
    }
}
