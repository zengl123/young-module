package com.young.service.hystrix;

import com.young.model.dto.oss.*;
import com.young.service.OpcOssFeignApi;
import com.young.wrapper.Wrapper;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 16:30
 * @UpdateUser:
 * @UpdateDate:2019/5/17 16:30
 * @UpdateRemark:
 * @Version:
 */
@Component
public class OpcOssFeignApiHystrix implements OpcOssFeignApi {
    @Override
    public Wrapper<OptUploadFileRespDto> uploadFile(final OptUploadFileReqDto optUploadFileReqDto) {
        return null;
    }

    @Override
    public Wrapper<String> getFileUrl(final OptGetUrlRequest optGetUrlRequest) {
        return null;
    }

    @Override
    public Wrapper<List<ElementImgUrlDto>> listFileUrl(final OptBatchGetUrlRequest urlRequest) {
        return null;
    }

    @Override
    public Wrapper<OptUploadFileRespDto> handleFileUpload(final MultipartFile file) {
        return null;
    }

    @Override
    public void deleteExpireFile() {

    }
}
