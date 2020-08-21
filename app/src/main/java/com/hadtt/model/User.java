package com.hadtt.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.hadtt.BR;

public class User extends BaseObservable {
    private String userName;
    private String password;
    private boolean check;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.password);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);

    }

    @Bindable
    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
        notifyPropertyChanged(BR.check);
    }
}
