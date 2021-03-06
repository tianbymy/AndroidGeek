package com.xiaomai.geek.contract.password;

import android.support.annotation.NonNull;

import com.xiaomai.geek.data.module.Password;
import com.xiaomai.geek.presenter.BasePresenter;
import com.xiaomai.mvp.lce.ILceView;

/**
 * Created by xiaomai on 2017/10/26.
 */

public interface AddEditPasswordContract {

    interface View extends ILceView<Password> {
        void onSaveSuccess();
        void onUpdateSuccess(@NonNull Password password);
    }

    abstract class Presenter extends BasePresenter<View> {

        public abstract void savePassword(@NonNull Password password);

        public abstract void updatePassword(@NonNull Password password);
    }
}
