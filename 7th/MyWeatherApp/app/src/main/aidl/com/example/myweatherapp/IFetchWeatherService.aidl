// IFetchWeatherService.aidl
package com.example.myweatherapp;

// Declare any non-default types here with import statements
import com.example.myweatherapp.IFetchDataListener;

interface IFetchWeatherService {
    void retrieveWeatherData();
    void registerFetchDataListener(IFetchDataListener listener);
    void unregisterFetchDataListener(IFetchDataListener listener);
}
