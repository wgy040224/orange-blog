package com.sqnugy.orangeblog.admin.service;

import com.sqnugy.orangeblog.common.utils.Response;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName AdminFileService
 * @description
 * @date 2024-12-11
 */

public interface AdminFileService {
    /**
     * 上传文件
     * @param file
     * @return
     */
    Response uploadFile(MultipartFile file);
}

