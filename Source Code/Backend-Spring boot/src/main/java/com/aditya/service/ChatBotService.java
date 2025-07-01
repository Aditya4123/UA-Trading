package com.aditya.service;

import com.aditya.model.CoinDTO;
import com.aditya.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
