package com.myblog3.payload;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private long id;
    private String title;
    private String description;
    private String content;
}
