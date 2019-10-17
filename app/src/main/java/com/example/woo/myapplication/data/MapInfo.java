package com.example.woo.myapplication.data;

import android.os.Parcel;
import android.os.Parcelable;


import java.io.Serializable;

public class MapInfo implements Serializable {

    private String m_id;
    private String p_id;
    private String m_owner;
    private String m_status;     // 현재 수색작업 현황(시작전/수색중/수색완료...등등)
    private String m_horizontal;
    private String m_vertical;
    private String m_rotation;   // 지도 기울기
    private String m_place_string;    // 실종위치 주소
    private String m_place_latitude;
    private String m_place_longitude;
    private String m_center_point_latitude;    // 지도 중심점
    private String m_center_point_longitude;
    private String m_up;
    private String m_down;
    private String m_left;
    private String m_right;
    private String m_unit_scale;

    public String getM_id() {
        return m_id;
    }

    public void setM_id(String m_id) {
        this.m_id = m_id;
    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getM_owner() {
        return m_owner;
    }

    public void setM_owner(String m_owner) {
        this.m_owner = m_owner;
    }

    public String getM_status() {
        return m_status;
    }

    public void setM_status(String m_status) {
        this.m_status = m_status;
    }

    public String getM_horizontal() {
        return m_horizontal;
    }

    public void setM_horizontal(String m_horizontal) {
        this.m_horizontal = m_horizontal;
    }

    public String getM_vertical() {
        return m_vertical;
    }

    public void setM_vertical(String m_vertical) {
        this.m_vertical = m_vertical;
    }

    public String getM_rotation() {
        return m_rotation;
    }

    public void setM_rotation(String m_rotation) {
        this.m_rotation = m_rotation;
    }

    public String getM_place_string() {
        return m_place_string;
    }

    public void setM_place_string(String m_place_string) {
        this.m_place_string = m_place_string;
    }

    public String getM_place_latitude() {
        return m_place_latitude;
    }

    public void setM_place_latitude(String m_place_latitude) {
        this.m_place_latitude = m_place_latitude;
    }

    public String getM_place_longitude() {
        return m_place_longitude;
    }

    public void setM_place_longitude(String m_place_longitude) {
        this.m_place_longitude = m_place_longitude;
    }

    public String getM_center_point_latitude() {
        return m_center_point_latitude;
    }

    public void setM_center_point_latitude(String m_center_point_latitude) {
        this.m_center_point_latitude = m_center_point_latitude;
    }

    public String getM_center_point_longitude() {
        return m_center_point_longitude;
    }

    public void setM_center_point_longitude(String m_center_point_longitude) {
        this.m_center_point_longitude = m_center_point_longitude;
    }

    public String getM_up() {
        return m_up;
    }

    public void setM_up(String m_up) {
        this.m_up = m_up;
    }

    public String getM_down() {
        return m_down;
    }

    public void setM_down(String m_down) {
        this.m_down = m_down;
    }

    public String getM_left() {
        return m_left;
    }

    public void setM_left(String m_left) {
        this.m_left = m_left;
    }

    public String getM_right() {
        return m_right;
    }

    public void setM_right(String m_right) {
        this.m_right = m_right;
    }

    public String getM_unit_scale() {
        return m_unit_scale;
    }

    public void setM_unit_scale(String m_unit_scale) {
        this.m_unit_scale = m_unit_scale;
    }
}


   /* public static final Parcelable.Creator<MapInfo> CREATOR = new Parcelable.Creator<MapInfo>(){

        @Override
        public MapInfo createFromParcel(Parcel source) {
            return new MapInfo(source);
        }

        @Override
        public MapInfo[] newArray(int size) {
            return new MapInfo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.m_id);
        dest.writeInt(this.p_id);
        dest.writeString(this.password);
        dest.writeInt(this.owner_id);
        dest.writeInt(this.status);
        dest.writeInt(this.horizontal);
        dest.writeInt(this.vertical);
        dest.writeDouble(this.bearing);
        dest.writeString(this.missing_address);
        dest.writeDouble(this.missing_lat);
        dest.writeDouble(missing_lng);
        dest.writeDouble(this.center_lat);
        dest.writeDouble(this.center_lng);
        dest.writeDouble(this.up_height);
        dest.writeDouble(this.down_height);
        dest.writeDouble(this.left_width);
        dest.writeDouble(this.right_width);
        dest.writeDouble(this.unit_scale);
    }*/

