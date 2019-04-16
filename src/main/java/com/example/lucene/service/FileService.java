package com.example.lucene.service;

import com.example.lucene.domain.File;

/**
 * Greated by Terry on 2019/4/16
 * Time: 14:49
 */
public interface FileService {

    File creat(File file);

    void delete(int id);


}
