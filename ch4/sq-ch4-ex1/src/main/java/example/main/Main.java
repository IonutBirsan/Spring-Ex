package example.main;

import example.model.Comment;
import example.proxies.EmailCommentNotificationProxy;
import example.repositories.DBCommentRepository;
import example.services.CommentService;

public class Main {

    public static void main(String[] args) {
        var commentRepository =
                new DBCommentRepository();
        var commentNotificationProxy =
                new EmailCommentNotificationProxy();

        var commentService =
                new CommentService(
                        commentRepository, commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        commentService.publishComment(comment);
    }
}