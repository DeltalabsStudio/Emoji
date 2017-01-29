package com.vanniktech.emoji.one.category;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;

import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.one.R;

@SuppressWarnings({"checkstyle:magicnumber", "PMD.MethodReturnsInternalArray"})
public class ObjectsCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[]{
            new Emoji(new String(new int[]{0x1f48c}, 0, 1), R.drawable.emoji_1f48c),
            new Emoji(new String(new int[]{0x1f4a3}, 0, 1), R.drawable.emoji_1f4a3),
            new Emoji(new String(new int[]{0x1f573}, 0, 1), R.drawable.emoji_1f573),
            new Emoji(new String(new int[]{0x1f6cd}, 0, 1), R.drawable.emoji_1f6cd),
            new Emoji(new String(new int[]{0x1f4ff}, 0, 1), R.drawable.emoji_1f4ff),
            new Emoji(new String(new int[]{0x1f48e}, 0, 1), R.drawable.emoji_1f48e),
            new Emoji(new String(new int[]{0x1f52a}, 0, 1), R.drawable.emoji_1f52a),
            new Emoji(new String(new int[]{0x1f3fa}, 0, 1), R.drawable.emoji_1f3fa),
            new Emoji(new String(new int[]{0x1f488}, 0, 1), R.drawable.emoji_1f488),
            new Emoji(new String(new int[]{0x1f5bc}, 0, 1), R.drawable.emoji_1f5bc),
            new Emoji(new String(new int[]{0x1f6ce}, 0, 1), R.drawable.emoji_1f6ce),
            new Emoji(new String(new int[]{0x1f6aa}, 0, 1), R.drawable.emoji_1f6aa),
            new Emoji(new String(new int[]{0x1f6cc}, 0, 1), R.drawable.emoji_1f6cc),
            new Emoji(new String(new int[]{0x1f6cf}, 0, 1), R.drawable.emoji_1f6cf),
            new Emoji(new String(new int[]{0x1f6cb}, 0, 1), R.drawable.emoji_1f6cb),
            new Emoji(new String(new int[]{0x1f6bd}, 0, 1), R.drawable.emoji_1f6bd),
            new Emoji(new String(new int[]{0x1f6bf}, 0, 1), R.drawable.emoji_1f6bf),
            new Emoji(new String(new int[]{0x1f6c0}, 0, 1), R.drawable.emoji_1f6c0),
            new Emoji(new String(new int[]{0x1f6c0, 0x1f3fb}, 0, 2), R.drawable.emoji_1f6c0_1f3fb),
            new Emoji(new String(new int[]{0x1f6c0, 0x1f3fc}, 0, 2), R.drawable.emoji_1f6c0_1f3fc),
            new Emoji(new String(new int[]{0x1f6c0, 0x1f3fd}, 0, 2), R.drawable.emoji_1f6c0_1f3fd),
            new Emoji(new String(new int[]{0x1f6c0, 0x1f3fe}, 0, 2), R.drawable.emoji_1f6c0_1f3fe),
            new Emoji(new String(new int[]{0x1f6c0, 0x1f3ff}, 0, 2), R.drawable.emoji_1f6c0_1f3ff),
            new Emoji(new String(new int[]{0x1f6c1}, 0, 1), R.drawable.emoji_1f6c1),
            new Emoji(new String(new int[]{0x231b}, 0, 1), R.drawable.emoji_231b),
            new Emoji(new String(new int[]{0x23f3}, 0, 1), R.drawable.emoji_23f3),
            new Emoji(new String(new int[]{0x231a}, 0, 1), R.drawable.emoji_231a),
            new Emoji(new String(new int[]{0x23f0}, 0, 1), R.drawable.emoji_23f0),
            new Emoji(new String(new int[]{0x23f1}, 0, 1), R.drawable.emoji_23f1),
            new Emoji(new String(new int[]{0x23f2}, 0, 1), R.drawable.emoji_23f2),
            new Emoji(new String(new int[]{0x1f570}, 0, 1), R.drawable.emoji_1f570),
            new Emoji(new String(new int[]{0x1f321}, 0, 1), R.drawable.emoji_1f321),
            new Emoji(new String(new int[]{0x1f388}, 0, 1), R.drawable.emoji_1f388),
            new Emoji(new String(new int[]{0x1f389}, 0, 1), R.drawable.emoji_1f389),
            new Emoji(new String(new int[]{0x1f38a}, 0, 1), R.drawable.emoji_1f38a),
            new Emoji(new String(new int[]{0x1f38e}, 0, 1), R.drawable.emoji_1f38e),
            new Emoji(new String(new int[]{0x1f38f}, 0, 1), R.drawable.emoji_1f38f),
            new Emoji(new String(new int[]{0x1f390}, 0, 1), R.drawable.emoji_1f390),
            new Emoji(new String(new int[]{0x1f380}, 0, 1), R.drawable.emoji_1f380),
            new Emoji(new String(new int[]{0x1f381}, 0, 1), R.drawable.emoji_1f381),
            new Emoji(new String(new int[]{0x1f579}, 0, 1), R.drawable.emoji_1f579),
            new Emoji(new String(new int[]{0x1f4ef}, 0, 1), R.drawable.emoji_1f4ef),
            new Emoji(new String(new int[]{0x1f399}, 0, 1), R.drawable.emoji_1f399),
            new Emoji(new String(new int[]{0x1f39a}, 0, 1), R.drawable.emoji_1f39a),
            new Emoji(new String(new int[]{0x1f39b}, 0, 1), R.drawable.emoji_1f39b),
            new Emoji(new String(new int[]{0x1f4fb}, 0, 1), R.drawable.emoji_1f4fb),
            new Emoji(new String(new int[]{0x1f4f1}, 0, 1), R.drawable.emoji_1f4f1),
            new Emoji(new String(new int[]{0x1f4f2}, 0, 1), R.drawable.emoji_1f4f2),
            new Emoji(new String(new int[]{0x260e}, 0, 1), R.drawable.emoji_260e),
            new Emoji(new String(new int[]{0x1f4de}, 0, 1), R.drawable.emoji_1f4de),
            new Emoji(new String(new int[]{0x1f4df}, 0, 1), R.drawable.emoji_1f4df),
            new Emoji(new String(new int[]{0x1f4e0}, 0, 1), R.drawable.emoji_1f4e0),
            new Emoji(new String(new int[]{0x1f50b}, 0, 1), R.drawable.emoji_1f50b),
            new Emoji(new String(new int[]{0x1f50c}, 0, 1), R.drawable.emoji_1f50c),
            new Emoji(new String(new int[]{0x1f4bb}, 0, 1), R.drawable.emoji_1f4bb),
            new Emoji(new String(new int[]{0x1f5a5}, 0, 1), R.drawable.emoji_1f5a5),
            new Emoji(new String(new int[]{0x1f5a8}, 0, 1), R.drawable.emoji_1f5a8),
            new Emoji(new String(new int[]{0x2328}, 0, 1), R.drawable.emoji_2328),
            new Emoji(new String(new int[]{0x1f5b1}, 0, 1), R.drawable.emoji_1f5b1),
            new Emoji(new String(new int[]{0x1f5b2}, 0, 1), R.drawable.emoji_1f5b2),
            new Emoji(new String(new int[]{0x1f4bd}, 0, 1), R.drawable.emoji_1f4bd),
            new Emoji(new String(new int[]{0x1f4be}, 0, 1), R.drawable.emoji_1f4be),
            new Emoji(new String(new int[]{0x1f4bf}, 0, 1), R.drawable.emoji_1f4bf),
            new Emoji(new String(new int[]{0x1f4c0}, 0, 1), R.drawable.emoji_1f4c0),
            new Emoji(new String(new int[]{0x1f3a5}, 0, 1), R.drawable.emoji_1f3a5),
            new Emoji(new String(new int[]{0x1f39e}, 0, 1), R.drawable.emoji_1f39e),
            new Emoji(new String(new int[]{0x1f4fd}, 0, 1), R.drawable.emoji_1f4fd),
            new Emoji(new String(new int[]{0x1f4fa}, 0, 1), R.drawable.emoji_1f4fa),
            new Emoji(new String(new int[]{0x1f4f7}, 0, 1), R.drawable.emoji_1f4f7),
            new Emoji(new String(new int[]{0x1f4f8}, 0, 1), R.drawable.emoji_1f4f8),
            new Emoji(new String(new int[]{0x1f4f9}, 0, 1), R.drawable.emoji_1f4f9),
            new Emoji(new String(new int[]{0x1f4fc}, 0, 1), R.drawable.emoji_1f4fc),
            new Emoji(new String(new int[]{0x1f50d}, 0, 1), R.drawable.emoji_1f50d),
            new Emoji(new String(new int[]{0x1f50e}, 0, 1), R.drawable.emoji_1f50e),
            new Emoji(new String(new int[]{0x1f52c}, 0, 1), R.drawable.emoji_1f52c),
            new Emoji(new String(new int[]{0x1f52d}, 0, 1), R.drawable.emoji_1f52d),
            new Emoji(new String(new int[]{0x1f4e1}, 0, 1), R.drawable.emoji_1f4e1),
            new Emoji(new String(new int[]{0x1f56f}, 0, 1), R.drawable.emoji_1f56f),
            new Emoji(new String(new int[]{0x1f4a1}, 0, 1), R.drawable.emoji_1f4a1),
            new Emoji(new String(new int[]{0x1f526}, 0, 1), R.drawable.emoji_1f526),
            new Emoji(new String(new int[]{0x1f3ee}, 0, 1), R.drawable.emoji_1f3ee),
            new Emoji(new String(new int[]{0x1f4d4}, 0, 1), R.drawable.emoji_1f4d4),
            new Emoji(new String(new int[]{0x1f4d5}, 0, 1), R.drawable.emoji_1f4d5),
            new Emoji(new String(new int[]{0x1f4d6}, 0, 1), R.drawable.emoji_1f4d6),
            new Emoji(new String(new int[]{0x1f4d7}, 0, 1), R.drawable.emoji_1f4d7),
            new Emoji(new String(new int[]{0x1f4d8}, 0, 1), R.drawable.emoji_1f4d8),
            new Emoji(new String(new int[]{0x1f4d9}, 0, 1), R.drawable.emoji_1f4d9),
            new Emoji(new String(new int[]{0x1f4da}, 0, 1), R.drawable.emoji_1f4da),
            new Emoji(new String(new int[]{0x1f4d3}, 0, 1), R.drawable.emoji_1f4d3),
            new Emoji(new String(new int[]{0x1f4d2}, 0, 1), R.drawable.emoji_1f4d2),
            new Emoji(new String(new int[]{0x1f4c3}, 0, 1), R.drawable.emoji_1f4c3),
            new Emoji(new String(new int[]{0x1f4dc}, 0, 1), R.drawable.emoji_1f4dc),
            new Emoji(new String(new int[]{0x1f4c4}, 0, 1), R.drawable.emoji_1f4c4),
            new Emoji(new String(new int[]{0x1f4f0}, 0, 1), R.drawable.emoji_1f4f0),
            new Emoji(new String(new int[]{0x1f5de}, 0, 1), R.drawable.emoji_1f5de),
            new Emoji(new String(new int[]{0x1f4d1}, 0, 1), R.drawable.emoji_1f4d1),
            new Emoji(new String(new int[]{0x1f516}, 0, 1), R.drawable.emoji_1f516),
            new Emoji(new String(new int[]{0x1f3f7}, 0, 1), R.drawable.emoji_1f3f7),
            new Emoji(new String(new int[]{0x1f4b0}, 0, 1), R.drawable.emoji_1f4b0),
            new Emoji(new String(new int[]{0x1f4b4}, 0, 1), R.drawable.emoji_1f4b4),
            new Emoji(new String(new int[]{0x1f4b5}, 0, 1), R.drawable.emoji_1f4b5),
            new Emoji(new String(new int[]{0x1f4b6}, 0, 1), R.drawable.emoji_1f4b6),
            new Emoji(new String(new int[]{0x1f4b7}, 0, 1), R.drawable.emoji_1f4b7),
            new Emoji(new String(new int[]{0x1f4b8}, 0, 1), R.drawable.emoji_1f4b8),
            new Emoji(new String(new int[]{0x1f4b3}, 0, 1), R.drawable.emoji_1f4b3),
            new Emoji(new String(new int[]{0x2709}, 0, 1), R.drawable.emoji_2709),
            new Emoji(new String(new int[]{0x1f4e7}, 0, 1), R.drawable.emoji_1f4e7),
            new Emoji(new String(new int[]{0x1f4e8}, 0, 1), R.drawable.emoji_1f4e8),
            new Emoji(new String(new int[]{0x1f4e9}, 0, 1), R.drawable.emoji_1f4e9),
            new Emoji(new String(new int[]{0x1f4e4}, 0, 1), R.drawable.emoji_1f4e4),
            new Emoji(new String(new int[]{0x1f4e5}, 0, 1), R.drawable.emoji_1f4e5),
            new Emoji(new String(new int[]{0x1f4e6}, 0, 1), R.drawable.emoji_1f4e6),
            new Emoji(new String(new int[]{0x1f4eb}, 0, 1), R.drawable.emoji_1f4eb),
            new Emoji(new String(new int[]{0x1f4ea}, 0, 1), R.drawable.emoji_1f4ea),
            new Emoji(new String(new int[]{0x1f4ec}, 0, 1), R.drawable.emoji_1f4ec),
            new Emoji(new String(new int[]{0x1f4ed}, 0, 1), R.drawable.emoji_1f4ed),
            new Emoji(new String(new int[]{0x1f4ee}, 0, 1), R.drawable.emoji_1f4ee),
            new Emoji(new String(new int[]{0x1f5f3}, 0, 1), R.drawable.emoji_1f5f3),
            new Emoji(new String(new int[]{0x270f}, 0, 1), R.drawable.emoji_270f),
            new Emoji(new String(new int[]{0x2712}, 0, 1), R.drawable.emoji_2712),
            new Emoji(new String(new int[]{0x1f58b}, 0, 1), R.drawable.emoji_1f58b),
            new Emoji(new String(new int[]{0x1f58a}, 0, 1), R.drawable.emoji_1f58a),
            new Emoji(new String(new int[]{0x1f58c}, 0, 1), R.drawable.emoji_1f58c),
            new Emoji(new String(new int[]{0x1f58d}, 0, 1), R.drawable.emoji_1f58d),
            new Emoji(new String(new int[]{0x1f4dd}, 0, 1), R.drawable.emoji_1f4dd),
            new Emoji(new String(new int[]{0x1f4c1}, 0, 1), R.drawable.emoji_1f4c1),
            new Emoji(new String(new int[]{0x1f4c2}, 0, 1), R.drawable.emoji_1f4c2),
            new Emoji(new String(new int[]{0x1f5c2}, 0, 1), R.drawable.emoji_1f5c2),
            new Emoji(new String(new int[]{0x1f4c5}, 0, 1), R.drawable.emoji_1f4c5),
            new Emoji(new String(new int[]{0x1f4c6}, 0, 1), R.drawable.emoji_1f4c6),
            new Emoji(new String(new int[]{0x1f5d2}, 0, 1), R.drawable.emoji_1f5d2),
            new Emoji(new String(new int[]{0x1f5d3}, 0, 1), R.drawable.emoji_1f5d3),
            new Emoji(new String(new int[]{0x1f4c7}, 0, 1), R.drawable.emoji_1f4c7),
            new Emoji(new String(new int[]{0x1f4c8}, 0, 1), R.drawable.emoji_1f4c8),
            new Emoji(new String(new int[]{0x1f4c9}, 0, 1), R.drawable.emoji_1f4c9),
            new Emoji(new String(new int[]{0x1f4ca}, 0, 1), R.drawable.emoji_1f4ca),
            new Emoji(new String(new int[]{0x1f4cb}, 0, 1), R.drawable.emoji_1f4cb),
            new Emoji(new String(new int[]{0x1f4cc}, 0, 1), R.drawable.emoji_1f4cc),
            new Emoji(new String(new int[]{0x1f4cd}, 0, 1), R.drawable.emoji_1f4cd),
            new Emoji(new String(new int[]{0x1f4ce}, 0, 1), R.drawable.emoji_1f4ce),
            new Emoji(new String(new int[]{0x1f587}, 0, 1), R.drawable.emoji_1f587),
            new Emoji(new String(new int[]{0x1f4cf}, 0, 1), R.drawable.emoji_1f4cf),
            new Emoji(new String(new int[]{0x1f4d0}, 0, 1), R.drawable.emoji_1f4d0),
            new Emoji(new String(new int[]{0x2702}, 0, 1), R.drawable.emoji_2702),
            new Emoji(new String(new int[]{0x1f5c3}, 0, 1), R.drawable.emoji_1f5c3),
            new Emoji(new String(new int[]{0x1f5c4}, 0, 1), R.drawable.emoji_1f5c4),
            new Emoji(new String(new int[]{0x1f5d1}, 0, 1), R.drawable.emoji_1f5d1),
            new Emoji(new String(new int[]{0x1f512}, 0, 1), R.drawable.emoji_1f512),
            new Emoji(new String(new int[]{0x1f513}, 0, 1), R.drawable.emoji_1f513),
            new Emoji(new String(new int[]{0x1f50f}, 0, 1), R.drawable.emoji_1f50f),
            new Emoji(new String(new int[]{0x1f510}, 0, 1), R.drawable.emoji_1f510),
            new Emoji(new String(new int[]{0x1f511}, 0, 1), R.drawable.emoji_1f511),
            new Emoji(new String(new int[]{0x1f5dd}, 0, 1), R.drawable.emoji_1f5dd),
            new Emoji(new String(new int[]{0x1f528}, 0, 1), R.drawable.emoji_1f528),
            new Emoji(new String(new int[]{0x26cf}, 0, 1), R.drawable.emoji_26cf),
            new Emoji(new String(new int[]{0x2692}, 0, 1), R.drawable.emoji_2692),
            new Emoji(new String(new int[]{0x1f6e0}, 0, 1), R.drawable.emoji_1f6e0),
            new Emoji(new String(new int[]{0x1f5e1}, 0, 1), R.drawable.emoji_1f5e1),
            new Emoji(new String(new int[]{0x2694}, 0, 1), R.drawable.emoji_2694),
            new Emoji(new String(new int[]{0x1f52b}, 0, 1), R.drawable.emoji_1f52b),
            new Emoji(new String(new int[]{0x1f6e1}, 0, 1), R.drawable.emoji_1f6e1),
            new Emoji(new String(new int[]{0x1f527}, 0, 1), R.drawable.emoji_1f527),
            new Emoji(new String(new int[]{0x1f529}, 0, 1), R.drawable.emoji_1f529),
            new Emoji(new String(new int[]{0x2699}, 0, 1), R.drawable.emoji_2699),
            new Emoji(new String(new int[]{0x1f5dc}, 0, 1), R.drawable.emoji_1f5dc),
            new Emoji(new String(new int[]{0x2697}, 0, 1), R.drawable.emoji_2697),
            new Emoji(new String(new int[]{0x2696}, 0, 1), R.drawable.emoji_2696),
            new Emoji(new String(new int[]{0x1f517}, 0, 1), R.drawable.emoji_1f517),
            new Emoji(new String(new int[]{0x26d3}, 0, 1), R.drawable.emoji_26d3),
            new Emoji(new String(new int[]{0x1f489}, 0, 1), R.drawable.emoji_1f489),
            new Emoji(new String(new int[]{0x1f48a}, 0, 1), R.drawable.emoji_1f48a),
            new Emoji(new String(new int[]{0x1f6ac}, 0, 1), R.drawable.emoji_1f6ac),
            new Emoji(new String(new int[]{0x26b0}, 0, 1), R.drawable.emoji_26b0),
            new Emoji(new String(new int[]{0x26b1}, 0, 1), R.drawable.emoji_26b1),
            new Emoji(new String(new int[]{0x1f6e2}, 0, 1), R.drawable.emoji_1f6e2),
            new Emoji(new String(new int[]{0x1f52e}, 0, 1), R.drawable.emoji_1f52e),
            new Emoji(new String(new int[]{0x1f6d2}, 0, 1), R.drawable.emoji_1f6d2),
            new Emoji(new String(new int[]{0x1f6b0}, 0, 1), R.drawable.emoji_1f6b0)
    };

    @Override
    @NonNull
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override
    @DrawableRes
    public int getIcon() {
        return R.drawable.emoji_category_objects;
    }
}