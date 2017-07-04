package com.example.administrator.ordermonan;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 03/07/2017.
 */

public class MyArrayAdapter extends ArrayAdapter<BanhCanh> {

    Activity context = null;// Là nơi mà ArrayList sẽ hiển thị ra màn hình.
    int myLayout;// Chính là my_layout.xml.
    ArrayList<BanhCanh> myArray = null;// Danh sách gọi món truyền từ MainActivity.

    // Constructor này dùng để khởi tạo các giá trị từ MainActivity truyền vào.
    public MyArrayAdapter(Activity context, int myLayout, ArrayList<BanhCanh> myArray) {
        super(context, myLayout, myArray);
        this.context = context;
        this.myLayout = myLayout;
        this.myArray = myArray;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Không rõ hiểu lắm.
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(myLayout, null);
        if (myArray.size() > 0 && position >= 0) {
            // Kiểm tra số được chọn trong Spinner để có hình phù hợp.
            equalSpinnerWithDrawable(convertView);
            // Đưa nội dung từ CheckBox và RadioButton lên tv_content.
            BanhCanh bc = myArray.get(position);// Lấy nội dung ở vị trí thứ position trong ListView.
            TextView tv_content = (TextView) convertView.findViewById(R.id.tv_content);
            tv_content.setText(bc.toString());// Hiển thị bc lên ListView.
        }
        return convertView;
    }

    private void equalSpinnerWithDrawable(View view) {
        // Link id from activity_main.xml.
        Spinner spn_Ban = (Spinner) view.findViewById(R.id.spn_Ban);
        // Đang tìm hiểu.
        int number = (int) spn_Ban.getSelectedItem();

        ImageView img_number = (ImageView) view.findViewById(R.id.img_number);
        if (number == R.drawable.mot) {
            img_number.setImageResource(R.drawable.mot);
        }
        if (number == R.drawable.hai) {
            img_number.setImageResource(R.drawable.hai);
        }
        if (number == R.drawable.ba) {
            img_number.setImageResource(R.drawable.ba);
        }
        if (number == R.drawable.bon) {
            img_number.setImageResource(R.drawable.bon);
        }
        if (number == R.drawable.nam) {
            img_number.setImageResource(R.drawable.nam);
        }
        if (number == R.drawable.sau) {
            img_number.setImageResource(R.drawable.sau);
        }
        if (number == R.drawable.bay) {
            img_number.setImageResource(R.drawable.bay);
        }
        if (number == R.drawable.tam) {
            img_number.setImageResource(R.drawable.tam);
        }
        if (number == R.drawable.chin) {
            img_number.setImageResource(R.drawable.chin);
        }
        if (number == R.drawable.muoi) {
            img_number.setImageResource(R.drawable.muoi);
        }
        if (number == R.drawable.muoimot) {
            img_number.setImageResource(R.drawable.muoimot);
        }
    }
}
