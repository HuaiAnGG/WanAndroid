package org.huaiangg.wanandroid.frags.home.adapter;

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
import org.huaiangg.wanandroid.frags.home.HomeArticleBean;

/**
 * @description: 首页 -->> 文章适配器
 * @author: HuaiAngg
 * @create: 2019-07-28 14:18
 */
public class HomeArticleAdapter
        extends RecyclerView.Adapter<HomeArticleAdapter.HomeArticleViewHolder> {

    private HomeArticleBean articleBean;

    public HomeArticleAdapter(HomeArticleBean articleBean) {
        this.articleBean = articleBean;
    }

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
        holder.articleAuthor.setText(articleBean.getData().getDatas().get(position).getAuthor());
        holder.articleTitle.setText(articleBean.getData().getDatas().get(position).getTitle());
        holder.articleTags.setText(articleBean.getData().getDatas().get(position).getSuperChapterName());
        String temp = articleBean.getData().getDatas().get(position).getDesc();
        if (temp.isEmpty()) {
            holder.articleDes.setText(articleBean.getData().getDatas().get(position).getTitle());
        }else{
            holder.articleDes.setText(temp);
        }
        holder.articleUpdateTime.setText(articleBean.getData().getDatas().get(position).getNiceDate());
    }

    @Override
    public int getItemCount() {
        return articleBean != null ? articleBean.getData().getSize() : 0;
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
