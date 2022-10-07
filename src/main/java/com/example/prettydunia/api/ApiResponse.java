package com.example.prettydunia.api;

import lombok.Value;


public record ApiResponse(Boolean success, String message) {
}
