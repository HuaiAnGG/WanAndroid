package org.huaiangg.wanandroid.frags.home.adapter;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.huaiangg.wanandroid.R;
import org.huaiangg.wanandroid.frags.home.HomeFragment;
import org.huaiangg.wanandroid.frags.home.ItemOnClickLister;
import org.huaiangg.wanandroid.frags.home.bean.HomeArticleBean;

import java.util.List;

/**
 * @description: 首页 -->> 文章适配器
 * @author: HuaiAngg
 * @create: 2019-07-28 14:18
 */
public class HomeArticleAdapter
        extends RecyclerView.Adapter<HomeArticleAdapter.HomeArticleViewHolder> {

    private List<HomeArticleBean.DataBean.dataList> dataListList;
    private ItemOnClickLister onItemClickListener;

    public HomeArticleAdapter(List<HomeArticleBean.DataBean.dataList> data) {
        this.dataListList = data;
    }

    public void setOnItemClickListener(ItemOnClickLister onItemClickListener ){
        this. onItemClickListener=onItemClickListener;
    }

    @TargetApi(Build.VERSION_CODES.M)
    @NonNull
    @Override
    public HomeArticleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new HomeArticleViewHolder(
                LayoutInflater.from(HomeFragment.getInstance().getContext())
                        .inflate(R.layout.rv_item_home_article, viewGroup, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull HomeArticleViewHolder holder, int position) {
        // 固定值
        holder.articleAuthorAvatar.setImageResource(R.drawable.default_portrait);
        holder.articleAuthor.setText(dataListList.get(position).getAuthor());
        holder.articleTitle.setText(dataListList.get(position).getTitle());
        holder.articleTags.setText(dataListList.get(position).getSuperChapterName());
        String temp = dataListList.get(position).getDesc();
        if (temp.isEmpty()) {
            holder.articleDes.setText(dataListList.get(position).getTitle());
        }else{
            holder.articleDes.setText(temp);
        }
        holder.articleUpdateTime.setText(dataListList.get(position).getNiceDate());

        if (onItemClickListener != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemClickListener.onClick(position);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return dataListList != null ? dataListList.size() : 0;
    }

    class HomeArticleViewHolder extends RecyclerView.ViewHolder {

        private CardView cardItem;
        private ImageView articleAuthorAvatar;
        private TextView articleAuthor;
        private TextView articleTags;
        private TextView articleTitle;
        private TextView articleDes;
        private TextView articleUpdateTime;

        HomeArticleViewHolder(@NonNull View view) {
            super(view);
            cardItem = view.findViewById(R.id.cv_item);
            articleAuthorAvatar = view.findViewById(R.id.article_author_avatar);
            articleAuthor = view.findViewById(R.id.article_author);
            articleTags = view.findViewById(R.id.article_tags);
            articleTitle = view.findViewById(R.id.article_title);
            articleDes = view.findViewById(R.id.article_des);
            articleUpdateTime = view.findViewById(R.id.article_update_time);
        }
    }
}
