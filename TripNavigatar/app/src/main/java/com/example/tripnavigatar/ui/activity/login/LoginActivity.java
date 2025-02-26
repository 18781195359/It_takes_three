package com.example.tripnavigatar.ui.activity.login;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.example.tripnavigatar.R;
import com.example.tripnavigatar.tools.CommonTool;

public class LoginActivity extends com.example.tripnavigatar.base.BaseActivity implements View.OnClickListener {

    private EditText edit_phone;
    private EditText edit_pass;

    /**
     * 初始化佈局
     * @return View
     */
    @Override
    public int initLayout() {
        return R.layout.activity_login;
    }

    /**
     * 獲得佈局内部組件名稱：賬號-密碼
     * 設置登錄和注冊的點擊事件
     */
    @Override
    protected void initView() {
        edit_phone = findViewById(R.id.edit_phone);
        edit_pass = findViewById(R.id.edit_pass);
        findViewById(R.id.but_ok1).setOnClickListener(this);
        findViewById(R.id.but_regist).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        /**
         * 登錄
         */
        if (view.getId() == R.id.but_ok1) {
            /**
             * 調用該類中的登陸函數
             */
            login();
        } else if (view.getId() == R.id.but_regist) {
            /**
             * 跳到注冊頁面
             */
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        }
    }

    public void login() {
        /**
         * 獲得名稱 loginName
         */
        String loginName = edit_phone.getText().toString().trim();
        /**
         * 獲得密碼 loginPwd
         */
        String loginPwd = edit_pass.getText().toString().trim();

        /**
         * 名稱判斷是否爲空
         */
        if (TextUtils.isEmpty(loginName)) {
            CommonTool.showToast("请输入账号");
            return;
        }

        /**
         * 密碼判斷爲空
         */
        if (TextUtils.isEmpty(loginPwd)) {
            CommonTool.showToast("请输入密码");
            return;
        }
        /**
         *
         */
//        HttpParams params = new HttpParams();
//        params.put("account", loginName);
//        params.put("password", loginPwd);
//        params.put("type",1);

        //login(params);


    }

    @Override
    protected void initData() {

    }

    /**
     * 判斷是否可以完成登錄(涉及網絡知識）
     * @param params
     */
//    private void login(HttpParams params) {
//        HttpTool.postObject(UrlConfig.LOGIN_URL0, params, UserResonseBean.class, new HttpTool.HttpListener() {
//            @Override
//            public void onComplected(Object... result) {
//                UserResonseBean bean = (UserResonseBean) result[0];
//                Constants.userBean = bean.data;
//                /**
//                 * 識別成功完成登錄，跳轉界面 MainActivity
//                 */
//                if (bean.code == 0) {
//                    CommonTool.spPutString("isLogin", "1");
//                    CommonTool.spPutString("userbean", new Gson().toJson(Constants.userBean));
//                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//                    startActivity(intent);
//                    /**
//                     * 結束界面
//                     */
//                    finish();
//                } else {
//                    CommonTool.showToast(bean.msg);
//                }
//            }
//
//            @Override
//            public void onFailed(String msg) {
//                CommonTool.showToast(msg);
//            }
//        });
//    }

}