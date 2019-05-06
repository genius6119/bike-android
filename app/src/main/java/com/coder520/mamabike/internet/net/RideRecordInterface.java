package com.coder520.mamabike.internet.net;

import com.coder520.mamabike.entity.ResponseEntityVo;
import com.coder520.mamabike.entity.vo.RideRecordItem;
import com.coder520.mamabike.entity.vo.RideRecordRodeVo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by zhongyanli on 17/9/2.
 */

public interface RideRecordInterface {
    @POST("rideRecord/contrail/{recordNo}")
    Call<ResponseEntityVo<RideRecordRodeVo>> getRideRecord(@Path("recordNo") String recordNumber);
    @POST("rideRecord/list/{id}")
    Call<ResponseEntityVo<List<RideRecordItem>>> getRideRecordList(@Path("id") Long id);
}
