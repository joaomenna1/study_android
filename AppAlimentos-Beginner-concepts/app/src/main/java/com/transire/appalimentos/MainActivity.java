package com.transire.appalimentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.transire.appalimentos.adapter.FoodAdpter;
import com.transire.appalimentos.business.FoodBusiness;
import com.transire.appalimentos.constants.FoodConstants;
import com.transire.appalimentos.interfaces.OnListClick;
import com.transire.appalimentos.model.FoodEntity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<FoodEntity> list = new FoodBusiness().getList();

        // 1 - obeter a recycker view
        this.mViewHolder.mRecyclerView = findViewById(R.id.recycler_food);

        OnListClick FoodListener = new OnListClick() {
            @Override
            public void onClick(int id) {
                Bundle bundle = new Bundle();
                bundle.putInt(FoodConstants.FOOD_ID, id);

                Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        };
        //2 - definir um adapter
        FoodAdpter adapter = new FoodAdpter(list, FoodListener);
        this.mViewHolder.mRecyclerView.setAdapter(adapter);
        // 3 - definir um layout
        this.mViewHolder.mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    // Mapeamento de interface
    private static class ViewHolder {
        RecyclerView mRecyclerView;
    }
}