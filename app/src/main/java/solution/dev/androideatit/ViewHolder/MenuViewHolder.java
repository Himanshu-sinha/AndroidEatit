package solution.dev.androideatit.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import solution.dev.androideatit.Listener.ItemClickListenerCustom;
import solution.dev.androideatit.R;

public class MenuViewHolder extends RecyclerView.ViewHolder {

	public ImageView imgMenu;
	public TextView tvNameMenu;
	public ItemClickListenerCustom mListener;

	public MenuViewHolder(View itemView) {
		super(itemView);
		imgMenu = (ImageView) itemView.findViewById(R.id.menu_image);
		tvNameMenu = (TextView) itemView.findViewById(R.id.menu_name);

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
