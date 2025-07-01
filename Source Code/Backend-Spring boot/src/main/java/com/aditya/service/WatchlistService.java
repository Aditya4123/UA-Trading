package com.aditya.service;

import com.aditya.model.Coin;
import com.aditya.model.User;
import com.aditya.model.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchlist(Long userId) throws Exception;

    Watchlist createWatchList(User user);

    Watchlist findById(Long id) throws Exception;

    Coin addItemToWatchlist(Coin coin,User user) throws Exception;
}
