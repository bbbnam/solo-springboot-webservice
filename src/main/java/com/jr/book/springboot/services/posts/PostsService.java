package com.jr.book.springboot.services.posts;

import com.jr.book.springboot.domain.posts.PostsRepository;
import com.jr.book.springboot.web.dto.PostsResponseDto;
import com.jr.book.springboot.web.dto.PostsSaveRequestDto;
import com.jr.book.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity())
                              .getId();
    }

    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        return postsRepository.save(requestDto.)
    }

    public PostsResponseDto findById(Long id) {
    }
}
