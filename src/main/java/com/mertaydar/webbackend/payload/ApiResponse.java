package com.mertaydar.webbackend.payload;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ApiResponse {
	
	@NonNull
    private Boolean success;
    
	@NonNull
    private String message;

}