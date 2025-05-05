package com.example.ecommerceBackend.service;

import com.example.ecommerceBackend.model.Img;
import com.example.ecommerceBackend.repository.ImgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImgService {

    @Autowired
    private ImgRepository imgRepository;

    public List<Img> getAllImgs() {
        return imgRepository.findAll();
    }

    public Optional<Img> getImgById(Long id) {
        return imgRepository.findById(id);
    }

    public Img saveImg(Img img) {
        return imgRepository.save(img);
    }

    public void deleteImg(Long id) {
        imgRepository.deleteById(id);
    }
}