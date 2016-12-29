package com.example.hanks.callbacktest;

/**
 * Created by Hanks on 2016/12/29.
 */

public class Hello {

    public HelloCallBack _helloCallBack;

    public Hello(HelloCallBack helloCallBack){
        this._helloCallBack = helloCallBack;
    }

    public void speak(){
        //回傳內容
        _helloCallBack.success(""+(int)(Math.random()*42+1));
    }
}
