package com.myblog.myblog14.service;

import com.myblog.myblog14.payload.PostDto;
import com.myblog.myblog14.service.impl.PostServiceImpl;

public interface PostService {
    PostDto createPost(PostDto postDto);
}