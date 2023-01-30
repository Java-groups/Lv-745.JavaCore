public enum HTTPError {
    BAD_REQUEST("Bad Request"),
    UNAUTHORIZED("Unauthorized"),
    PAYMENT_REQUIRED ("Payment Required"),
    FORBIDDEN ("Forbidden"),
    NOT_FOUND ("Page not found"),
    METHOD_NOT_ALLOWED ("Method not allowed"),
    NOT_ACCEPTABLE ("Not Acceptable"),
    PROXY_AUTHENTICATION_REQUIRED("Proxy Authentication Required"),
    REQUEST_TIMEOUT ("Request Timeout"),
    CONFLICT ("Conflict"),
    GONE ("Gone");

    private final String description;

    HTTPError(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }


}