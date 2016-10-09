package ice.mobark.bard.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import ice.mobark.bard.loder.ImageLoader;
import ice.mobark.bard.R;

/**
 * Created by user on 12/17/2015.
 */
public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageHolder> {
    private Context context;
    private ImageLoader imageLoader;
    private int[] images;

    public ImageAdapter(Context c, int[] myImages) {
        context = c;
        images = myImages;
        imageLoader = new ImageLoader(context);
    }

    @Override
    public ImageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new ImageHolder(view);
    }

    @Override
    public void onBindViewHolder(ImageHolder holder, int position) {
        imageLoader.loadBitmap(images[position], holder.imageView);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public static class ImageHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ImageHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.iv_image);
        }
    }
}
