package com.curious.tiger.firebase_support;

import android.text.TextUtils;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by bkang016 on 2/8/17.
 */

public final class FirebaseManager {

    /**
     * @param path the format is suppsed to be "/room/$messageId/content"
     * @return
     */
    public static DatabaseReference parse(String path) {
        if (TextUtils.isEmpty(path)) {
            return null;
        }

        String[] items = path.split("/");

        DatabaseReference head = PrivateFactory.mFirebase;
        for (String item : items) {
            head = head.child(item);
        }

        return head;

    }


    /**
     * @param ref
     * @return will return the relative path string
     */
    public static String getRelativePath(DatabaseReference ref) {
        int prefixLength = PrivateFactory.mFirebase.toString().length();

        return ref.toString().substring(prefixLength);

    }


    private static class PrivateFactory {
        public static final DatabaseReference mFirebase =
                FirebaseDatabase.getInstance().getReference();
    }

}
