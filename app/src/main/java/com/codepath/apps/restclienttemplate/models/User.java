package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

/**
 * Created by mariadeangelis on 6/26/17.
 */

@Parcel
public class User {

    // list the attributes

    public String name;
    public long uid;
    public String screenName;
    public String profileImageUrl;

    public String tagLine;
    public int followers;
    public int following;

    // deserialize the JSON
    public static User fromJSON(JSONObject jsonObject) throws JSONException {
        User user = new User();

        // extract the values from JSON
        user.name = jsonObject.getString("name");
        user.uid = jsonObject.getLong("id");
        user.screenName = jsonObject.getString("screen_name");
        user.profileImageUrl = jsonObject.getString("profile_image_url");

        user.tagLine = jsonObject.getString("description");
        user.followers = jsonObject.getInt("followers_count");
        user.followers = jsonObject.getInt("followers_count");
        user.following = jsonObject.getInt("friends_count");
        return user;
    }

    public long getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getTagLine() {
        return tagLine;
    }

    public int getFollowers() {
        return followers;
    }

    public int getFollowing() {
        return following;
    }
}

