package com.metahospital.datacollector.controller.dto;

import com.metahospital.datacollector.common.BookingInfo;
import lombok.Data;

@Data
public class AddAppointmentReqDto extends BaseDto {
    private int dossierId;
    private BookingInfo bookingInfo;
}
