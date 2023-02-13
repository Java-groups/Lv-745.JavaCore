package homework1;

public enum HTTPError {
    BAD_REQUEST("Bad Request", 400),
    UNAUTHORIZED("Unauthorized", 401),
    PAYMENT_REQUIRED ("Payment Required", 402),
    FORBIDDEN ("Forbidden",403),
    NOT_FOUND ("Page not found",404),
    METHOD_NOT_ALLOWED ("Method not allowed",405),
    NOT_ACCEPTABLE ("Not Acceptable",406),
    PROXY_AUTHENTICATION_REQUIRED("Proxy Authentication Required",407),
    REQUEST_TIMEOUT ("Request Timeout",408),
    CONFLICT ("Conflict",409),
    GONE ("Gone",410);

    private String displayName;
    private int ErrorCode;

    HTTPError(String displayName, int ErrorCode){
        this.displayName = displayName;
        this.ErrorCode = ErrorCode;
    }

    public String getDisplayName (){
        return displayName;
    }

    public int getErrorCode (){
        return ErrorCode;
    }

}
