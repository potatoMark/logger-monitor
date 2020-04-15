package com.numi.io.server.services;

import com.numi.io.common.json.Root;
import com.numi.io.common.message.Message;

public interface IoValidateService {

    void validate(Message message, Root json) throws Exception;
}
