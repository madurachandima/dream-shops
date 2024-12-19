package com.madura.dreamshops.service.image;

import com.madura.dreamshops.dto.ImageDto;
import com.madura.dreamshops.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);

    void deleteImageById(Long id);

    List<ImageDto> saveImage(List<MultipartFile> files, Long imageId);

    void updateImage(MultipartFile file, Long imageId);
}
