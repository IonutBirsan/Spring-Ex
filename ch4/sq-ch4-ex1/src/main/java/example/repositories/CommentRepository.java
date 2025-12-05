package example.repositories;

import example.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
