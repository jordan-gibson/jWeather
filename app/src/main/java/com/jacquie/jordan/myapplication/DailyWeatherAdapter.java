package com.jacquie.jordan.myapplication;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jordan on 4/17/2017.
 */

public class DailyWeatherAdapter extends RecyclerView.Adapter<DailyWeatherAdapter.WeatherViewHolder> {
    List<Weather> mWeathers;

    DailyWeatherAdapter(List<Weather> weathers){
        mWeathers = weathers;
    }

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup viewGroup,int i){
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.current_weather_card,viewGroup,false);
        return new WeatherViewHolder(v);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder weatherViewHolder,int i){
        weatherViewHolder.mWeatherSummaryTextView.setText(mWeathers.get(i).getWeatherSummary());
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount(){
        return mWeathers.size();
    }

    public static class WeatherViewHolder extends RecyclerView.ViewHolder{
        CardView mCardView;
        TextView mWeatherSummaryTextView;

        WeatherViewHolder(View itemView){
            super(itemView);
            mCardView = (CardView)itemView.findViewById(R.id.current_weather_cardView);
            mWeatherSummaryTextView = (TextView)itemView.findViewById(R.id.current_weather_summary_textView);
        }
    }
}
