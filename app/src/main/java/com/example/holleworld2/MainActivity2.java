package com.example.holleworld2;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class MainActivity2 extends AppCompatActivity {

    private String[] names = { "小猫", "哈士奇", "小黄鸭","小鹿","老虎"};
    private int[]  icons= { R.drawable.cat,
            R.drawable.siberiankusky,
            R.drawable.yellowduck,
            R.drawable.fawn,
            R.drawable.tiger};
    private String[] introduces = {
            "猫，属于猫科动物，分家猫、野猫，是全世界家庭中较为广泛的宠物。",
            "西伯利亚雪橇犬，常见别名哈士奇，昵称为二哈。",
            "鸭的体型相对较小，颈短，一些属的嘴要大些。腿位于身体后方，因而步态蹒跚。",
            "鹿科是哺乳纲偶蹄目下的一科动物。体型大小不等，为有角的反刍类。",
            "虎，大型猫科动物；毛色浅黄或棕黄色，满有黑色横纹；头圆、耳短，耳背面黑色，中央有一白斑甚显著；四肢健壮有力；尾粗长，具黑色环纹，尾端黑色。"
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        RecyclerView recyclerView = findViewById(R.id.tutu);
//        recyclerView.LayoutManager stagerLayout = new StaggeredGridLayoutManager(3,RecyclerView.VERTICAL);
//        recyclerView.setLayoutManager(stagerLayout);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        TmpAdapter adapter = new TmpAdapter();
        recyclerView.setAdapter(adapter);


    }

    class TmpAdapter extends RecyclerView.Adapter<TmpAdapter.ViewHolder>{
            @NonNull
            @Override
            public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                ViewHolder holder = new ViewHolder(
                        LayoutInflater.from(MainActivity2.this).inflate(R.layout.item_layout,parent,false));
                return holder;
            }
            @Override
            public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
                holder.iv.setImageResource(icons[position]);
                holder.name.setText(names[position]);
                holder.introduce.setText(introduces[position]);

            }
            @Override
            public int getItemCount() {
                return names.length;
            }

            class ViewHolder extends RecyclerView.ViewHolder{
                ImageView iv;
                TextView name;
                TextView introduce;
                public  ViewHolder(View view) {
                    super(view);
                    iv = view.findViewById(R.id.iv);
                    name = view.findViewById(R.id.name);
                    introduce = view.findViewById(R.id.introduce);
                }
            }

        }

}

