package com.sparta.newsfeed.comment.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;


@Data
@Builder
public class CommentRequestDto {
    String content;
}
