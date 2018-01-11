package com.example.myapplication;

/**
 * Created by admin on 1/11/18.
 */

public interface MainContract {

    interface View {
        void showLoading();
        void hideLoading();
        void showResult(String result);
        void showBalance(String balance);
    }

    interface Presenter {
        void getBalance();
        void getResult();
    }

}
