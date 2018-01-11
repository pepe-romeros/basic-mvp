package com.example.myapplication;

public class MainPresenter implements MainContract.Presenter {

    MainContract.View mainView;
    MyDummieModel myDummieModel;

    public MainPresenter(MainContract.View mainView) {
        this.mainView = mainView; // binding of the one to one relationship
        myDummieModel = new MyDummieModel();
    }

    @Override
    public void getBalance() {
        mainView.showLoading();
        // will get balance
        String balance = myDummieModel.getBalance();
        mainView.showBalance(balance);
        mainView.hideLoading();
    }

    @Override
    public void getResult() {
        mainView.showLoading();
        String result = myDummieModel.getResult();
        mainView.showResult(result);
        mainView.hideLoading();
    }

}
