package dio.web.api.handler;

import java.util.Date;

//tratamento e execoes
public class ResponseError {
    private Date timestamp =new Date();
    private String status ="Error";
    private int statusCode = 400;
    private String error;

    //getters and setters

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
