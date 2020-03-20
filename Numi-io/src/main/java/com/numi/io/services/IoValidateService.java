package com.numi.io.services;

import com.numi.io.json.Body;
import com.numi.io.json.Root;
import com.numi.io.message.Message;

import java.util.List;

public interface IoValidateService {

    void validate(Message message, Root json) throws Exception;
}
