package com.example.lucene.service.impl;

import com.example.lucene.domain.File;
import com.example.lucene.repository.FileRespority;
import com.example.lucene.service.FileService;
import com.example.lucene.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Greated by Terry on 2019/4/16
 * Time: 14:53
 */
@Service
public class FileServiceImpl implements FileService{

    @Autowired
    private FileRespority fileRespority;


    @Override
    public File creat(File file) {
       fileRespority.save(file);
        return file;
    }

    @Override
    public void delete(int id) {
    fileRespority.deleteById(id);
    }
}
