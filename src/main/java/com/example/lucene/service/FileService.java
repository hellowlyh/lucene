package com.example.lucene.service;


import com.example.lucene.domain.uploadfile;

/**
 * Greated by Terry on 2019/4/16
 * Time: 14:49
 */
public interface FileService {

    uploadfile creat(uploadfile file);

    void delete(int id);


}
