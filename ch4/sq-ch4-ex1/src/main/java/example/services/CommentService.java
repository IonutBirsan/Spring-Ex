package example.services;

import example.model.Comment;
import example.proxies.CommentNotificationProxy;
import example.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class CommentService {

    private CommentRepository commentRepository;

    private CommentNotificationProxy commentNotificationProxy;

    public CommentService(
            CommentRepository commentRepository,
            CommentNotificationProxy commentNotificationProxy) {

        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
