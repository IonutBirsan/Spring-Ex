package example.proxies;

import example.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
