package solution.dev.androideatit.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import solution.dev.androideatit.Listener.ItemClickListenerCustom;
import solution.dev.androideatit.R;

public class FoodViewHolder extends RecyclerView.ViewHolder {

	public ImageView imgFood;
	public TextView tvNameFood;
	public ItemClickListenerCustom mListener;

	public FoodViewHolder(View itemView) {
		super(itemView);
		imgFood = (ImageView) itemView.findViewById(R.id.image_food);
		tvNameFood = (TextView) itemView.findViewById(R.id.name_food);

		itemView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				mListener.onItemClick(view, getAdapterPosition(), false);
			}
		});
	}

	public void setListener(ItemClickListenerCustom listener) {
		this.mListener = listener;
	}
}
