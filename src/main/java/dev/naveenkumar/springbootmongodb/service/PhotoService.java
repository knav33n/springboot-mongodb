package dev.naveenkumar.springbootmongodb.service;

import dev.naveenkumar.springbootmongodb.collection.Photo;
import org.springframework.web.multipart.MultipartFile;

public interface PhotoService {
    String addPhoto(String originalFilename, MultipartFile image);

    Photo getPhoto(String id);
}
