package com.tiange.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * @author zdq
 * 创建时间： 2020/5/8 16:04
 */
public class AAA {
    public static int A = 1;

    public static int B = 2;


    public  int getSum() {
        return (A + B);
    }

    public void sumResult(Context context){

        Toast.makeText(context,"A + B  =" +getSum(),Toast.LENGTH_SHORT).show();
    }
}
