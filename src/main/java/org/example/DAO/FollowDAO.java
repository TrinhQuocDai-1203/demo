package org.example.DAO;

import org.example.entity.User;

import java.util.List;

public interface FollowDAO {
    void follow(User follower, User following);
    void unfollow(User follower, User following);
    List<User> findFollowing(User user);
    List<User> findFollowers(User user);
}