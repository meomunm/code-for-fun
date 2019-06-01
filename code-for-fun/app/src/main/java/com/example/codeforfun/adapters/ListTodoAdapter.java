package com.example.codeforfun.adapters;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.codeforfun.R;
import com.example.codeforfun.models.TodoModel;
import com.example.codeforfun.utils.Constance;
import com.example.codeforfun.utils.Util;

import java.util.List;

public class ListTodoAdapter extends RecyclerView.Adapter<ListTodoAdapter.ViewHolder> {
    private Activity activity;
    private List<TodoModel> todoModelList;

    public ListTodoAdapter(Activity activity, List<TodoModel> todoModelList) {
        this.activity = activity;
        this.todoModelList = todoModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(activity).inflate(R.layout.item_recyclerview_list_todo, parent, false);
            return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData(todoModelList.get(position));
    }

    @Override
    public int getItemCount() {
        return (todoModelList == null) ? 0 : todoModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View vColorTodo;
        TextView tvTimeTodo;
        TextView tvDescriptionTodo;
        ImageView ivBellTodo;
        CheckBox cbDoneTodo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            initView(itemView);
            listener();
        }

        private void initView(View v){
            vColorTodo = v.findViewById(R.id.v_color_todo);
            tvTimeTodo = v.findViewById(R.id.tv_time_todo);
            tvDescriptionTodo = v.findViewById(R.id.tv_description_todo);
            ivBellTodo = v.findViewById(R.id.iv_bell_todo);
            cbDoneTodo = v.findViewById(R.id.cb_done_todo);
        }

        private void listener(){
            ivBellTodo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ivBellTodo.setPressed(!v.isActivated());
                }
            });
        }

        private void setData(TodoModel model){
            vColorTodo.setBackgroundColor(Color.parseColor(model.getTagModel().getColor()));
            tvTimeTodo.setText(Util.formatDateToTime(model.getDate(), Constance.time));
            tvDescriptionTodo.setText(model.getDescription());
        }
    }
}
