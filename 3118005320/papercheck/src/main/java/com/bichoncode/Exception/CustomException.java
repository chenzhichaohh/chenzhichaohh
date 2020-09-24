package com.bichoncode.Exception;

/**
 * @author BichonCode
 * @mail chenzhichaohh@163.com
 * @create 2020/09/24
 */
public class CustomException extends RuntimeException {

    private String message;

    public CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
